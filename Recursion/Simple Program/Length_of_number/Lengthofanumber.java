import java.util.Scanner;

public class Lengthofanumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number ");
        int num = sc.nextInt();
        length(num);
        System.out.println("Output: ");
        System.out.println("Total number of digit : "+length(num));
    }
    static int length (int num )
    {
        if (num == 0 )
        {
            return 0;
        }
       
       return length(num/10)+1;
    }
}
