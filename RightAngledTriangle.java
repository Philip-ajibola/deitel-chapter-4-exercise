import java.util.Scanner;

public class RightAngledTriangle{

     public static void main(String[] args){
           Scanner input = new Scanner(System.in);

   
    int counter = 1;
        
               
           System.out.print("Enter The Base Length Of A Triangle (1-10) \n");
              int length = input.nextInt();

          while(counter < length){
                int number2 = 1;
            while(number2 < (counter+1)){
             System.out.print("*" );
                         number2++;
            } 
                  System.out.println  (" " );
                   counter++;
            
         }     



     }




 





}