import java.util.*;
public class reverse_string
{
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter your String : ");
		String str = sc.nextLine();
        // reverse string  is empty in the beginning so we use " "
        System.out.println("Output");
        
        reverse (str,"",str.length()-1);
	}
	static void reverse (String str , String rev_str, int length)
	{
	    if (length<0)
	    {
	        
	        System.out.println("Reverse String : "+rev_str);
	        return;
	    }
	    rev_str += str.charAt(length) ;
	    reverse(str,rev_str,length-1);
	}

}

