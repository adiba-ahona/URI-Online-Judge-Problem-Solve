import java.util.Scanner;
public class task1158 {

 public static void main(String[] args)
 {
  int N;
  int X;
  int Y;
  int j;
  int total;
  Scanner ho = new Scanner(System.in);
  N = ho.nextInt();
  
  for (int i = 1; i <= N; i++) {
   int sum = 0;
   X = ho.nextInt();
   Y = ho.nextInt();
   for (j = X,total = 0; total < Y; j++) {
    if (j % 2 != 0) {
     sum += j;
     total += 1;
    }
   }
   System.out.print(sum+"\n");
  }
 }
}