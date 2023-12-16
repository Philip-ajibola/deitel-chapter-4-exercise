import java.util.Scanner;

public class TwoLargestNumber{
     public static void main(String[] args){
        Scanner input = new Scanner(System.in);

 int counter = 1;
 int largest = 0;
 int secondLargest = 0;
   
while(counter<=10){
  System.out.print("Enter An Integer: \n");
         int number = input.nextInt();
      
          if(number>largest){
              secondLargest = largest;               
              largest = number;
           }
     
           else if( number>secondLargest){
            secondLargest = number;
                  }
          counter++;
    }
  
      System.out.printf("Largest Number is: %d%n",largest);

      System.out.printf("secondLargest Number is: %d",secondLargest);


} 



}