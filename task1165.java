import java.util.Scanner;

public class task1165 
{
 public static void main(String[] args) 
 {
  int N;
  int X;
  int j;
  Scanner ho= new Scanner(System.in);
  N = ho.nextInt();
  for (int i = 1; i <= N; i++) {
   X = ho.nextInt();
   boolean isprime =true;
   for ( j = 2; j < X; j++) {
     if (X % j == 0) {
      isprime = false;
     }
   }
   if (isprime) {
    System.out.print(X +" eh primo\n");
   }else {
    System.out.print(X +" nao eh primo\n");
   } 
  }
 }
}