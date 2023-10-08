import java.util.*;
public class sortedarray {
    public static boolean sorted(int num[]){
     int count = 0;
     for(int i=0; i<num.length; i++){
        if(num[i]>num[(i+1)%num.length]){
            count++;
        }
     }
     if(count<=1){
        return true;
     }
     return false;
    }
    public static void main(String[] args) {
        int num[]={3,4,5,1,2};
       System.out.println( sorted(num));

                                
    }

    
}
