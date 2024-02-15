import java.util.*;
public class rotate_number {
    public static void main(String[] args )
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a number ");
        int num = sc.nextInt();
        int i,temp,new_number ;

        for (i =0 ;i<4;i++)
        {
        
            if (r == 0)
            {
                temp = num %10;
                num/=10;
                new_number = temp *1000 + num;
            }
        }
    }
}
