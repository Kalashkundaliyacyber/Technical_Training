import java.util.*;
public class Greater4number {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter 1st number ");
		int a = sc.nextInt();
        System.out.println("Enter 2nd  number ");
		int b = sc.nextInt();
        System.out.println("Enter 3rd number ");
		int c = sc.nextInt();
        System.out.println("Enter 4th number ");
        int d = sc.nextInt();
		if (a>b && a>c && a>d)
		{
		    System.out.println(a+" is greater number ");
		   
		}
	    else if (b>a && b>c && b>d)
		{
		    System.out.println(b+" is greater number ");
		    
		}
        
	    else if (c>a && c>b && c>d)
		{
            System.out.println(c+" is greater number ");
        }
		else 
		{
		    System.out.println(d+ " is greater number");
		}

    }
}
