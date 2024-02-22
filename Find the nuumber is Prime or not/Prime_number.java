import java.util.*;
public class Prime_number
{
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter  number ");
		int a = sc.nextInt();
		int i;
		int count = 0;
		System.out.println("Output: ");
	    for (i = 2 ; i<(a/2) ; i++ )
	    {
	        if (a%i == 0)
	        {
	            count ++;
	        }
	    }
	    if (count > 0)
	    {
	        System.out.println(a + " is not a prime number ");
	    }
	    else 
	    {
	        System.out.println(a+" is prime number");
	    }
        }
    
}
