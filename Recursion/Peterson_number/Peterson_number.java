import java.util.*;

public class Peterson_number {
    static int peterson(int num, int sum) {
        if (num == 0) {
            return sum;
        } else {

            // ld = last digit
            int ld = num % 10;
            // fv = factorial value
            int fv = factorial_of_value(ld);
            sum = sum + fv;
            return peterson(num / 10, sum);
        }
    }

    static int factorial_of_value(int ld) {

        if (ld == 1) {
            return ld;
        } else {

            return ld * factorial_of_value(ld - 1);
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int num = sc.nextInt();
        int sum = 0;

        int result = peterson(num, sum);
        System.err.println("Output");
        System.out.println(result);
        if (num == result) {
            System.out.println(num + " is a peterson number ");
        } else {
            System.out.println(num + " is not a peterson number ");
        }
    }
}
