package Backtracking;
public class Grid_Ways_Using_Recursion {
    // With Help of Permutation Formula
    public static int fact(int n){
        if(n==0){
            return 1;
        }
        int factorial= n*fact(n-1);
        return factorial;
    
    }
    public static void main(String[] args) {
        int n=3;
        int m=3;
        System.out.println( fact(n-1+m-1)/ (fact(n-1)*fact(m-1)));
        
        
    }
    
}
