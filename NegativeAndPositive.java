import java.util.Scanner;

public class NegativeAndPositive{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		System.out.print("Enter An Integer,The Input Ends If It Is O: ");
			int number = input.nextInt();
	int totalPositive = 0;
	int totalNegative =0;
	double average =0;
	int totalNumber=0;

	if(number>0){
	while(number!=0){
		totalNumber+=number;
		if(number>0){
			 totalPositive++;
		}			

		else if(number<0){
			 totalNegative++;
		}			
		
		System.out.print("Enter An Integer,The Input Ends If It Is O: ");
			 number = input.nextInt();
	}

		System.out.printf("The numbers Of positives is %d\n",totalPositive);
		System.out.printf("The numbers Of Negative is %d\n",totalNegative);
	
		int sum = totalPositive + totalNegative;

		average = (double)totalNumber/sum;
		System.out.printf("The average is %.2f",average);

		} else{
		System.out.print("No number are enter aside zero ");
	}



}


}