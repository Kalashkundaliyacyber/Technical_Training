import java.util.*;

public class search_element_and_occurance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int length = sc.nextInt();
        int[] arr = inputarray(length);
        System.out.printf("Enter the search element : ");
        int search = sc.nextInt();
        System.out.println("Output");

        printsearch(arr, 0, length, search, 0);
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

    static void printsearch(int[] arr, int index, int length, int search, int count) {
        if (index == length) {
            if (count == 0) {
                System.out.println(search + " not present in array ");
            } else {
                System.out.println(search + " is present at array ");
                System.out.println("number of times it occurred : " + count);
            }
        } else {
            if (arr[index] == search) {
                count++;

            }
            printsearch(arr, index + 1, length, search, count);
        }
    }
}
