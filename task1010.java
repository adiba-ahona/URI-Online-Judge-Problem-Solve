import java.util.Scanner;
public class task1010
{
public static void main(String[]args)
{
Scanner meow = new Scanner(System.in);

int code1 = meow.nextInt();
int unit1 = meow.nextInt();
double price1 = meow.nextDouble();

int code2 = meow.nextInt();
int unit2 = meow.nextInt();
double price2 = meow.nextDouble();

double total = (unit1 * price1) + (unit2 * price2) ;

System.out.printf("VALOR A PAGAR: R$ %.2f\n", total);

}
}