import java.util.*;
public class Eight_Star_Pattern {
    public static void main(String[] args)
    {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number : ");
        int n=sc.nextInt();
        System.out.print("Enter Symbol : ");

        char c = sc.next().charAt(0);



        int k=n*2-1;

        for(int i=1;i<=k;i++)
        {
            if(i==1 || i==n || i==k)

                for(int j=1;j<=n;j++)

                {      if(j==1  || j==n)
                    System.out.print(" ");
                else
                    System.out.print(c);



                }
            else
                for(int j=1;j<=n;j++)

                {      if(j==1 || j==n)
                    System.out.print(c);
                else
                    System.out.print(" ");

                }


            System.out.println();

        }
    }
}
