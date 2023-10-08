import java.util.*;
public class armstrong_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int a= sc.nextInt();
        int temp = a;
        int sum = 0;
        int rem = 0;
        while(temp > 0){
            rem = temp % 10;
            sum = (rem*rem*rem)+ sum;
            temp = temp/10;
        }
        if(sum==a){
            System.out.println("Your Number is Armstrong Number");
        }else{
            System.out.println("Your Number is Not Armstrong Number");
        }      
    }    
}
