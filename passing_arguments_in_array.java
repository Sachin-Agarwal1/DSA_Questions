import javax.swing.plaf.synth.SynthPasswordFieldUI;

public class passing_arguments_in_array {
    public static void update(int mark[],int a,int b, int c){
         for(int i=0; i<mark.length; i++){
             mark[i]=mark[i]+1;
         }
         for(int i=0; i<mark.length; i++){
             System.out.print(mark[i]+" ");
         }
         System.out.println();
         System.out.println();
      
        c=a;
        a=b;
        b=c;
        System.out.println(a);
        System.out.println(b);
    }

    public static void main(String[] args) {
        int mark[]={2,3,4};
        int a=5,b=6;
        int c=0;
         update(mark, a, b, c);
         System.out.println();
         System.out.print(a);
         System.out.println();
         System.out.print(b);
    }
}
