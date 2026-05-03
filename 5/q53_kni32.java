public class q53_kni32 {        // Kora Hoy Nai
    public static void main(String args []){
        System.out.println("Total Student: "+Student.studentCount);
        System.out.println("1------------");
        Student s1 = new Student("Ali", 34);
        System.out.println("2------------");
        s1.info();
        System.out.println("3------------");
        Student s2 = new Student("Afia", 45);
        System.out.println("4------------");
        s2.info();
        System.out.println("5------------");
        Student s3 = new Student ("Afroza", 64);
        System.out.println("6------------");
        s3.info();
        System.out.println("7------------");
        System.out.println("Total Student: "+Student.studentCount);
    }
}

/*

Total Student: 0
1------------
A student is created!
2------------
Name: Ali
ID: 34
3------------
A student is created!
4------------
Name: Afia
ID: 45
5------------
A student is created!
6------------
Name: Afroza
ID: 64
7------------
Total Student: 3

 */