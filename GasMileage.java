import java.util.Scanner;

public class GasMileage{
   public static void main(String[] args){
          Scanner input = new Scanner(System.in);
   
   
   int gallon = 0;
   double milesPerGallon = 0;
   int totalMiles = 0;
   int totalGallon = 0;
   double totalMilePerGallon = 0;
   int counter = 0;

        System.out.print("Enter Miles for each trip(Enter -1 to Quit) : ");
  	  int miles = input.nextInt();
     while(miles != -1){
         totalMiles += miles;
          counter = counter+1;
                     
 	   System.out.print("Enter gallons used for each trips ");
            gallon = input.nextInt(); 
		totalGallon += gallon;

             milesPerGallon =(double)miles/gallon;
		totalMilePerGallon += milesPerGallon;

             System.out.printf("The mile per gallon is %.2f%n",milesPerGallon);

            
           System.out.print("Enter Miles for each trip(Enter -1 to Quit) : ");
  	  miles = input.nextInt();
 
         
		}

     if(counter != 0){   
       System.out.printf("The total mile per gallon is %.2f%n",totalMilePerGallon);
	System.out.printf(" total mile used is %d%n", totalMiles);
	System.out.printf("The total gallon used is %d",totalGallon);
           
      }else{
         System.out.print("Mile was not Entered"); 
        }

     }

 }




 



