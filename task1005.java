import java.util.Scanner;
 
public class task1005
{
  public static void main(String[] args)
  {
  Scanner hi = new Scanner(System.in); 
 
  double A = hi.nextDouble();
  double B = hi.nextDouble();
  double avg = ((A*3.5) + (B*7.5))/ (3.5+7.5);
  

System.out.printf("MEDIA = %.5f\n", avg);
}
   
  }