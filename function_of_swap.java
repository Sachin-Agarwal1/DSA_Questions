public class function_of_swap {
    public static void swap(int a ,int b){
        int temp=a;
        a=b;
        b=temp;
        System.out.println(a);
        System.out.println(b);
        //In Their Function the Value are Chenged 
    }
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
       swap(a,b);
        System.out.println(a);
        System.out.println(b);
 /*But In Their Function the Value Was Not Change Because Java Works on call by by Value
 Not Call By Refrence*/   
    }    
}
