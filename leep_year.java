import java.util.*;
public class leep_year {
    public static void main(String args[]){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter Year");
            int year = sc.nextInt();

            boolean x = (year % 4) == 0;
            boolean y = (year%100)!=0;
            boolean z = ((year % 100==0)&&(year % 400==0));

            if (x && (y || z)) {
                System.out.println("This is a Leap Year");
            }
            else
            {
                System.out.println("This is Not a Leap Year");
            }
        }
    }
    
}
