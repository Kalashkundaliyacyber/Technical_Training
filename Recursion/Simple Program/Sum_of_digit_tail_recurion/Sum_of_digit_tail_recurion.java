import java.util.*;

public class Sum_of_digit_tail_recurion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number ");
        int num = sc.nextInt();
        System.out.println("Output: ");
        int sum = 0;
        System.err.println("output: ");
        printsum(num, sum);
    }

    static void printsum(int num, int sum) {
        if (num == 0) {
            System.err.println("Sum of digit " + sum);
            return;
        } else {
            sum += num % 10;
            printsum(num / 10, sum);
        }

    }
}
