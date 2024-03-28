import java.util.*;

public class min_and_max
{
    public static void main (String [] args)
    {
   Scanner sc = new Scanner (System.in);
	    
		System.out.println("Enter the size of the array: ");
        int length = sc.nextInt();
        int[] arr = inputarray(length);
        
        System.out.println("Output");
        System.out.println("The elements of the array are: ");
		
		print_max_min(arr,0,length,0,arr[0]);
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
	static void print_max_min(int [] arr , int index , int length,int max , int min)
	{
	    if (index == length)
	    {
	        System.out.println("Maximum value in array : "+max);
	        System.out.println("Manimum value in array : "+min);
	        
	    }
	    else
	    {
	       if (max < arr[index])
	       {
	           max = arr[index];
	       }
	       if (min > arr[index])
	       {
	           min = arr[index];
	       }
	       print_max_min(arr,index+1,length,max,min);
	    }
	}
}