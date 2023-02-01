import java.util.Scanner;
public class task1009
{
public static void main(String[]args)
{
Scanner meow = new Scanner(System.in);

String name = meow.nextLine();
double salary = meow.nextDouble();
double sales = meow.nextDouble();

double total = ((sales * 15) / 100) + salary;

System.out.printf("TOTAL = R$ %.2f\n", total);

}
}