import java.util.*;

public class sum_of_number_in_a_range {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range ");
        int range = sc.nextInt();
        System.out.println("Output :");
        int sum = 0;
        printsum(range, sum);
    }

    static void printsum(int range, int sum) {
        if (range == 0) {
            System.out.println(sum);
        } else {
            sum = sum + range;
            printsum(range - 1, sum);
        }
    }
}
