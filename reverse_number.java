import java.util.*;
public class reverse_number {
    public static void main (String [] args)
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a number ");
        int num = sc.nextInt();
        int  reverse = 0 ;
        int temp ;
        while (num !=0)
        {
            temp = num %10;
            reverse = (reverse*10) + temp ;
            num /=10;
        }
        System.out.println(reverse);
    }
}
