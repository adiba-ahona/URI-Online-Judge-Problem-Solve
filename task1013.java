import java.util.Scanner;
public class task1013
{
public static void main(String[] args)
{
  Scanner go= new Scanner(System.in);
  
int A = go.nextInt();
int B = go.nextInt();
int C = go.nextInt();

int MaiorAB = (A + B + Math.abs(A-B))/2;
int MaiorABC = (MaiorAB + C+ Math.abs(MaiorAB - C))/2;

System.out.println(MaiorABC + " eh o maior");
}
}