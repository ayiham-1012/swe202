class Product {
    public static int count;
    public String name;
    public int price;
    public Product(String n, int p) {
        name = n;
        price = p;
    }
    public void details() {
        System.out.println("Name: "+name);
        System.out.println("Price: "+price);
    }
}


public class q66_kni36 {
public static void main(String args[]) {
        Book b1 = new Book("Harry Potter", 23456859, 300);
        System.out.println("1-------------");
        b1.details();
        System.out.println("2-------------");
        b1.updateIsbn(23456857);
        System.out.println("3-------------");
        b1.details();
        System.out.println("4-------------");
        EBook sb1 = new EBook("The Little Prince", 2345346, 400, false);
        sb1.details();
        System.out.println("5-------------");
        sb1.updateIsbn(23453469);
        System.out.println("6-------------");
        sb1.details();
    }
}


/*

Introducing: MultiLevel Inheritance

1-------------
Name: Harry Potter
Price: 300
ISBN Number: 23456859
2-------------
ISBN Updated!
3-------------
Name: Harry Potter
Price: 300
ISBN Number: 23456857
4-------------
Name: The Little Prince
Price: 400
ISBN Number: 2345346
Download Link Available?:
false
5-------------
ISBN Updated!
6-------------
Name: The Little Prince
Download Link Available?:
false
Price: 400
ISBN Number: 23453469

 */