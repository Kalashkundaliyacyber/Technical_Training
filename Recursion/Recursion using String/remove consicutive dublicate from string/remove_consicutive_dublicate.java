import java.util.*;

public class remove_consicutive_dublicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your String : ");
        String str = sc.nextLine();
        System.out.println("output : ");
        System.out.println("After deleting a consitive dublicate : ");
        remove_dublicate(str, str.length(), 1, "");
    }

    static void remove_dublicate(String str, int length, int index, String newstr) {
        if (index == length) {
            System.out.println(newstr);
        } else {
            if (index == 1) {
                newstr += str.charAt(index);
            }
            if (str.charAt(index) == str.charAt(index - 1)) {
                newstr += "";
            } else {
                newstr += str.charAt(index);
            }
            remove_dublicate(str, length, index + 1, newstr);

        }
    }
}
