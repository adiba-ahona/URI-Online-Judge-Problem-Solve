public class task1155 {

 public static void main(String[] args)
 {
  float S = 0;
  for (float i = 1; i <= 100; i++) {
   S += (1 / i);
  }
  System.out.printf("%.2f\n",S);
 }
}