import java.util.*;
public class search_and_replace_string
{
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter your string : ");
		String str = sc.nextLine();
		System.out.println("Enter your search string : ");
		String searchstr = sc.nextLine();
		System.out.println("Enter a replcement string : ");
		String replacestr = sc.nextLine();
 		int found = search(str,searchstr,0);
		
		System.out.println("Output");
		
		if (found>=0)
		{
		    System.out.println(searchstr+" is  present in a string");
		     String newstr = replace(str,searchstr,replacestr,"");
		     System.out.println(newstr);
		}
		else
		{
		    System.out.println(searchstr+" is not present in a string");
		}
	}
	static  int search (String str,String searchstr ,int index)
	{
	    if ( (index+searchstr.length() ) > str.length())
	    {
	        return -1 ;
	    }
	    if (str.substring(index, (index+searchstr.length()) ).equals( searchstr))
	    {
	        return index;
	    }
	    
	    return search(str,searchstr,index+1);
	}
	static String replace (String str,String searchstr ,String replacestr , String newstr)
	{
	    if (str.isEmpty())
	    {
	        
	        return newstr;
	    }
	    int found = search(str,searchstr,0);
	    
	    if (found >=0)
	    {
	       newstr += str.substring(0,found)+ replacestr;
	       String remainingstr = str.substring(found+searchstr.length());
	       return replace (remainingstr,searchstr,replacestr,newstr);
	    }
	    else
	    {
	        return newstr+str;
	    }
	    
	    
	    
	    
	}
	
}
