import java.util.*;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int num = sc.nextInt();
        System.out.println("Output: ");
        int sum = 1;
        printfactorial(num, sum);
    }

    static void printfactorial(int num, int sum) {
        if (num == 0) {
            System.out.println("Factoral of a number : " + sum);
            return;
        }
        printfactorial(num - 1, sum * num);

    }
}