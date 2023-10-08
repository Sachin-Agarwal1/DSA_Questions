import java.util.*;
public class Tower_of_Hanoi {
    public static void towerofhanoi(int n, String src, String helper, String dest){
        if (n == 1){
            System.out.println("Move disk " + n +" from "+src+" to "+dest);
            return;
        }
        towerofhanoi(n-1, src, dest, helper);
        System.out.println("Move disk " + n +" from "+src+" to "+dest);
        towerofhanoi(n-1,helper ,src, dest );
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Value of N = ");
        int n = sc.nextInt();
        towerofhanoi(n,"S","H", "D");
    }
}
