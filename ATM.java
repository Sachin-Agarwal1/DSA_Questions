import java.util.Scanner;

public class ATM {
   private double balance;
   private int pin;
   private boolean loggedIn;
   private Scanner scanner;

   public ATM() {
      this.balance = 0.0;
      this.pin = 1234;
      this.loggedIn = false;
      this.scanner = new Scanner(System.in);
   }

   public void run() {
      while (true) {
         if (!loggedIn) {
            login();
         } else {
            displayMenu();
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            switch (choice) {
               case 1:
                  checkBalance();
                  break;
               case 2:
                  withdraw();
                  break;
               case 3:
                  deposit();
                  break;
               case 4:
                  logout();
                 return;
               default:
                  System.out.println("Invalid option");
                  break;
            }
         }
      }
   }

   private void login() {
      System.out.println("Enter your PIN: ");
      int enteredPin = scanner.nextInt();
      if (enteredPin == pin) {
         loggedIn = true;
         System.out.println("Login successful");
      } else {
         System.out.println("Invalid PIN");
      }
   }

   private void displayMenu() {
      System.out.println("****************************************************");
      System.out.println("ATM Menu");
      System.out.println("1. Check balance");
      System.out.println("2. Withdraw");
      System.out.println("3. Deposit");
      System.out.println("4. Logout");
      System.out.println("****************************************************");
   }

   private void checkBalance() {
      System.out.println("Current balance: " + balance);
   }

   private void withdraw() {
      System.out.println("Enter amount to withdraw: ");
      double amount = scanner.nextDouble();
      if (amount > balance) {
         System.out.println("Insufficient balance");
      } else {
         balance -= amount;
         System.out.println("Withdrawal successful");
      }
   }

   private void deposit() {
      System.out.println("Enter amount to deposit: ");
      double amount = scanner.nextDouble();
      balance += amount;
      System.out.println("Deposit successful");
   }

   private void logout() {
      loggedIn = false;
      System.out.println("Logout successful");
   }


   public static void main(String[] args) {
    ATM atm = new ATM();
    atm.run();
 }
 
}
