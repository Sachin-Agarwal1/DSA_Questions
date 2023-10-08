import java.util.*;
public class rajat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Roll Number");
        int age = sc.nextInt();
        System.out.println("Emter Your Subject Marks");
        int marks = sc.nextInt();
        switch(age){
            case 22: System.out.println("Rajat Yadav");
            break;
            default:System.out.println("Check Your Roll Number");
        }
        switch(marks){
            case 77: System.out.println("Marks of Enter By You is P.P.S");
            break;
            default: System.out.println("You Enter the Wrong Sunject Marks");

        }

    }
    
}
