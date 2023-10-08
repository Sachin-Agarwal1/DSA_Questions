import java.util.*;
public class mix_pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int h = (n/2)+1;
        if(n%2!=0){
            for(int i=1; i<=h; i++){
                for(int j=1; j<=(h-i); j++)
                {
                    System.out.print(" ");
                }  
                for(int j=1; j<=(2*i)-1; j++)
                {
                    System.out.print("*");
                }
                System.out.println();
            }
            for(int i=1; i<=h; i++){
                for(int j=1; j<=n; j++){
                    if(j==1||j==n){
                        System.out.print("@");
                    }else{
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
            for(int i=1; i<=h; i++){
                for(int j=1; j<=n; j++)
                {
                    if((j==1||j==n)&&(i!=h))
                    {
                        System.out.print("@");
                    }
                    else if(j>=h+1-i && j<=h-1+i)
                    {
                        System.out.print("*");
                    }
                    else
                    {
                        System.out.print(" ");
                    }
                }
                System.out.println();

            }
            
   
    
        }
        
    } 
}
