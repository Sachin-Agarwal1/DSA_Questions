import java.util.*;
public class palindrome_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int a= sc.nextInt();
        int temp = a;
        int rev = 0;
        int rem = 0;
        while(temp > 0){
            rem = temp % 10;
            rev = (rev*10)+ rem;
            temp = temp/10;
        }
        if(rev==a){
            System.out.println("Your Number is Palindrome");
        }else{
            System.out.println("Your Number is Not Palindrome");
        }      
    }    
}
