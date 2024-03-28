import java.util.*;

public class search_element
{
    public static void main (String [] args)
    {
   Scanner sc = new Scanner (System.in);
	    
		System.out.println("Enter the size of the array: ");
        int length = sc.nextInt();
        int[] arr = inputarray(length);
        System.out.printf("Enter the search element : ");
        int search = sc.nextInt();        
        System.out.println("Output");
        
		
		printsearch(arr,0,length,search,0);
	}
	static int[] inputarray(int length)
	{
	    Scanner sc = new Scanner (System.in);
	    int arr[] = new int [length];
	    for (int i = 0; i < length; i++) 
        {
            System.out.printf("Enter the "+(i+1)+" elements in a array : ");
            arr[i] = sc.nextInt();
        }
	    return arr;
	    
	}
	static void printsearch(int [] arr , int index , int length,int search , int position)
	{
	    if (index == length)
	    {
	        if (position>0 )
	        {
	            System.out.println("Position of element in array  : "+(position+1));
	        }
	        
	        else
	        {
	            System.out.println("Element didn't present in array ");
	        }
	        
	    }
	    else
	    {
	       if (search == arr[index])
	       {
	           position = index;
	       }
	       
	       printsearch(arr,index+1,length,search,position);
	    }
	}
}