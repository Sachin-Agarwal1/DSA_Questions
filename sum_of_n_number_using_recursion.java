public class sum_of_n_number_using_recursion {
    public static int calsum(int n){
        if (n==1){
            return n;
        }
        int sum1=n+calsum(n-1);
        return sum1;
    }
    public static void main(String[] args) {
        int n=10;
        System.out.print("Your Sum Of N Number 1 to N is: ");
        System.out.println(calsum(n));
    }
    
}
