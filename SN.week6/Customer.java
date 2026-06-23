package iut.week6;
public class Customer {
    public static void main(String[] args) {
        MovieTicketCounter m = new MovieTicketCounter();
        m.purchase(2, 4);
        m.purchase(1, 2, 1);
        m.purchase(3);
    }
}

class MovieTicketCounter {
    private int ticketPrice = 300;
    private int popcornPrice = 120;
    private int drinkPrice = 50;

    MovieTicketCounter() {
        System.out.println("Welcome to MovieTicket Counter");
    }

    void purchase(int tickets, int drinks) {
        System.out.println("You purchased " + tickets + " tickets, " + drinks + " drinks");

        int total = tickets * ticketPrice + drinks * drinkPrice;
        System.out.println("Total bill: " + total + " taka");
    }

    void purchase(int tickets, int drinks, int pop){
        System.out.println("You purchased " + tickets + " tickets, " + drinks + " drinks, "
                            + pop + " popcorns");
        int total = tickets * ticketPrice + drinks * drinkPrice + pop * popcornPrice;
        System.out.println("Total bill: " + total + " taka");
    }
    void purchase(int tickets){
        System.out.println("You purchased " + tickets + " tickets");

        int total = tickets * ticketPrice;
        System.out.println("Total bill: " + total + " taka");
    }
}