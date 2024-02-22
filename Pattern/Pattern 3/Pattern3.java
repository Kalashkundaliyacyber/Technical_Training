import java.util.*;
import java.util.Scanner;

public class Pattern3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int num = sc.nextInt();
        int i, j;
        for (i = num; i >= 1; i--) {
            for (j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for (j = 0; j <= num - i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
