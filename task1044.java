import java.util.Scanner;
public class task1044
{
public static void main(String[] args)
{
Scanner go = new Scanner(System.in);

int a = go.nextInt();
int b = go.nextInt();
if( b%a==0 || a%b==0 )
{
System.out.println("Sao Multiplos");
}
else
{
System.out.println("Nao sao Multiplos");
}
}
}