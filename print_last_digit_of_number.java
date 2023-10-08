public class print_last_digit_of_number {
    public static void main(String args[])
    {
        int n = 10899;
        while(n>0)
        {
            int ld = n % 10;
            System.out.print(ld);
            n = n/10;
        }
    }
    
}
