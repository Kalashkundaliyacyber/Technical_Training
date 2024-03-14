import java.util.*;

public class count_even_and_odd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range : ");
        int range = sc.nextInt();
        int ce = 0; // count even number in a range
        int co = 0; // count odd number in a range
        System.err.println("Output : ");
        count(range, ce, co);
    }

    static void count(int range, int ce, int co) {
        if (range == 0) {
            System.err.println("Total number of even digit : " + ce);
            System.out.println("Total number of odd digit : " + co);
            return;
        } else {
            if (range % 2 == 0) {
                System.out.println(range + " Given number is even");
                ce++;
            } else {
                System.out.println(range + " Given number is odd ");
                co++;
            }
            count(range - 1, ce, co);
        }
    }
}
