import java.util.Scanner;

public class task1157 
{
 public static void main(String[] args) {
  int N;
  Scanner ho =new Scanner(System.in);
  N = ho.nextInt();
  for (int i = 1; i <= N; i++) {
   if (N % i == 0) {
    System.out.print(i+"\n");
   }
  }
 }
}