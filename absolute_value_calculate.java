import java.util.Scanner;
public class absolute_value_calculate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        double num = scanner.nextDouble();
        double absValue;
        if (num < 0) {
            absValue = -num;
        } else {
            absValue = num;
        }
        System.out.println("The absolute value of " + num + " is " + absValue);
    }
}


