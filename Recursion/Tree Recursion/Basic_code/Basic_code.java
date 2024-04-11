import java.util.*;
public class basic_code {
    public static void main(String[] args) {
        tree(3);
    }
    static void  tree (int num )
    {
        if (num <= 0)
        {
            return;
        }
        System.out.println("Pre call : "+num );
        tree(num-1);
        System.out.println("B/w call : "+num );
        tree(num-2);
        System.out.println("Post call : "+num );
    }
}
