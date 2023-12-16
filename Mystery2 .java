public class Mystery{
3 public static void main(String[] args) {
4 int count = 1;
56
while (count <= 20) {
7 System.out.println(count % 3 == 1 ? "########" : "++++++++");
8 ++count;
9 } 
10 } 
11 }