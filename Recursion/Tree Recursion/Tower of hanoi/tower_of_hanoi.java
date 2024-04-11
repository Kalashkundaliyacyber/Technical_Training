import java.util.*;
public class tower_of_hanoi {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of disks : ");
        int disks = sc.nextInt();
        System.out.println("Source : A ");
        System.out.println("Helper Disk : B ");
        System.out.println("Destination : C ");
        System.out.println("Output: ");
        printdisks(disks,'A','B','C');

    }
    static void printdisks(int disks,char A,char B,char C)
    {
        if (disks == 0)
        {
            return;
        }
        printdisks(disks-1, A, C, B);
        System.out.println("Move the "+disks+" from "+ A+" to "+ C);
        printdisks(disks-1, B, A, C);
    }
}
