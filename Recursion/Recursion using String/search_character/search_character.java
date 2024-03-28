import java.util.*;
public class search_character
{
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter your String : ");
		String str = sc.nextLine();
		
		System.out.println("Enter of your search Character in a string : ");
        char searchchar = sc.next().charAt(0);
        System.out.println("Output");
        boolean found = search (str,searchchar,0);
        if (found)
        {
            System.out.println("Character '" +searchchar+"' found in the string");
            System.out.println(+occurrences(str,searchchar,0,0)+" times character '"+searchchar+"' occur in a string ");
            System.out.println("Positions of character '" + searchchar + "' in the string:");
            position(str, searchchar, 0);
            
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
    static int occurrences(String str, char searchchar, int index , int counter)
    {
        if (index>=str.length())
        {
            return counter ;
        }
        else 
        {
            if (searchchar ==  str.charAt(index))
            {
                counter++;
            }
            return occurrences(str,searchchar,index+1,counter);
        }
    }
    static void position(String str, char searchchar,int index)
    {
        if (index>=str.length())
        {
            return;
        }
        if (searchchar ==  str.charAt(index))
            {
                System.out.println("Position: " + (index + 1));
                
            }
            position(str,searchchar,index+1);
    }
}

