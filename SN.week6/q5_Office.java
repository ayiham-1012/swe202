package iut.week6;

class Employee {
    static int bonus = 1000;
    int salary = 20000;
}

public class q5_Office {
    public static void main(String[] args) {
        Employee emp1 = new Employee();
        Employee emp2 = new Employee();

        emp1.bonus = 1500;
        emp1.salary = 25000;

        System.out.println(emp2.bonus);
        System.out.println(emp2.salary);
        System.out.println("Amount: " + 5 + 10);
        System.out.println('B' + 3);
    }
}


/*

A = 65

1500
20000
Amount: 510
69

*/