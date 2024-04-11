import java.util.*;

public class board_game {
    static void printoutcome(int start, int end, String result) {
        if (start == end) {
            System.out.print(result + " , ");
            return;
        }
        if (start > end) {
            return;
        }
        for (int i = 1; i <= 6; i++) {
            printoutcome(start + i, end, result + i);
        }

    }
    public static void main(String[] args) {
        printoutcome(0, 10, "");
    }

    
}
