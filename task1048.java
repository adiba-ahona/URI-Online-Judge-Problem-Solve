import java.util.Scanner;

public class task1048 
{
 public static void main(String[] args) 
 {
  float N;
  float new_salary = 0;
  float earn_Money = 0;
  int percent = 0;
  Scanner go =new Scanner(System.in);
  N =go.nextFloat();
  
  if (N >= 0 && N <= 400.00) {
   percent = 15;
   new_salary = (float) (N + (N * (percent /100.00)));
   earn_Money = (float) ((N * (percent /100.00)));
   
  }
  else if (N >= 400.01 && N <= 800.00) 
  {
   percent = 12;
   new_salary = (float) (N + (N * (percent /100.00)));
   earn_Money = (float) ((N * (percent /100.00)));
  }
  else if (N >= 800.01 && N <= 1200.00) 
  {
   percent = 10;
   new_salary = (float) (N + (N * (percent /100.00)));
   earn_Money = (float) ((N * (percent /100.00)));
   
  }
  else if (N >= 1200.01 && N <= 2000.00) 
  {
   percent = 7;
   new_salary = (float) (N + (N * (percent /100.00)));
   earn_Money = (float) ((N * (percent /100.00)));
  }
  else if (N >= 2000.01) 
  {
   percent = 4;
   new_salary = (float) (N + (N * (percent /100.00)));
   earn_Money = (float) ((N * (percent /100.00)));
  }
  
  System.out.printf("Novo salario: %.2f\n",new_salary);
  System.out.printf("Reajuste ganho: %.2f\n",earn_Money);
  System.out.print("Em percentual: "+percent+" %\n");

 }

}