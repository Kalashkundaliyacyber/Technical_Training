import java.util.*;

public class rope_cut {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the rope: ");
        int length = sc.nextInt();
        System.out.println("How many cuts should be made in the 1st option : ");
        int cut1 = sc.nextInt();
        System.out.println("How many cuts should be made in the 2nd option : ");
        int cut2 = sc.nextInt();
        System.out.println("How many cuts should be made in the 3rd option : ");
        int cut3 = sc.nextInt();
        System.out.println("Length option are " + cut1 + " and " + cut2 + " and " + cut3);
        int result = getLength(length, cut1, cut2, cut3);
        System.out.println("Output");
        System.out.println("Maximum number cut in the rope : " + result);

    }

    static int getLength(int length, int a, int b, int c) {
        if (length == 0) {
            return 0;
        }
        if (length < 0) {
            return -1;
        }
        int first = getLength(length - a, a, b, c);
        int second = getLength(length - b, a, b, c);
        int third = getLength(length - c, a, b, c);
        int fin = Math.max(Math.max(first, second), third);
        if (fin < 0) {
            return -1;
        }
        return fin + 1;
    }
}
