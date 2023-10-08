import java.util.*;
public class income_tax_calculator {
    public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.print("Enter Your Salary:  ");
int income = sc.nextInt();
int tax;
if(income<500000)
{
    tax = 0;
}
else if (income>=500000 && income<=1000000)
{
    tax = (int) (income * 0.2);
}
else 
{
    tax = (int) (income * 0.3);
}
System.out.print("Your Tax is:  "+tax);

    }  
}
