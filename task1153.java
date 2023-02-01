import java.util.Scanner;

public class task1153
{
 public static void main(String[] args) 
 {
  int N;
  int fact = 1;
  Scanner go =new Scanner(System.in);
  N = go.nextInt();
  for (int i = 1; i <= N; i++) {
   fact *= i;
  }
  System.out.print(fact+"\n");
 }
}