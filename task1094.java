import java.util.Scanner;

public class task1094 {
 public static void main(String[] args) {
  int N;
   int X;
   int total = 0; 
   int total_C = 0; 
   int total_R = 0; 
   int total_S = 0;
  float total_C_percent = 0;
   float total_R_percent = 0; 
   float total_S_percent = 0;
  String animal_cha;
  Scanner input =new Scanner(System.in);
  N = input.nextInt();
  for (int i = 1; i <= N; i++) {
   X = input.nextInt();
   animal_cha =input.next();
   total += X;
   if (animal_cha.equals("C")) {
    total_C += X;
   }else if(animal_cha.equals("R")){
    total_R += X;
   }else if(animal_cha.equals("S")){
    total_S += X;
   }
   total_C_percent = (float)((total_C * 100.00) /total);
   total_R_percent = (float)((total_R * 100.00) /total);
   total_S_percent = (float)((total_S * 100.00) /total); 
  }
  System.out.print("Total: "+total+" cobaias\n");
  System.out.print("Total de coelhos: "+total_C+"\n");
  System.out.print("Total de ratos: "+total_R+"\n");
  System.out.print("Total de sapos: "+total_S+"\n");
  
  System.out.printf("Percentual de coelhos: %.2f",total_C_percent);
  System.out.print(" %\n");
  System.out.printf("Percentual de ratos: %.2f",total_R_percent);
  System.out.print(" %\n");
  System.out.printf("Percentual de sapos: %.2f",total_S_percent);
  System.out.print(" %\n");
 }
}