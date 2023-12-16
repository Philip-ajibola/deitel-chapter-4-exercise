 import java.util.Scanner;

public class Factorial2{
 
		public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number: ");
		int number = input.nextInt();
		
		double total = 1;
		int factorial = 1;
		int counter = 1;
		int newCounter = 1;
		
		while(counter <= number){  
			while(newCounter <= counter){ 
				factorial *= newCounter;  
				newCounter++;
				
			}
			counter++;
			total += 1.0/factorial;
			newCounter = 1;
		}
		System.out.println(total);
	}






}