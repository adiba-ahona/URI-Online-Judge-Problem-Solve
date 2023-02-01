import java.util.Scanner;
public class task1073
{
 public static void main(String[] args) 
 {
  Scanner hi =new Scanner(System.in);
  int N =hi.nextInt();
  for (int i = 2; i <= N; i+= 2) 
  {
   System.out.print(i+"^2 = "+(i*i)+"\n");
   }
  }
 }

