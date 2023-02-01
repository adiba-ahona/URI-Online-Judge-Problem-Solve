import java.util.Scanner;
public class task1018
{
public static void main(String[] args)
 {
Scanner go = new Scanner(System.in);
int n = go.nextInt();

int hundred = n / 100 ;
int fifty = (n % 100) / 50 ; 
int twenty = ((n % 100 ) % 50) / 20; 
int ten = (((n % 100 ) % 50) % 20) / 10 ; 
int five = ((((n % 100 ) % 50) % 20) % 10 ) / 5; 
int two = (((((n % 100 ) % 50) % 20) % 10 ) % 5 ) / 2 ; 
int one = ((((((n % 100 ) % 50) % 20) % 10 ) % 5 ) % 2 ) / 1; 

System.out.println(n);
System.out.println(hundred + " nota (s) de R$ 100,00");
System.out.println(fifty + " nota (s) de R$ 50,00");
System.out.println(twenty + " nota (s) de R$ 20,00");
System.out.println(ten + " nota (s) de R$ 10,00");
System.out.println(five + " nota (s) de R$ 5,00");
System.out.println(two + " nota (s) de R$ 2,00");
System.out.println(one + " nota (s) de R$ 1,00");
  }
}
  