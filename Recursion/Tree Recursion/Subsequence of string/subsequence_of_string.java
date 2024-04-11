import java.util.*;
public class subsequence_of_string {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String str = sc.next();
        System.out.println("Output : ");
        printsequence(str,"");
    }
    static void printsequence(String str , String result)
    {
        if (str.length()==0)
        {
            System.out.print(result +" , ");
            return;
        }
        printsequence(str.substring(1), result);
        printsequence(str.substring(1), result+str.charAt(0));
    }
}
