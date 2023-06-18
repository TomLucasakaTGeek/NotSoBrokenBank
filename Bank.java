import java.util.*;
class Main {
  public static void main(String args[]){
    int balance = 10000,withdraw,deposit;
    Scanner o = new Scanner(System.in);

    while(true)
      {                                    //selecting the operation
       System.out.println("Automated Teller Machine");
       System.out.println("Enter 1 to Withdraw");
       System.out.println("Enter 2 to Deposit");
       System.out.println("Enter 3 to Check Balance");
       System.out.println("Enter 4 to EXIT");
       System.out.println("Enter your Choice of Operation");

        int choice = o.nextInt();
        switch(choice)
          {
            case 1:                               //Withdraw
             
              System.out.print("Enter money to be withdrawn:");
              withdraw = o.nextInt();

              if(balance >= withdraw)
              {
                 balance -= withdraw;
                 System.out.println("Le Pakad");
              }
              else{
                System.out.println("Insufficient balance");
              }
              System.out.println("");
              
               break;
                
            case 2:                            //Deposit
              
              System.out.print("Enter money to be deposited:");
                deposit = o.nextInt();

              balance += deposit;
              System.out.println("Le Daal Diya");
              System.out.println("");
                
               break;

            case 3:                            //check balance
              
              System.out.println("Balance: "+balance);
              System.out.println("");

               break;

            default:
               System.exit(0);
          }
        }
      }
    }  
