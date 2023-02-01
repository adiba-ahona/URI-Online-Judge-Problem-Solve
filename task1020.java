import java.util.Scanner;
public class task1020
{
public static void main(String[] args)
{
  Scanner go = new Scanner(System.in);

int n = go.nextInt();  

int year = n / 365;
int month = (n % 365) / 30;
int day = (n % 365) % 30;

System.out.println(year + " ano(s)");
System.out.println(month + " mes(es)");
System.out.println(day + " dia(s)");
}
}