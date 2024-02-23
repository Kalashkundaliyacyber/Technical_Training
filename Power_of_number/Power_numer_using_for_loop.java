import java.util.*;
public class Power_numer_using_for_loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number ");
        int num = sc.nextInt();
        System.out.println("Enter a power number  ");
        int power = sc.nextInt();
        int multi = 1;
        System.out.println("Output");
        for (int i = 0 ; i<power ;i++)
        {
            multi = multi *num;
        }
        System.out.println(multi);
    }
}
