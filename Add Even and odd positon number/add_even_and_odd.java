import java.util.*;
public class add_even_and_odd {
    public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter  number ");
		int num = sc.nextInt();
        int even = 0;
        int odd = 0;
        int last ;
        int count =0 ;
        while (num != 0)
        {
            last = num%10;
            count ++;
            if (count%2 ==0)
            {
                even += last;
            }
            else{
               
                    odd += last;
                
            }
            num/=10;
        }
        System.out.println("Output: ");
        System.out.println("Even position sum " +even);
        System.out.println("odd position sum " +odd);
    }
}
