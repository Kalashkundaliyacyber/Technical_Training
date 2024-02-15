import java.util.*;
public class rotate_number {
    public static void main(String[] args )
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a 4 digit number ");
        int num = sc.nextInt();
        System.out.println("How many time u want to rotate ");
        int rc = sc.nextInt();
        //rotate count = rc
        rotate_number(num, rc);
    }
     static void rotate_number(int num, int rc)
    {
        int value = rc%4 ;
   
        int x = num%(int)Math.pow(10, value); // last value 
        int y = num/(int)Math.pow(10, value); // first value 

        int z = x*(int)Math.pow(10,4- value) + y; // total value 
        System.out.println(z);

// using for loop 
        // int i =0;
        //  for (i=0;i<=rc;i++)
        // {
        //     System.out.println((i)+" value : "+num);
        //     int x = num%10;
        //     int y = num /10;
        //     int z = x*1000+y;
        //     num  = z ;
        // }
    }
}
