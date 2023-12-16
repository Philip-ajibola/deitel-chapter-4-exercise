import java.util.Scanner;

public class LargestNumber{
      public static void main(String[] args){
          Scanner input = new Scanner(System.in);

     int counter = 1;
     int number = 0;
     int largest = 0;

       while(counter<=10){
             System.out.print("Enter 10 Numbers and determine the largest number:  ");
                   number = input.nextInt();
                
              if(number>largest){
                     largest = number;
              }

               counter= counter + 1;
            
        }
             

           System.out.printf("The Largest is %d",largest);
     

      }









}