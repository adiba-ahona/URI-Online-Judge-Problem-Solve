import java.util.Scanner;

public class task1064 {
 public static void main(String[] args) {
  float n1;
   float total = 0;
   float average = 0;
  int totalNumber = 0;
  Scanner sc =new Scanner(System.in);
  for (int i = 1; i <= 6; i++) {
   n1 =sc.nextFloat();
   if (n1 > 0) {
    totalNumber += 1;
    total += n1;
   }
  }
  average = total / totalNumber;
  System.out.print(totalNumber+" valores positivos\n");
  System.out.printf("%.1f\n",average);
 }
}