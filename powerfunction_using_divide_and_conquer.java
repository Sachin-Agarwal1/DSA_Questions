public class powerfunction_using_divide_and_conquer {
    public static int power(int x,int n){
        if(n==0){
            return 1;
        }
        int temp = power( x, n/2);
        if(n%2==0){
            return temp*temp;
        }else{
            return x*temp*temp;
        }
    }
    public static void main(String[] args) {
        int x=5;
        int n=5;
        System.out.println( power(x,n));
        
    }
}