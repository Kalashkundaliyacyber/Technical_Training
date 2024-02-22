import java.util.*;
public class Perterson_number {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int factor = 1, sum = 0;
        int rem ,temp = n;
        while (n!=0)
        {
            factor =1;
            rem = n%10;
            for (int i=1; i<=rem; i++)
            {
                factor = factor * i;
            }
            sum=sum+factor;
            n=n/10;
        }
        
        if (sum == temp )
        {
            System.out.println(temp+" This is a peterson solution");
        }
        else
        {
            System.out.println(temp+" This is not  a peterson solution");
        }
    }
   
}
