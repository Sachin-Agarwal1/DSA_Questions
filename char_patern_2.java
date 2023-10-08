public class char_patern_2 {
    public static void main(String args[]){
    char ch = 'A';
        for (int line = 1; line <= 4; line++)
        {
            for (int chars = 1; chars <= line; chars++ )
             {
            System.out.print(ch);
            ch++;
             }
            System.out.println();
        }
    }
    
}
