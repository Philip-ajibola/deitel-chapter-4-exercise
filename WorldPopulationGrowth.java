import java.util.Scanner;

public class WorldPopulationGrowth{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in); 
	System.out.print("Enter The Word Current Population And the Percentage Growth Rate: ");
	long population = input.nextLong();
	int rate = input.nextInt();
	System.out.print("year\tThe Population\tNumerical Population Increase\n");
	double percentage = rate/100.0;
	int year = 1;
while(year<=75){
	long populationGrowth = (long)(population*percentage);
	Long populationIncrease = population + populationGrowth;
	System.out.printf("%4d\t%13d\t%19d%n",year,populationIncrease,populationGrowth);
 	year++; 
	population = populationIncrease;

}







	}






}