public class try_block_injava {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        try{
            int c=a/b;
            System.out.println("A is Divisible by B");

        }
        catch(Exception e){
            System.out.println("A is not Divisible by B because this is a Exception Case");
           

        }
      
        
    }
    
}
