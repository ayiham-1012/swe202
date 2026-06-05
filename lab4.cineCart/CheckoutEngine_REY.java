package engine;

import data.ConcessionMenu;
import data.ShowtimeBoard;
import model.*;



public class CheckoutEngine {
    private ShowtimeBoard board;
    private ConcessionMenu menu;

    public CheckoutEngine(ShowtimeBoard board, ConcessionMenu menu) {
        this.board = board;
        this.menu = menu;
    }

    //Booking Flow

    public String bookTicket(Cart cart, int showtimeId, int row, int col){
        Showtime showtime = board.findById(showtimeId);
        if(showtime == null) return "Showtime not found";

        int age = cart.getOwner().getAge();
        int req_age = showtime.getMovie().getMinAge();
        if(age < req_age) {
            String rating = showtime.getMovie().getRating();
            String message = "Underage for rating <"+rating+">";
            return message;
        }

        Seat seat = showtime.getHall().getSeat(row, col);
        if(seat.isBooked()) return "Seat unavailable";

        Movie movie = showtime.getMovie();
        double price = movie.getBasePrice() *
                (seat.isPremium() ? 1.30 : 1.00) *
                (showtime.isPeak() ? 1.20 : 1.00);

        seat.book();
        Ticket ticket = new Ticket(showtime, row, col, price);

        cart.addTicket(ticket);

        return "OK";
    }

    public String addConcession(Cart cart, String code, int qty){
        ConcessionItem item = menu.findByCode(code);
        if(item == null) return "Item not found";
        if(qty <= 0) return "Invalid quantity";

        cart.addItem(item, qty);
        return "OK";
    }

    //Checkout Pipeline

    // 1. Do not use fancy version of loop / "For Each Loop" / the one showed in class
    // 2. Change "%lf" inside String.format function
        // 1. Ticket.toString()
        // 2. ConsessionItem.toString()
    // 3. Hall.availCount variable should be private

    public double checkout(Cart cart){
        double ticketSubtotal = cart.sumTicketsPaid();
        double concessionSubtotal = cart.sumConcessionsRaw();

        ConcessionItem[] items = cart.getItems();
        boolean pop = false;
        boolean soda = false;

        for (int i = 0; i < cart.getItemCount(); i++) {
            ConcessionItem k = items[i];

            if (k.getCode().equals("POP")) pop = true;
            if (k.getCode().equals("SODA")) soda = true;
        }

        double combo = (pop && soda) ? 50.0 : 0.0;

        double preDiscount = ticketSubtotal + concessionSubtotal - combo;

        double group = cart.getTicketCount() >= 4 ? 0.10 * preDiscount : 0;

        double tier = cart.getOwner().getTierDiscount() * preDiscount;

        double afterDiscounts = preDiscount - group - tier;

        double tax = 0.05 * afterDiscounts;

        double rounded = Math.round((afterDiscounts + tax) * 100);
        rounded /= 100;

        return rounded;
    }

    public String getReceipt(Cart cart){

        Ticket[] tickets = cart.getTickets();
        ConcessionItem[] items = cart.getItems();

        double total = cart.sumTicketsPaid() + cart.sumConcessionsRaw();
        String out = "";
            out += "Reveipt : \n";
            out += "Customer Name: " + cart.getOwner().getName() + "\n";

        for (int i = 0; i < cart.getTicketCount(); i++) {
            Ticket k = tickets[i];
            out += k.toString();
        }

        for (int i = 0; i < cart.getItemCount(); i++) {
            ConcessionItem k = items[i];
            out += k.toString();
        }

        out += "Total: " +
                String.format("%.2f", total) + " BDT \n Discount: " +
                String.format("%.2f", checkout(cart) - total) + " BDT";
        return out;
    }
}