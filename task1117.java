import java.util.Scanner;

public class task1117 {

 public static void main(String[] args) {
  
  float firstScore;
  float media = 0;
  float total = 0;
  float total2 = 0;
  Scanner input =new Scanner(System.in);

  while (total2 != 2) {
   firstScore =input.nextFloat();
   if (firstScore >=0.0 && firstScore <= 10.0) {
    total += firstScore;
    total2 += 1;
   }else {
    System.out.print("nota invalida\n");
   }
  }
  media =(float) total / 2;
  
  System.out.printf("media = %.2f\n",media);
  }
 }