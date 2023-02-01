import java.util.Scanner;

public class task1154 
{
 public static void main(String[] args) 
 {
  int age;
  int totalNum = 0;
  int totalAge = 0;
  float ageAverage;
  Scanner hut =new Scanner(System.in);
  int i =1;
  while (((age = hut.nextInt()) >= 0)) {
   totalAge += age;
   totalNum += i;
  }
  ageAverage = (float)((float)totalAge / (totalNum));
  System.out.printf("%.2f\n",ageAverage);
 }
}