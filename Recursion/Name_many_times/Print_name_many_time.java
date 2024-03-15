import java.util.Scanner;

public class Print_name_many_time {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Name  ");
        String name = sc.nextLine();
        System.out.println("How many time u want to print your name : ");
        int time = sc.nextInt();
        System.err.println("Output");
        print(name,time);
    }
    static void print(String name, int time )
    {

       
        if (time == 0)
        {
            return;
            
           
        }
        else 
        {
            print(name ,time-1) ;
            System.out.println( time +" Time : "+name);
          
            
        }
    }
}
