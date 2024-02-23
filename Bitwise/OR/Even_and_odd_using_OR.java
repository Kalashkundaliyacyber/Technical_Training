import java.util.Scanner;

public class Even_and_odd_using_OR {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a number ");
        int num = sc.nextInt();
        if ((num | 1) > num)
        {
            System.out.println("It is a even number ");
        }
        else 
        {
            System.out.println("It is a odd number ");
        }

    }
}
