import java.util.*;

public class Palindrome_using_boolean {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int num = sc.nextInt();
        System.err.println("Output");

        if (printpalindrome(num)) {
            System.err.println(num + " is a palindrome number");
        } else {
            System.err.println(num + " is not a palindrome number");
        }

    }

    static boolean printpalindrome(int num) {

        int newNum = checkpalindrome(num, 0);
        if (num == newNum) {
            return true;
        } else {
            return false;
        }

    }

    static int checkpalindrome(int num, int newNum) {
        if (num == 0) {
            return newNum;
        } else {
            newNum = (newNum * 10) + (num % 10);
            return checkpalindrome(num / 10, newNum);
        }
    }
}