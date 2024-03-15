import java.util.*;

public class Table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number which u want to generate a table");
        int num = sc.nextInt();
        System.out.println("Output");
        printtable(num, 10);
    }

    static void printtable(int num, int count) {
        if (count == 0) {
            return;
        }
        printtable(num, count - 1);
        System.out.println(num + " X " + count + " = " + count * num);
    }
}
