public class q61B_a6c2 {
    public static void main(String [] args){
        SWEStudent b1 = new SWEStudent();
        SWEStudent b2 = new SWEStudent("REY");
        SWEStudent b3 = new SWEStudent("Miya");
        b1.details();
        System.out.println("1---------------");
        b2.details();
        System.out.println("2---------------");
        b3.details();
    }
}


public class Student {
    private String name = "Just a Student";
    private String department = "no idea";
    public void setDepartment(String dpt) {
        this.department = dpt;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void details() {
        System.out.println("Name : " + name + " Department: " + department);
    }
}


/*

Name: idk Department: SWE
1---------------
Name: REY Department: SWE
2---------------
Name: Miya Department: SWE

 */