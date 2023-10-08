import java.util.*;
public class words_counter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count=1;
        System.out.println("Enter Your Sentence");
        String s = sc.nextLine();
        for(int i=0; i<s.length(); i++){
            if((s.charAt(i)==' ')&&(s.charAt(i+1)!=' ')){
                count++;
            }
        }
        System.out.println(count);

    }
    
}
