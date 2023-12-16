import java.util.Scanner;

public class SalesCommissionCalculator{
     public static void main(String[] args){
             Scanner input = new Scanner(System.in);

   double percentageGrossSales = 0;
   double wagesPlusPercentageGrossSales = 0;
   int counter = 1;
    int item = 0;
         
   while(counter<=4){
          System.out.println("Enter the number of items you sold last week: ");
            item = input.nextInt();

           System.out.println("Enter the value per item (#): ");
              int value = input.nextInt();  
              
             System.out.println("Enter Your wages per week(#)\n : ");
              int wages = input.nextInt();  
            counter = counter + 1;
       

         int totalValue = item * value;
             percentageGrossSales = (9/100.0)*value;
                wagesPlusPercentageGrossSales = wages + percentageGrossSales;     
             
         System.out.printf("Your Earnings for last week is %.2f",wagesPlusPercentageGrossSales );
          
   }
      


      }


 }