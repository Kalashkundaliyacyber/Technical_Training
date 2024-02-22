import java.util.*;
import java.util.Scanner;
public class Pattern4 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int num = sc.nextInt();
        int i,j;
        int n = 2 * num - 2;
        System.out.println("Output: ");
        for (i = num; i > 0; i--) {
            for (j = 0; j < num - i; j++) {
                System.out.print(" ");
            }
            n = n - 2;
            for (j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
}
}