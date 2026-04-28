public class Student{
    String name = "Unknown Person";
    int age = 0;
    int id = 0;

    Student(){}
    Student(String n, int a, int i){
        name = n;
        age = a; 
        id = i;
    }
    Student (String n, int i){
        name = n;
        id = i;
    }
    Student (int a, int i){
        age = a;
        id = i;
    }
    Student (int a, String n){
        name = n;
        age= a;
    }
}
class Course {
    String name = "Unknown";
    String code = "Unknown";

    Course(){}
    Course(String n){
        name = n;
    }
    Course(String n, String c){
        name = n;
        code = c;
    }
}
class Grade {
    int attend;
    int quiz;
    int mid;
    int fin;
}