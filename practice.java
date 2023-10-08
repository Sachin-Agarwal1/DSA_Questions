import java.util.*;
public class practice{
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
//     int a = sc.nextInt();;
//     double b = sc.nextDouble();
//     String e = sc.nextLine();
// System.out.println("Your Statement is:"+e);
// System.out.println("The Value of A and the Value of B is:"+a+b);
// System.out.println("The Value of B and the Value of A is:"+b+a);
int a=8; 
int b=11;
for (int i=a; i<=b; i++){
    if (i==1){
        System.out.println("One");
    }else if (i==2){
        System.out.println("Two");
    }else if (i==3){
        System.out.println("three");
    }else if (i==4){
        System.out.println("Four");
    }else if (i==5){
        System.out.println("Fivr");
    }else if (i==6){
        System.out.println("six");
    }else if (i==7){
        System.out.println("Seven");
    }else if (i==8){
        System.out.println("Eight");
    }else if (i==9){
        System.out.println("Nine");
    }else if (i%2==0){
        System.out.println("Even");
    }else{
        System.out.println("Odd");
    }
    }

}
}

