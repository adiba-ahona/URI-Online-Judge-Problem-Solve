import java.util.Scanner;
public class task1015
{
public static void main(String[] args)
{
  Scanner go= new Scanner(System.in);
  
double x1= go.nextDouble();
double y1= go.nextDouble();
double x2= go.nextDouble();
double y2= go.nextDouble();

double d= Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));

System.out.printf("%.4f \n", d);
}
}


