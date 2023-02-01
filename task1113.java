import java.util.Scanner;

public class task1113 {

 public static void main(String[] args) {
  int X ;
  int Y ;
  
  Scanner input =new Scanner(System.in);

  do 
  {
   X = input.nextInt();
   Y = input.nextInt();
   if (X > Y) {
    System.out.print("Decrescente\n");
   }else if (X < Y) {
    System.out.print("Crescente\n");
   }
  } while (X != Y);
 }
}