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



public class q65_kni35 {
    public static void main(String[] args) {
        Book b1 = new Book("Harry Potter", 23456859, 300);
        System.out.println("1-------------");
        b1.details();
        System.out.println("2-------------");
        Chocolate c1 = new Chocolate("Cadbury Silk", 350, "12/12/24", "12/12/25");
        c1.details();
        System.out.println("3-------------");
        Book b2 = new Book("Hamlet", 37991797, 500);
        b2.details();
        System.out.println("4-------------");
        c1.addNewFlavour("Fruit & Nut");
        System.out.println("5-------------");
        c1.details();
    }
}


/*

Introducing: @override

1-------------
Name: Harry Potter
Price: 300
ISBN Number: 23456859
2-------------
Name: Cadbury Silk
Price: 350
MFG Date: 12/12/24
EXP Date: 12/12/25
3-------------
Name: Hamlet
Price: 500
ISBN Number: 37991797
4-------------
Cadbury Silk is now Cadbury Silk
Fruit & Nut
5-------------
Name: Cadbury Silk Fruit & Nut
Price: 350
MFG Date: 12/12/24
EXP Date: 12/12/25

 */