import java.util.Scanner;

public class task1060 
{
 public static void main(String[] args) 
 {
  double X;
  int totalPositive = 0;
  Scanner hi =new Scanner(System.in);
  for (int i = 0; i < 6; i++) {
   X = hi.nextDouble();
   if (X > 0) {
    totalPositive += 1;
   }
  }
  System.out.print(totalPositive+" valores positivos\n");
 }
}