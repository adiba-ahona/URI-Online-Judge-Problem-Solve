import java.util.Scanner;
public class task1007
{
public static void main(String[]args)
{
Scanner meow = new Scanner(System.in);
int A = meow.nextInt();
int B = meow.nextInt();
int C = meow.nextInt();
int D = meow.nextInt();

int dif = (A*B)-(C*D);

System.out.println("DIFERENCA = " + dif);

}
}