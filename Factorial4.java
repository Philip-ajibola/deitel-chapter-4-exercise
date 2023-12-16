 import java.util.Scanner;

public class Factorial4{
 
		public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number: ");
		int number = input.nextInt();
		System.out.print("Enter Integral value ");
                 int number1 = input.nextInt();
		double total =0;
		int factorial = 1;
		int counter = 1;
		int newCounter =1 ;
                 int counter3 =1;
                   double total1 = 1;
		
		while(counter <= number){  
                           
			while(newCounter <= counter){  
                                   
                                  factorial *= newCounter; 
				   newCounter++;

                                if(newCounter==1){
                                 number1 *=1;
                                 }
                                  else if(counter>=1 && newCounter==counter){
                                   number1*=number1;
                                     }
                                      
				       
                                                             
                                }          
			             total1 += (double)number1/factorial;
			            counter++;
                                     

		}
		System.out.println(total1);
	}






}