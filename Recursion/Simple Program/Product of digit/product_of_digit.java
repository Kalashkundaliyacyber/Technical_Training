import java.util.*;

public class product_of_digit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your digit: ");
        int digit = sc.nextInt();
        System.out.println("Output: ");
        product(digit, 1);
    }

    static void product(int digit, int num) {
        if (digit < 1) {
            System.out.println(num);

        } else {
            product(digit / 10, num * (digit % 10));
        }

    }
}
