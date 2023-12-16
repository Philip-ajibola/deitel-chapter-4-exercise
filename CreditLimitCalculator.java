import java.util.Scanner;

public class CreditLimitCalculator{
     public static void main(String[] args){
         Scanner input = new Scanner(System.in);

    int newBalance = 0;
     int creditLimit = 0;
      int counter = 0;

  System.out.print("Enter Your Account Number(Enter -1 to Quit): \n");
  long accountNumber = input.nextLong();
 while(accountNumber != -1){
     System.out.print("Enter Your Account Balance(At the beginning Of the month): \n");
           int initailBalance = input.nextInt();
    System.out.print("Enter Total Item Charged This Month : \n");      
         int totalItemCharge = input.nextInt();
    System.out.print("Enter Total of all credit applied to Your Account this month: \n");
             int totalCredit = input.nextInt();
    System.out.print("Enter Your Allowed Credit Limit"); 
         creditLimit = input.nextInt();
          counter = counter +1;
       newBalance = (initailBalance + totalItemCharge -totalCredit);
     
           if(newBalance<=creditLimit){
              System.out.printf("Your New Balance is: %d%n",newBalance);
             }
               else if(newBalance>creditLimit){
                    System.out.print("Credit Limit Exceeded\n ");
                 }
            

         System.out.print("Enter Your Account Number(Enter -1 to Quit): \n");
             accountNumber = input.nextLong();
                
                          
         }
             
         









    }








}