import java.util.*;
public class heart_pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 5;
        int s = 6;
        for(int i=0; i<=n; i++){
            for(int j=0; j<=s; j++){
                if((i==0 && j%3!=0) || (i==1 && j%3==0) || (i-j==2) || (i+j==8)){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
            
        }
    }
    
}
