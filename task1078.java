import java.util.Scanner;

public class task1078 {

 public static void main(String[] args)
 {
  int N;
  Scanner ho=new Scanner(System.in);
  N =ho.nextInt();
  for (int i = 1; i <= 10; i++) {
   System.out.print(i+" x "+N+" = "+(i*N)+"\n");
  }
 }
}