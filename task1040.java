import java.util.Scanner;
public class task1040
{
public static void main(String[] args)
{
Scanner go = new Scanner(System.in);
double a = go.nextDouble();
double b = go.nextDouble();
double c = go.nextDouble();
double d = go.nextDouble();

double avg = (a+b+c+d)/4;
System.out.printf("Media: %.1f\n", avg);

if(avg>=7)
{
  System.out.println("Aluno aprovado.");
}
else if(avg<5)
{System.out.println("Aluno reprovado.");
}
else if(avg>=5 && avg<=6.9)
{
  System.out.println("Aluno em exame.");
 double x = go.nextDouble();
 System.out.printf("Nota do exame: %.1f\n", x);

double avg1 = (x+avg)/2;

if(avg1>=5)

  {System.out.println("Aluno aprovado.");
  System.out.printf("Media final: %.1f\n" ,avg1);
}
else if(avg1<=4.9){
  System.out.println("Aluno reprovado.");
  System.out.printf("Media final: %.1f\n" ,avg1);}
}
}
}