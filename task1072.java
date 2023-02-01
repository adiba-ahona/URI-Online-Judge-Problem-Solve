import java.util.Scanner;

public class task1072 
{
 public static void main(String[] args) {
  int N ;
  int X;
  int in = 0;
  int out = 0;
  int interval_start =10;
  int interval_end =20 ;
  
  Scanner hi =new Scanner(System.in);
  
  N =hi.nextInt();
  for (int i = 1; i <= N; i++) 
  {
   X =hi.nextInt();
   if (X >= interval_start && X <= interval_end) 
   {
    in = in + 1;
   }
   else {
    out = out + 1;
   }
  }
  System.out.print(in+" in\n"+out +" out\n");
 }
}