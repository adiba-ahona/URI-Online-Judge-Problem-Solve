import java.util.Scanner;
public class task1114 {

 public static void main(String[] args) {
  int password = 2002; 
   int givenPassword;
  Scanner go = new Scanner(System.in);

  while ((givenPassword = go.nextInt()) != password) {
   System.out.print("Senha Invalida\n");
  }
  System.out.print("Acesso Permitido\n");
 }
}