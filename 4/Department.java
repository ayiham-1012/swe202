public class Department {
    String name;
    int studs;

    Department(String n, int c) {
        name = n;
        studs = c;
    }
    public void mergeStudents(Department d){
        System.out.println("Students of "+d.name+" are merged with students of "+name);
        studs += d.studs;
    }
    public void info() {
        System.out.println("Name: " + name);
        System.out.println("Total Students: " + studs);
    }
    public void addStudents(int arr[]){
        for(int i = 0; i < arr.length; i++){
            studs += arr[i];
            arr[i] = 0;
        }
    }
}
