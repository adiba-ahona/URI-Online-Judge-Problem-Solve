import java.util.Scanner;
public class task1019
{
public static void main(String[] args)
{
  Scanner go = new Scanner(System.in);

int n = go.nextInt();  

int hour = n / 3600;
int minute = (n % 3600) / 60;
int second = (n % 3600) % 60;

System.out.printf("%d:%d:%d\n", hour , minute , second);
}
}