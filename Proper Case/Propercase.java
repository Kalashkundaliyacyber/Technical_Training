import java.util.*;
public class Propercase {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        System.out.println("Enter the Name : ");
        String name = sc.nextLine();
        ProperCase(name);
    }
    static void ProperCase(String name) {
        String properName = "";
        String[] nameArray = name.split(" ");
        for (int i = 0; i < nameArray.length; i++) {
            String firstChar = String.valueOf(nameArray[i].charAt(0)).toUpperCase();
            String remainingName = nameArray[i].substring(1).toLowerCase();

            properName = properName + " " + firstChar + remainingName;
        }
        System.out.println("Output: ");
       System.out.println(properName);
    }
}
