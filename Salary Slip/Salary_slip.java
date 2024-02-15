import java.util.*;

public class Salary_slip {
    public static void main(String[] args) {
        input();
    }
    static void input()
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Please enter your name ");
        String name = sc.nextLine();
        System.out.println("PLease enter your id ");
        int id = sc.nextInt();
        System.out.println("Please enter your basic salary ");
        Double basic_salary = sc.nextDouble();
        calculate(name,id, basic_salary);
    }
    static String ProperCase(String name) {
        String properName = "";
        String[] nameArray = name.split(" ");
        for (int i = 0; i < nameArray.length; i++) {
            String firstChar = String.valueOf(nameArray[i].charAt(0)).toUpperCase();
            String remainingName = nameArray[i].substring(1).toLowerCase();

            properName = properName + " " + firstChar + remainingName;
        }
        return properName;
    }
    static void calculate(String name, int id, Double basic_salary)
    {
       
        Double hra = 0.5 *basic_salary ;
        Double ta = 0.3* basic_salary;
        Double da = 0.25*basic_salary ;
        Double ma = 0.2 *basic_salary;
        Double pf = 0.1 *basic_salary;
        Double tax = calculate_tax(basic_salary);
        Double gs =basic_salary+ hra + ta +da + ma ;
        Double ns = gs - (tax+pf);
        String Propername = ProperCase(name);
        print(Propername,id ,hra ,ta, da , ma , pf, gs,tax,ns);
    }
    static Double calculate_tax (Double basic_salary)
    {
        Double total_Salary = basic_salary * 12;
        if (total_Salary <500000) 
        {
            return 0.02*basic_salary;
        }
        else if (total_Salary >=500000 && total_Salary <700000)
        {
            return basic_salary * 0.1;
        }
        else if (total_Salary >=700000 && total_Salary <1000000)
        {
            return basic_salary * 0.15;
        }
        return basic_salary * 0.2;
        

    }
    static void print(String name,int id, Double hra,Double ta, Double da, Double ma, Double pf, Double gs , Double tax , Double ns)
    {
        System.out.println("Welcome "+name);
        System.out.println("Your id   "+id);
        System.out.println("Your HRA  "+hra);
        System.out.println("Your TA   "+ta);
        System.out.println("Your DA   "+da);
        System.out.println("Your MA   "+ma);
        System.out.println("Your Gross Salary " +gs);
        System.out.println("Your TAX  "+tax);
        System.out.println("Your Net Salary " +ns);
    }
}
