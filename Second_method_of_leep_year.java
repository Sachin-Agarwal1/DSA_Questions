import java.util.*;
public class Second_method_of_leep_year {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Year  ");
        int year = sc.nextInt();
        if((year%4==0) && ((year%400==0) || (year%100!=0)))
        {
            System.out.println("This Year is Leep Year");
        }else
        {
            System.out.println("This Year is not a Leep Year");
        }


    }
}
