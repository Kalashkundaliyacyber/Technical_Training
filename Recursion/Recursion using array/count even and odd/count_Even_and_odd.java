import java.util.*;

public class count_Even_and_odd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.println("Enter a range ");
        int num = sc.nextInt();
        int[] arr = new int[2];
        System.out.println("Output");
        int[] newarr = count(num, arr);
        System.out.println("Number of Even digit in range " + newarr[0]);

        System.out.println("Number of odd digit in range " + newarr[1]);

    }

    static int[] count(int num, int[] arr) {
        if (num == 0) {
            return arr;
        }
        if (num % 2 == 0) {
            arr[0]++;
        } else {
            arr[1]++;
        }
        return count(num - 1, arr);

    }
}
