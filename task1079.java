import java.util.Scanner;

public class task1079 {

 public static void main(String[] args) {
  
  int N;
  float value1; 
  float value2; 
   float value3;
  float average;
  Scanner ho =new Scanner(System.in);
  N = ho.nextInt();
  
  for (int i = 1; i <= N; i++) {
   value1 = ho.nextFloat();
   value2 = ho.nextFloat();
   value3 = ho.nextFloat();
   average = ( value1*2 + value2*3 + value3*5 ) / 10;
   System.out.printf("%.1f\n", average);
  }
 }
}