import java.util.*;

public class Power_numer_using_Recursion {
    static int power_of_value (int num , int power)
    {
        if (power ==0)
        {
            return 1;
        }
        else 
        {
           return power_of_value(num, power-1)*num;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number ");
        int num = sc.nextInt();
        System.out.println("Enter a power number  ");
        int power = sc.nextInt();
        System.out.println("Output");
        System.out.println( power_of_value(num , power));
    }

}
