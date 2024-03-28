import java.util.*;

public class print_number_in_a_sequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        System.err.println("Output : ");
        print(n);
    }

    static void print(int n) {
        if (n == 0) {
            return;
        } else {
            print(n / 10);
            System.out.println(n % 10);
        }
    }

}
