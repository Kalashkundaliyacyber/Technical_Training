import java.util.*;
public class Print_array
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner (System.in);
	    
		System.out.println("Enter the size of the array: ");
        int length = sc.nextInt();
        int[] arr = inputarray(length);
        
        System.out.println("Output");
        System.out.println("The elements of the array are: ");
		
		printarray(arr,0,length);
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
	static void printarray(int [] arr , int index , int arr_size)
	{
	    if (index == arr_size)
	    {
	        return ;
	    }
	    else
	    {
	        System.out.println((index+1)+" digit  in array : "+arr[index]);
	        printarray(arr,index+1,arr_size);
	    }
	}
}
