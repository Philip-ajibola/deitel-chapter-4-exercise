import java.util.Scanner;

public class Analysis1{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

           int pass = 0;
           int fail = 0;
           int  counter = 1;

     while(counter<=10){
             
              System.out.print("Enter 1 if You Passed Or 2 If you failed\n");
                     int number = input.nextInt();

              if(number!=1 && number!=2){
               System.out.print("Enter 1 if You Passed Or 2 If you failed\n");
                      number = input.nextInt();
                }
                   
       
              if(number == 1){
                       pass = pass+1;
               }
                else if(number == 2){
                  fail =  fail + 1 ;   
               }
                 counter++;

        }

          System.out.printf("number of people that passed is %d\n",pass);
          System.out.printf("number of people that failed is %d\n",fail);

            if (pass>8)
                  System.out.print("The Instructor Should  be Rewarded ");
      



   }







}