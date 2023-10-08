public class Binary_String_recursion {
    public static void printstring(int n, int lastplace, String str){
        // base case
        if(n==0){
            System.out.println(str);
            return;
        }
        // Kaam
        printstring(n-1,0,str+"0");
        if(lastplace==0){
            printstring(n-1,1,str+"1");
        }
    }
    public static void main(String[] args) {
        printstring(3,0,"");
        
    }
    
}
