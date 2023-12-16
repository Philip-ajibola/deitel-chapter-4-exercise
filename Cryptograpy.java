import java.util.Scanner;

public class Cryptograpy{
	public static void main(string[] args){
	   Scanner input = new Scanner(System.in);

	System.out.print(" Enter A Four Digit Integer: ");
		int number = input.nextInt();
 	if(number>1000 || number>9999){
		System.out.print("The Number You Enterd Is Not a Four Digit Number");
	}
		int digit1 = ((number/1000)+7)%10;
		int digit2 = (((number/1000)%100)+7)%10;
		int digit3 = (((number%100)/10)+7)%10;
		int digit4 = ((number%10)+7)%10;
	
 
		System.out.printf("The Encrypted Value Of Your Input is: ",digit3,digit4,digit1,digit2);



	}








}