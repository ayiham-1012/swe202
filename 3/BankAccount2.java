public class BankAccount2 
{
    int ac = 0;
    String type = "Not Set";

    BankAccount2() {}

    // Overrides the default, because of different parameters
    BankAccount2(int a, String t) {
        ac = a;
        type = t;
    }

    public void printDetails() {
        System.out.println("Account No: " + ac);
        System.out.println("Type: " + type);
    }
}
