import java.util.Scanner;
public class task1011
{
public static void main(String[] args)
{
  Scanner go= new Scanner(System.in);
  
double r= go.nextDouble();
double v= (4.0/3)*3.14159*r*r*r;
System.out.printf("VOLUME = %.3f\n", v);
}
}