 import java.util.Scanner;

public class Factorial1{
    public static void main(String[] args){
          Scanner input = new Scanner(System.in);
	   
           int result = 1;
          int counter = 1;
            
             System.out.print("Enter A Number ");
              int num = input.nextInt();
           
if(num>0){
          while(counter <= num){
                 result *= counter;
                  counter++;
            }

              System.out.printf("The Factorail is %d",result);
           } 
          if(num<0){
               System.out.print("This Number Is A Negative Number ");
            }
      
      }






}