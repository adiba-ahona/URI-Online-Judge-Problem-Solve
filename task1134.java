import java.util.Scanner;

public class task1134 {

 public static void main(String[] args) {
  int X = 0; 
   int fuel = 0;
   int customerAlcohol = 0;
   int customerGasolin = 0;
   int customerDisel = 0;
  Scanner input = new Scanner(System.in);
  
  while (X != 4) {
   X = input.nextInt();
   if (X == 1) {
    customerAlcohol+=1;
   }else if (X == 2) {
    customerGasolin += 1;
   }else if (X == 3) {
    customerDisel += 1;
   }
  }
  System.out.print("MUITO OBRIGADO\n");
  System.out.print("Alcool: "+customerAlcohol+"\n");
  System.out.print("Gasolina: "+customerGasolin+"\n");
  System.out.print("Diesel: "+customerDisel+"\n");
 }
}