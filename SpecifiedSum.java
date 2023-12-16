import  java.util.Scanner;

public class SpecifiedSum{
 
    public static void main(String[] args){
          Scanner input = new Scanner(System.in);
        int number1 = 0;
        int number = 0;
        int sum = 0; 
          int counter = 0; 
         
        System.out.print("Enter A number ");
            number = input.nextInt();

    while(sum <= number){
       System.out.print("Enter A number ");  
           number1 = input.nextInt();

          
       sum += number1;   
           
          counter++;
        }      




   }









}