import java.util.*;
public class armstrong_number_in_range {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Set the Range: ");
        int range= sc.nextInt();
        for(int i=0; i<=range; i++){
            int temp = i;
            int sum = 0;
            int rem = 0;
          while(temp > 0){
             rem = temp % 10;
             sum = (rem*rem*rem)+ sum;
             temp = temp/10;
            }
            if(sum==i){
                System.out.println(i);
                
            }
       
        }    
       
    
    }
}




