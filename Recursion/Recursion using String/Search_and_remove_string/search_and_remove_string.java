import java.util.*;
public class search_and_remove_string
{
  public static void main (String[]args)
  {
	Scanner sc = new Scanner (System.in);
	  System.out.println ("Enter your string : ");
	String str = sc.nextLine ();
	  System.out.println ("Enter your remove string : ");
	String removestr = sc.nextLine ();
	int found = search (str, removestr, 0);
	  System.out.println ("Output");

	if (found >= 0)
	  {
		System.out.println (removestr + " is  present in a string");
		String newstr = remove (str, removestr, "");
		  System.out.println (newstr);
	  }
	else
	  {
		System.out.println (removestr + " is  present in a string");
	  }
  }
  static int search (String str, String searchstr, int index)
  {
	if ((index + searchstr.length ()) > str.length ())
	  {
		return -1;
	  }
	if (str.
		substring (index, (index + searchstr.length ())).equals (searchstr))
	  {
		return index;
	  }

	return search (str, searchstr, index + 1);
  }
  static String remove (String str, String removestr, String newstr)
  {
	if (str.isEmpty ())
	  {
		return newstr;
	  }
	int found = search (str, removestr, 0);
	if (found >= 0)
	  {
		newstr += str.substring (0, found) + "";
		String remainingstr = str.substring (found + removestr.length ());
		return remove (remainingstr, removestr, newstr);
	  }
	else
	  {
		return newstr + str;
	  }


  }
}
