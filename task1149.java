import java.util.Scanner;
public class task1149 {

 public static void main(String[] args) 
 {
  int A;
  int  N;
  int total = 0;
  Scanner go =new Scanner(System.in);
  A = go.nextInt();
  N =go.nextInt();
  for (int i = A,totalNumber = 0; totalNumber < N; i++) {
   total += i;
   totalNumber += 1;
  }
  System.out.print(total+"\n");
 }
}