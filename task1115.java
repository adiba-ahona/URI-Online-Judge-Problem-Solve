import java.util.Scanner;
public class task1115 {

 public static void main(String[] args) {
  int firstsign;
  int secondSign;
  Scanner input =new Scanner(System.in);
  while (((firstsign =input.nextInt()) != 0) &&((secondSign =input.nextInt()) != 0) ) 
  {
   if (firstsign > 0 && secondSign > 0) 
   {
    System.out.print("primeiro\n");
   }
   else if (firstsign > 0 && secondSign < 0) 
   {
    System.out.print("quarto\n");
   }
   else if(firstsign < 0 && secondSign < 0)
   {
    System.out.print("terceiro\n");
   }
   else if (firstsign < 0 && secondSign > 0) 
   {
    System.out.print("segundo\n");
   }
  }
 }
}