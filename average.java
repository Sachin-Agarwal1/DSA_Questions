import java.util.*;
public class average {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Marks of Physics");
        int a = sc.nextInt();
        System.out.println("Enter the Marks of Maths");
        int b = sc.nextInt();
        System.out.println("Enter the Marks of PPS");
        int c = sc.nextInt();
        System.out.println("Enter the Marks of EVS");
        int d = sc.nextInt();
        System.out.println("Enter the Marks of Electrical");
        int e = sc.nextInt();
        float f = (a+b+c+d+e);
        System.out.println(f);
        System.out.println("Enter the Out of Marks");
        int s = sc.nextInt();
        int g = (s*5);
        float k = 100*f/g;
        System.out.println("Your Percentage is "+k);
        

    }
    
}
