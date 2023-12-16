import java.util.Scanner;

public class PrimeNumber2{
	public static void main(String[] args){
	    Scanner input= new Scanner(System.in);
		
	System.out.print("Enter A Positive Integer(Enter 0  to Quit): ");
		int num = input.nextInt();
		int count = 1;
		int factor = 0;
	while(num!=0){
		if(num>0){
				 count = 1;
				 factor = 0;
		
			while(count<=num){
				if(num%count==0){
				     factor++;
				}
				count++;
			}
				if(factor == 2){
					System.out.print(num+" Is A Prime Number \n");
				}else{
					System.out.print(num+" Is Not A Prime Number\n");
				}
		
		}else{
			System.out.print("The Number You Enter Is A Negative Integer");

		}
           System.out.print("Enter A Positive Integer(Enter 0  to Quit): ");
		 num = input.nextInt();
	}

	}





}