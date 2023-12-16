import java.util.Scanner;

public class Cryptography2{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

	System.out.print("Enter A Four Digit Encrypted Value: ");
		int number = input.nextInt();
              

	if(number1<1000 || number1>9999){
		System.out.print("The Number You Enter Is  not A Four Digit Number. Please Enter A Four Digit Number");
		digit1 = ((number/1000)+7)%10;
		digit2 = (((number/1000)%100)+7)%10;
		digit3 = (((number%100)/10)+7)%10;
		digit4 = ((number%10)+7)%10;
           
		int num1 = (digit1 + 10 - 7)%10;
		int num2 = (digit2 + 10 - 7)%10;
		int num3 = (digit3 + 10 - 7)%10;
		int num4 = (digit4 + 10 - 7)%10;
            

	
		System.out.printf("The Encrypted Value Of Your Input is: ",num3,num4,num1,num2);




	}

	
	

	}






}