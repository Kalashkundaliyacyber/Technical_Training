import java.util.*;

public class Palindrome_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int num = sc.nextInt();
        int newNum = 0;
        System.err.println("Output");

        if (printpalindrome(num, newNum) == num) {
            System.err.println(num + " is a palindrome number");
        } else {
            System.err.println(num + " is not a palindrome number");
        }
    }

    static int printpalindrome(int num, int newNum) {

        if (num == 0) {
            return newNum;
        } else {
            newNum = (newNum * 10) + (num % 10);
            return printpalindrome(num / 10, newNum);
        }
    }
}
