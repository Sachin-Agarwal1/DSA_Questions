import java.util.*;
public class employee_insurance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Age: ");
        int age = sc.nextInt();
        System.out.print("Enter Your Marritial Status: ");
        char status = sc.next().charAt(0);
        System.out.print("Enter Your Gender: ");
        char gender = sc.next().charAt(0);
        if((status=='M') || ((status=='U') && ((gender=='M')&&(age>30)))){
            System.out.println("Employee is Eligable for Insurance");
        }
        else if(((status=='M') || ((status=='U') && ((gender=='F')&&(age>25))))){
            System.out.println("Employee is Eligable for Insurance");
        }
        else{
            System.out.println("Employee is not Eligable for Insurance");

        }
    }

    
}
