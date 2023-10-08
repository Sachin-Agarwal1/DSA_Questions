import java.util.*;
public class binary_to_decimal {
    public static int bintodec(int n){
        int number = n;
        int decn =0;
        int pow = 0;
        while(n>0){
            int ld = n % 10;
            decn = decn + (ld * (int)(Math.pow(2, pow)));
            pow++;
            n = n/10;
        } 
        System.out.println("Decimal of "+number+" = "+decn);
        return decn;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt(); 
        bintodec(num);
    }
    
}
