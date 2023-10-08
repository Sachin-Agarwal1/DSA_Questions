import java.util.Arrays;
public class choclatedistribuation {
    

    public static int Differece(int chocolate[],int students){

        Arrays.sort(chocolate);

        if(chocolate.length < students){

            return -1;

        }

        if(chocolate.length == students){

            return chocolate[chocolate.length - 1 ] - chocolate[0];

        }

        int min = Integer.MAX_VALUE;

        for (int i = 0; i + students - 1 < chocolate.length; i++) {

            if(min > chocolate[i+students -1] - chocolate[i]){

                min = chocolate[i+students -1] - chocolate[i];

            }

        }

        return min;

    }

    public static void main(String[] args) {

        int v[] = {3, 4, 1, 9, 56, 7, 9, 12};

        System.out.println(Differece(v, 5));

    }

}
    

