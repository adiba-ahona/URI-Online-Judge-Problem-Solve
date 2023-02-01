import java.util.Scanner;

public class task1061 
{
 public static void main(String[] args) 
 {
  Scanner sc =new Scanner(System.in);
  int day_i;
   int day_f; 
    int hour_i;
    int hour_f; 
    int minute_i;
   int  minute_f; 
   int second_i; 
    int second_f;
  int day = 0;
  int hour = 0; 
   int minute = 0; 
    int second = 0;
  boolean bool_h = false;
  boolean bool_m = false;
  boolean bool_s = false;

  //----------------------
 String string =sc.next();
  day_i =sc.nextInt();
  //----------------------
  hour_i =sc.nextInt();
  minute_i =sc.nextInt();
  second_i =sc.nextInt();
  string =sc.next();
  //----------------------
 string =sc.next();
  day_f =sc.nextInt();
  //----------------------
  hour_f =sc.nextInt();
  minute_f =sc.nextInt();
  string =sc.next();
  second_f =sc.nextInt();
  //----------------------

  if(hour_i > hour_f)
   bool_h = true;
  if(minute_i > minute_f)
   bool_m = true;
  if(second_i > second_f)
   bool_s = true;
  while(day_i != day_f)
  {
   day++;
   day_i++;
  }
  while(hour_i != hour_f)
  {
   hour++;
   hour_i++;
   if(hour_i == 25)
    hour_i = 1;
  }
  while(minute_i != minute_f)
  {
   minute++;
   minute_i++;
   if(minute_i == 61)
    minute_i = 1;
  }
  while(second_i != second_f)
  {
   second++;
   second_i++;
   if(second_i == 61)
    second_i = 1;
  }
  if(bool_h == true)
   day--;
  if(bool_m == true)
   hour--;
 if(bool_s == true)
   minute--;
 
  System.out.print(day+" dia(s)\n");
  System.out.print(hour+" hora(s)\n");
  System.out.print(minute+" minuto(s)\n");
  System.out.print(second+" segundo(s)\n");
 }
}