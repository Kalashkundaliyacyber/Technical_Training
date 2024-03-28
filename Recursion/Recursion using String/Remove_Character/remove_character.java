import java.util.*;
public class remove_character
{
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter your String : ");
		String str = sc.nextLine();
		
		System.out.println("Enter of your Character which u want to remove in a string : ");
        char searchchar = sc.next().charAt(0);
        
        System.out.println("Output");
        boolean found = search (str,searchchar,0);
        if (found)
        {
            System.out.println("Character '" +searchchar+"' found in the string");
            System.out.println("New String : " +remove(str,searchchar,"",0));
            
            
        }
        else
        {
            System.out.println("Character '" +searchchar+"' not found in the string");
        }
        
	}
	static boolean search (String str , char searchchar, int index )
	{
	    if (index >= str.length())
	    {
	        return false;
	    }
	    if (searchchar == str.charAt(index))
	    {
	        return  true;
	    }
	    return search(str,searchchar,index+1);
	}
    static String remove(String str, char searchchar, String replace_str, int index)
    {
        if (index>=str.length())
        {
            return replace_str ;
        }
        else 
        {
            
            if (searchchar ==  str.charAt(index))
            {
                replace_str += "";
            }
            else
            {
                replace_str += str.charAt(index);
            }
            return remove(str,searchchar,replace_str,index+1);
        }
    }
    
}

