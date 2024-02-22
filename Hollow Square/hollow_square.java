import java.util.*;
public class hollow_square {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int n = sc.nextInt();
        int i =0 , j=0 ;
        System.out.println("Output: ");
        for (i = 0 ; i<n;i++)
        {
            for (j=0;j<n;j++)
            {
               
                if (i == 0 || i== (n-1) || j ==0 || j==(n-1) )
                {
                    System.out.print("*");
                }
                else 
                {
                    System.out.print(" ");
                }
                
            }
            System.out.println();
        }
    }
}
