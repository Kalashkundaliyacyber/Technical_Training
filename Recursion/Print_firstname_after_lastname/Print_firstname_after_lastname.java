import java.util.*;

public class Print_firstname_after_lastname {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first name ");
        String first_name = sc.next();
        System.out.println("Enter the last name ");
        String last_name = sc.next();
        System.out.println("How many time u want to print the first name then last name");
        int time = sc.nextInt();
        System.err.println("Output : ");
        printname(first_name, last_name, time);
    }

    static void printname(String first_name, String last_name, int time) {
        if (time == 0) {
            return;
        } else {
            System.out.println(first_name);
            printname(first_name, last_name, time - 1);
            System.out.println(last_name);
        }
    }
}
