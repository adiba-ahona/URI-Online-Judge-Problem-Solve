import java.util.Scanner;

public class task1142 {

 public static void main(String[] args) {
  int N;
  Scanner hi= new Scanner(System.in);
  N = hi.nextInt();
  for (int i = 1; i <= (4*N - 1); i+=4)
  {
   for (int j = i; j <= i+2; j++) 
   {
    System.out.print(j+" ");
   }
   System.out.print(" PUM\n");
  }
 }
}