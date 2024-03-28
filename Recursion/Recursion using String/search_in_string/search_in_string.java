import java.util.*;
public class search_in_string
{
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter your string : ");
		String str = sc.nextLine();
		System.out.println("Enter your search string : ");
		String searchstr = sc.nextLine();
		boolean found = search(str,searchstr,0);
		System.out.println("Output");
		
		if (found)
		{
		    System.out.println(searchstr+" is  present in a string");
		}
		else
		{
		    System.out.println(searchstr+" is  present in a string");
		}
	}
	static  boolean search (String str,String searchstr ,int index)
	{
	    if ( (index+searchstr.length() ) >= str.length())
	    {
	        return false;
	    }
	    if (str.substring(index, (index+searchstr.length()) ) == searchstr)
	    {
	        return  true;
	    }
	    
	    return search(str,searchstr,index+1);
	}
}
