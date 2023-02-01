import java.util.Scanner;

public class task1118 {

 public static void main(String[] args) {
  int totalValid = 0;
  int X = 0;
  float score1;
  float total = 0;
  float average;
  Scanner input =new Scanner(System.in);
  while (X != 2) {
   
   while (totalValid != 2) {
    score1 =input.nextFloat();
    if (score1 >=0.0 && score1 <= 10.0) {
     total += score1;
     totalValid += 1;
     
    }else {
     System.out.print("Nota invalida\n");
    }
    average =(float) total / 2;   
    System.out.printf("media = %.2f\n",average);   
   }  
   X = input.nextInt();
   if (X == 1) {
    System.out.println("novo calculo (1-sim 2-nao)\n");
   } 
  }
 }
}