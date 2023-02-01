import java.util.Scanner;

public class task1159 {

 public static void main(String[] args) {
  int N;
  Scanner ho = new Scanner(System.in);
  while ((N =ho.nextInt()) != 0)
  {
   int sum = 0;
   for (int i = N,k = 1; k<= 5; i++) 
   {
    if (i % 2 == 0) 
    {
     sum += i;
     k += 1;
    }
   }
   System.out.print(sum+"\n");
  }
 }
}