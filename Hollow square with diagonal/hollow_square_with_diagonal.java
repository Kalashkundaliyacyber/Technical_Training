import java.util.*;
public class hollow_square_with_diagonal{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int n = sc.nextInt();
        int i =0 , j=0 ;
        for (i = 0 ; i<n;i++)
        {
            for (j=0;j<n;j++)
            {
               
                if (i == 0 || i== (n-1) || j ==0 || j==(n-1) || i==j || i == ((n-1)-j))
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
