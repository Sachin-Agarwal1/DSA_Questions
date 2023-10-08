public class friends_pairing_using_recursion {
    public static int friendspairinf(int n){
        if(n==1||n==2){
            return n;
        }
        return friendspairinf(n-1)+(n-1)*friendspairinf(n-2);
    }
    public static void main(String[] args) {
        System.out.println(friendspairinf(4));
    }
    
}
