import java.util.*;

public class count_number_of_0 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a digit : ");
        int range = sc.nextInt();
        int count = 0;
        System.out.println("Output : ");
        count(range, count);
    }

    static void count(int range, int count) {
        if (range == 0) {
            System.out.println("Number of 0's in a digit : " + count);
        } else {
            int i = range % 10;
            if (i == 0) {
                count++;
            }
            count(range / 10, count);
        }
    }

}
