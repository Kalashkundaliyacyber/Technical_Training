import java.util.*;
public class greater_3number
{
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter 1st number ");
		int a = sc.nextInt();
        System.out.println("Enter 2nd  number ");
		int b = sc.nextInt();
        System.out.println("Enter 3rd number ");
		int c = sc.nextInt();
		System.out.println("Output: ");
		if (a>b && a>c)
		{
		    System.out.println(a+" is greater number ");
		   
		}
	    else if (a<b && b>c)
		{
		    System.out.println(b+" is greater number ");
		    
		}
		else 
		{
		    System.out.println(c+ " is greater number");
		}
	}
}
