import java.util.*;
public class Armstrong_number
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int n = sc.nextInt();
        int sum = 0;
        int temp = n;
        while (temp!= 0)
        {
            int rem = temp % 10;
            sum = sum + rem * rem * rem;
            temp = temp / 10;
        }
        if (sum == n)
            System.out.println(n + " is an Armstrong number");
        else
            System.out.println(n + " is not an Armstrong number");
    }
}