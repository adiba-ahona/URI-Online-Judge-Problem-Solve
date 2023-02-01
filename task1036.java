import java.util.Scanner;
public class task1036
{
  public static void main(String[] args) 
  {
  Scanner go = new Scanner(System.in);
  double a = go.nextDouble();
  double b= go.nextDouble();
  double c = go.nextDouble();
    
  if( a==0 || ((b*b) - (4*a*c)) < 0 )
  {
    System.out.println("Impossivel calcular");
  }
  else
  { 
       double r1 = ((-b + Math.sqrt(((b*b) - (4*a*c)))) / (2*a));
       double r2 = ((-b - Math.sqrt(((b*b) - (4*a*c)))) / (2*a));
       System.out.printf("R1 = %.5f\n", r1);
       System.out.printf("R2 = %.5f\n", r2);
   }  
  } 
}