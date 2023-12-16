

public class TabularOutput{
       public static void main(String[] args){

int number=0;
int counter = 1;

          System.out.print("Number\tSquare\tCube\tQuadriplet\n");

 while(counter<=5){
        
      number++;
       int numberSquare = number*number;
        int numberCube = numberSquare*number;
        int numberQuadriplet = numberCube*number;

        System.out.printf("  %d\t  %d\t  %d\t  %d%n",number,numberSquare,numberCube,numberQuadriplet);

        counter++;
}





       }










}