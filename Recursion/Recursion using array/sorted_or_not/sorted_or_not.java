import java.util.*;

public class sorted_or_not {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int length = sc.nextInt();
        int[] arr = inputarray(length);

        System.out.println("Output");

        sorted(arr, 0, length, 0);
    }

    static int[] inputarray(int length) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[length];
        for (int i = 0; i < length; i++) {
            System.out.printf("Enter the " + (i + 1) + " elements in a array : ");
            arr[i] = sc.nextInt();
        }
        return arr;

    }

    static void sorted(int[] arr, int index, int length, int count) {
        if (index == length - 1) {
            if (count == length - 1) {
                System.out.println("Given array is sorted ");
            } else {
                System.out.println("Given array is not sorted ");
            }

        } else {
            if (arr[index] < arr[index + 1]) {
                count++;
            }
            sorted(arr, index + 1, length, count);
        }
    }

}
