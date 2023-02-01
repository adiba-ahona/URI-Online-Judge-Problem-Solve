import java.util.Scanner;

public class task1041_1 {

 public static void main(String[] args) {
  float X; 
  float Y;
  Scanner hi =new Scanner(System.in);
  X = hi.nextFloat();
  Y = hi.nextFloat();
  if (X == 0.0 && Y == 0.0) 
  {
   System.out.print("Origem\n");
  }
  else if (X == 0.0 && Y != 0.0) 
  {
   System.out.print("Eixo Y\n");
  }
  else if (Y == 0.0 && X != 0.0) 
  {
   System.out.print("Eixo X\n");
  }else if (X > 0.0 && Y > 0.0) 
  {
   System.out.print("Q1\n");
  }else if (X < 0.0 && Y < 0.0) 
  {
   System.out.print("Q3\n");
  }else if (X < 0.0 && Y > 0.0) 
  {
   System.out.print("Q2\n");
  }else 
  {
   System.out.print("Q4\n");
  } 
 }
}