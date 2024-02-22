import java.util.Scanner;

public class swap_first_and_last_number
{
    public  static void main (String [] args)
    {   
         Scanner sc = new Scanner (System.in);
        System.out.println("Enter a number ");
        int num = sc.nextInt();
        int n = num;
        int ln = num %10;
        int len = String.valueOf(num).length();
        int fn = num/(int )Math.pow(10,(len-1));
        int center = (n%(int )Math.pow(10,(len-1)))/10;
        int value = (((ln * (int)Math.pow(10, len-2)) + center)*10)+fn;
        System.out.println("Output: ");
        System.out.println(value);

    }
}