import java.util.*;
public class using_ternary_opreator {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String b = (a%2==0)?"Even":"odd";
        System.out.println(b);
    }
    
}
