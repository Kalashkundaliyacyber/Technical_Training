import java.util.*;

public class Armstrong_number {
    static int length(int num) {
        if (num == 0) {
            return 0;
        }
        return length(num / 10) + 1;
    }

    static int power_of_value(int num, int power) {
        if (power == 0) {
            return 1;
        } else {
            return power_of_value(num, power - 1) * num;
        }
    }

    static int armstrong(int num, int len, int sum) {
        if (num == 0) {
            return sum;
        } else {
            // ld = last digit
            int ld = num % 10;
            // pv = powervalue
            int pv = power_of_value(ld, len);
            sum = sum + pv;
            return armstrong(num / 10, len, sum);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int num = sc.nextInt();
        int sum = 0;
        int len = length(num);
        int result = armstrong(num, len, sum);
        System.out.println(result);
        if (num == result) {
            System.out.println(num + " is a armstrong number");
        } else {
            System.out.println(num + " is not a armstrong number");
        }
    }
}
