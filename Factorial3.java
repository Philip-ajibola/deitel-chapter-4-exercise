 import java.util.Scanner;

public class Factorial3{
 
		public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number: ");
		int number = input.nextInt();
		System.out.print("Enter Integral value ");
                 int number1 = input.nextInt();
		double total =1;
		int factorial = 1;
		int counter = 1;
		int newCounter =1;
		
		while(counter <= number){  
			factorial =1;
			while( newCounter <= counter){  
                                  factorial *= newCounter;
			           newCounter++; 
                       }
			total+=Math.pow(number1,counter)/factorial;
			counter++;
			 newCounter = 1;
		}
		System.out.println(total);
	}






}