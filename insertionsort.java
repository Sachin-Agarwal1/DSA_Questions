import java.util.*;
public class insertionsort {
    public static void insertion(int a[]){
        int n = a.length;
        for(int i=1; i<n; i++){
            int temp = a[i];
            int j = i-1;
            while(j>=0 && a[j]>temp){
                a[j+1]=a[j];
                j--;
            }
            a[j+1]=temp;
        }
    }
    public static void print(int a[]){
        for(int i = 0; i<a.length; i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
    public static void main(String args[]) {
        int a[] = {0,1,0,1,0};
        insertion(a);
        print(a);
    
    
    }
}
