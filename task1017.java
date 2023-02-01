import java.util.Scanner;
public class task1017
{
public static void main(String[] args)
{
  Scanner go = new Scanner(System.in);
  
int hour = go.nextInt();
int speed = go.nextInt();

double fuel = (hour * speed)/12.0;

System.out.printf("%.3f\n", fuel);
}
}