import java.util.Scanner;
public class task1014
{
public static void main(String[] args)
{
  Scanner go= new Scanner(System.in);

int d= go.nextInt();
double fuel = go.nextDouble();

double avg= d/fuel;

System.out.printf("%.3f km/l\n", avg);
}
}