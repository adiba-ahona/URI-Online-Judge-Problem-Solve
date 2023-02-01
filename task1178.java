import java.util.Scanner;
public class task1178 {
 public static void main(String[] args) {
  float T;
  int i;
  int j;
  float N[] =new float[100];
  Scanner input =new Scanner(System.in);
  T =input.nextFloat();
  
  for ( i = 0,j = 0; i < 100; j++,T /= 2,i++) {
   N[j] = T;
   
   System.out.print("N["+i+"] = ");
   System.out.printf("%.4f\n",N[j]);   
  }
 }
}