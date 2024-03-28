import java.util.*;

public class reverse_array
{
    public static void main (String [] args)
    {
   Scanner sc = new Scanner (System.in);
	    
		System.out.println("Enter the size of the array: ");
        int length = sc.nextInt();
        int[] arr = inputarray(length);
        
        int [] reverse_arr = reverse(arr,0,length-1);      
        System.out.println("Output");
        int i;
		System.out.println("Reverse array ");
		for (i=0;i<length;i++)
		{
		    System.out.println((i+1)+" element in array " + reverse_arr[i]);
		}
		
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
	static int [] reverse(int [] arr , int start , int end)
	{
	    int temp;
	    if (start > end)
	    {
	        return arr;
	    }
	   else
	   {
	        temp = arr[start];
	        arr[start] = arr[end];
	        arr[end]=temp;
	        return reverse(arr , start+1 , end-1);
	   }
	}
}