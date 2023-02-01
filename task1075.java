import java.util.Scanner;

public class task1075 {
 public static void main(String[] args) {

  int N;
  Scanner go =new Scanner(System.in);
  
  N =go.nextInt();
  for (int i = 0; ((N*i) + 2) < 10000; i++)
  {
   System.out.print((N*i) + 2+"\n");
  }
 }
}