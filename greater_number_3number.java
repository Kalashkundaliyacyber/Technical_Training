import java.util.*;
public class greater_number_3number
{
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter 3 number ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
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
