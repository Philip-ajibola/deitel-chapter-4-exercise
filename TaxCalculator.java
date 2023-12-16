import java.util.Scanner;


public class TaxCalculator{
     public static void main(String[] args){
        Scanner input = new Scanner(System.in);
       int counter = 0;
       int earnings = 0;
       String name;
       double taxAmount = 0;
       double taxAmount1 = 0;
       
    while(counter<=3){
           System.out.print("Enter Your Name: \n");
               name = input.next();

           System.out.print("\nEnter Your Earning Amount: ");
                earnings = input.nextInt();
                 if(earnings<=30000){
                      double taxRate = (15.0/100);
                         taxAmount = earnings*taxRate;
     System.out.printf("%n%s Your tax levy for this month is %.2f%n ",name,taxAmount);
         counter = counter +1;
                 }
                     else if(earnings>30000){
                          double  taxRate1 = (20.0/100);
                         taxAmount1 = earnings*taxRate1; 
               System.out.printf("%s Your tax levy for this month is %.2f%n ",name,taxAmount1);
                      }

   counter = counter + 1;
       
       }    





    } 





}