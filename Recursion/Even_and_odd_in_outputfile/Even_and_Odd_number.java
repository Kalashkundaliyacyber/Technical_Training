import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.*;
public class Even_and_Odd_number {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the number ");
        int num = sc.nextInt();
        System.out.println("Check Output file");
        System.setOut(new PrintStream("output.txt"));
        System.out.println("Output");
        compare(num);

    }
    static void compare (int num ){
        if(num == 0){
            return;
        }
        if (num%2==0)
        {
            System.out.println(num + " It is a even number ");
                     
        }
      
        else{
            System.out.println(num + " It is a odd number ");          
        }
        compare(num-1);
    }
}
