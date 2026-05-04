public class q47B_rey2 {        // Kora Hoy nai
    public static void main(String[] args) {
        Student s1 = new Student("Alice", "CSE110");

        System.out.println("1.===========");
        s1.viewDetails();

        System.out.println("2.===========");
        s1.setMark(88.5);

        System.out.println("3.===========");
        s1.setMark(110.0);

        System.out.println("4.===========");
        s1.setMark(-10.5);

        System.out.println("5.===========");
        s1.viewDetails();
    }
}


/*

marks attribute should be private

Alice enrolled in CSE110
1.===========
Alice 
Course: CSE110 
Marks: 0.0
2.===========
setMark(): Successfully updated marks to 88.5
3.===========
setMark(): 110.0 is invalid! Marks must be between 0 and 100
4.===========
setMark(): -10.5 is invalid! Marks cannot be negative
5.===========
Alice
Course: CSE110
Marks: 88.5

 */