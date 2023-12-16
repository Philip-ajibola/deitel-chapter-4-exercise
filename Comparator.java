import java.util.Scanner;

public class Comparator{
     public static void main(String[] args){
           Scanner input = new Scanner(System.in);
              
             int counter = 1;
              int num1 = 0;

          while(counter<=2){
               System.out.print("Enter Two number: ");
                    num1 = input.nextInt();
                 
                    if(num1>num1){
                       num1 = 1; 
                     }
                     else if(num1<num1){
                       num1 = -1;
                     }
                      else if(num1==num1){
                        num1 = 0;
                     }
                                       
                      counter++;
   
                 }

                    System.out.println(num1); 

    }









}