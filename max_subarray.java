import java.util.*;
public class max_subarray {
    public static void subarray(int numbers[]){
        int maxsum = Integer.MIN_VALUE;
        for (int i=0; i<numbers.length; i++ ){
            int start = i;
            for (int j=i; j<numbers.length; j++){
                int end = j;
                int currsum = 0;
                for (int k=start; k<=end; k++){
                currsum = currsum+numbers[k];
                }
                System.out.println(currsum);
                if(maxsum<currsum){
                    maxsum=currsum;
                }
            }
            System.out.println();
        }
        System.out.println("Max Sum: "+maxsum);
    }
    public static void main(String[] args) {
        int numbers[]= {2,4,6,8,10};
        subarray(numbers);
    }
    
}
