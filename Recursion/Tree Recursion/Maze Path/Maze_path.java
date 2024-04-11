import java.util.*;
public class Maze_path {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("MAZE PATH");
        System.out.println("Enter the size of the Maze : ");
        int size = sc.nextInt();
        System.out.println("Intial Position of the Maze is 1 , 1  and the final position of the maze is "+size+" , "+size);
        System.out.println("Output");
        printmaze(1,1,size,size,"");
    }
    static void printmaze(int row,int col,int endrow,int endcol , String result)
    {
        if (row == endrow && col == endcol)
        {
            System.out.println(result);
            return;
        }
        if (row > endrow || col > endcol)
        {
            return;
        }
        printmaze(row+1, col, endrow, endcol,result+"V");
        printmaze(row, col+1, endrow, endcol, result+"H");
    }
}
