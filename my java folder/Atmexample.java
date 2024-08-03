import java.util.Scanner;

public class Atmexample
{
  public static void main(String[] args) {
    float balance = 30000 ;// balance of user
    float withdraw = 0;// withdraw by user
    float deposite = 0;// deposite by user 

try (// input taken from the user part is shown below
    Scanner sc = new Scanner (System.in)) {
      while(true){
      System.out.println("------WELCOME TO ATM MACHINE------");
      System.out.println("----------------------------------");
      System.out.println("option 1 : WITHDRAW");
      System.out.println("option 2 : DEPOSITE");
      System.out.println("option 3 : CHECK BALANCE");
      System.out.println("option 4 : EXIT");
      System.out.println("*(choose any one option above)*");
      System.out.println("----------------------------------");

      // implementation of options above described 
        int option = sc.nextInt();
        switch (option){
          case 1:
          System.out.println("enter withdraw amount :");
          System.out.println("----------------------------------");
          withdraw = sc.nextFloat();
          if(balance < withdraw ){ // checking the balance 
            System.out.println(" insufficient balance you cannot withdraw ");
          }
          else {
            balance = balance-withdraw ;
            System.out.println("successfully withdraw");
            System.out.println("----------------------------------");
          }
          break ;
          // logic for deposite 
          case 2:
          System.out.println("enter deposite amount :");
          System.out.println("----------------------------------");
           deposite = sc.nextFloat();
           balance = balance+deposite ;
           System.out.println("successfully deposited");
           System.out.println("----------------------------------");
           break;

           // logic for check balance 
           case 3:
           System.out.println("your account balance is : Rs. " +balance);
           break;

           //logic for exit 
           case 4:
           System.exit(0);
           break;
           default: System.out.println("please enter correct option ");

        }
      }
    }
  }
}