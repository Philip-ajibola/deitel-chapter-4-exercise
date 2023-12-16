import java.security.SecureRandom;
import java.util.Scanner;

public class Random{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		SecureRandom random = new SecureRandom();
		int randomNumber = random.nextInt(1,11);

	System.out.println("Guess A Number From 1-10");
		int guess = input.nextInt();
while(guess > 10 || guess <0){
		System.out.print("Please Listen To Instructions Enter Number From 1-10,abi make i speak another language ni :( \n");
			guess = input.nextInt();
	}
 if (guess<=10){

	   if(guess>randomNumber){
		System.out.print("Your guess is higher than random number\n");
		System.out.printf("Your Guess: %d Ramdom Number: %d%n",guess,randomNumber);

	}
		if(guess<randomNumber){
		System.out.print("Your guess is lower than random number\n");
		System.out.printf("Your Guess: %d Ramdom Number: %d%n",guess,randomNumber);

	}
		if(guess==randomNumber){
		System.out.print("Correct!!!!\n");
		System.out.printf("Your Guess: %d Ramdom Number: %d%n",guess,randomNumber);

	}
		

	}


	}





}