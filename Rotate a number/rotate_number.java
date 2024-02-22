import java.util.*;
public class rotate_number {
    public static void main(String[] args )
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a 4 digit number ");
        int num = sc.nextInt();
        int length = String.valueOf(num).length();
        System.out.println("How many time u want to rotate ");
        int rc = sc.nextInt();
        //rotate count = rc
        if(rc<0)
        {
            rc+=length;
        }
        rotate(num, rc, length);
    }
     static void rotate(int num, int rc , int length)
    {
        int value = rc%length ;
   
        int x = num%(int)Math.pow(10, value); // last value 
        int y = num/(int)Math.pow(10, value); // first value 

        int z = x*(int)Math.pow(10,length- value) + y; // total value 
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
