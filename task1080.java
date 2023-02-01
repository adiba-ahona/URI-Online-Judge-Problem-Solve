import java.util.Scanner;

public class task1080 {

 public static void main(String[] args) {
  int N =100; 
  int X;
   int highest = 0;
   int position = 0;
  Scanner input =new Scanner(System.in);
  for (int i = 1; i <= N; i++) {
   X =input.nextInt();
   
   if (highest > X) {
    highest = highest;
    position = position;
   }else {
    highest = X;
    position = i;
   }  
  }
  System.out.print(highest+"\n"+position+"\n");
 }
}