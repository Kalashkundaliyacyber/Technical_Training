import java.util.*;
public class decimal_to_binary {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.err.println("Enter a Decimal number : ");
        int num = sc.nextInt();
        System.err.println("Output");
        System.err.println("Binary number : ");
        printbinary(num);
    }
    static void printbinary(int num )
    {
        if (num == 0)
        {
            return;
        }
        int var;
        var = num%2;
        printbinary(num/2);
        System.out.print(var);
    }
}
