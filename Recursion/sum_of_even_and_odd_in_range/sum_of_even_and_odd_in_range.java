import java.util.*;

public class sum_of_even_and_odd_in_range {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range : ");
        int range = sc.nextInt();
        System.out.println("Output");
        int se = 0; // Sum of even number in range
        int so = 0; // Sum of odd number in range
        sum(range, se, so);
    }

    static void sum(int range, int se, int so) {
        if (range == 0) {
            System.err.println("Sum of even digit in a range: " + se);
            System.out.println("Sum of odd digit in a range: " + so);
            return;
        } else {
            if (range % 2 == 0) {
                se += range;
            } else {
                so += range;
            }
            sum(range - 1, se, so);
        }

    }
}
