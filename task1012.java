import java.util.Scanner;
public class task1012
{
public static void main(String[] args)
{
  Scanner go= new Scanner(System.in);
  
  double A = go.nextDouble();
 double B = go.nextDouble();
 double C = go.nextDouble();
 
 double triangle = (A*C)/2;
 double circle = (3.14159*C*C);
 double trapezium = ((A+B)/2)*C;
 double square = B*B;
 double rectangle = A*B;
 
 System.out.printf("TRIANGULO: %.3f\n", triangle);
 System.out.printf("CIRCULO: %.3f\n", circle);
 System.out.printf("TRAPEZIO: %.3f\n", trapezium);
 System.out.printf("QUADRADO: %.3f\n", square );
 System.out.printf("RETANGULO: %.3f\n", rectangle);
}
}