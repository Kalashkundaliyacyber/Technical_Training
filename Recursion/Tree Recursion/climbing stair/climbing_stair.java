import java.util.*;

public class climbing_stair {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of stairs : ");
        int num = sc.nextInt();
        System.out.println("Output");
        int result = count(num);
        System.out.println("we can take only 1 or 2 step at a time ");
        System.out.println("Number of ways to climb the stair : " + result);

    }

    static int count(int num) {
        if (num <= 1) {

            return 1;
        }
        int count1 = count(num - 1);
        int count2 = count(num - 2);
        return count1 + count2;
    }
}
