import java.util.*;
public class Fibonacci_series {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a Fibonacci series number to print");
        int num = sc.nextInt();
        System.out.println("Output");
        int result = printfibo(num);
        System.out.println(result);
    }
    static int printfibo(int n)
    {
        if (n<=1)
        {
            return n;
        }
        int first_term = printfibo(n-1);
        int second_term =printfibo(n-2);
        return first_term + second_term;
    }
}
