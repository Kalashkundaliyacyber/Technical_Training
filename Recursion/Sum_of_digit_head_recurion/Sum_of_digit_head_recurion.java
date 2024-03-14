import java.util.*;

public class Sum_of_digit_head_recurion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number ");
        int num = sc.nextInt();
        System.out.println("Output: ");
        int sum = 0;
        System.out.println("Sum of digit " + printsum(num, sum));
    }

    static int printsum(int num, int sum) {
        if (num == 0) {
            return sum;
        } else {

            sum += num % 10;
            return printsum(num / 10, sum);
        }
    }

}
