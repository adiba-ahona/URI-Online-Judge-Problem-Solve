import java.util.Scanner;     //BANKNOTES AND COINS
public class task1021
{
  public static void main(String[] args)
  {
  Scanner uk = new Scanner(System.in);
  double m = uk.nextDouble();
  double dec = (int)(m*100);
  dec = dec - (int)(m)*100;
  
  
  int n100,n50,n20,n10,n5,n2,n1;
  double r;
      
        n100 = (int)m/100;
       
       r=(m%100);
       n50 = (int)r/50;
       
       r = r%50;
       n20 = (int)r/20;
       
       r= r%20;
       n10 = (int)r/10;
       
       r = r%10;
       n5 = (int)r/5;
       
       r = r%5;
       n2 = (int)r/2;
       
       r = r%2;
       n1 =(int)r;
       
       System.out.println("NOTAS:");
      System.out.println(n100+" nota(s) de R$ 100.00");
      System.out.println(n50+" nota(s) de R$ 50.00");
      System.out.println(n20+" nota(s) de R$ 20.00");
      System.out.println(n10+" nota(s) de R$ 10.00");
      System.out.println(n5+" nota(s) de R$ 5.00");
      System.out.println(n2+" nota(s) de R$ 2.00");
      System.out.println("MOEDAS:");
      System.out.println(n1+" moeda(s) de R$ 1.00");
      int m50,m25,m10,m5,m1;
       
      m50 =(int) (dec/(0.50*100));
      System.out.println(m50+" moeda(s) de R$ 0.50");
      dec = dec%(0.50*100);
      m25 = (int)(dec/(.25*100));
      System.out.println(m25+" moeda(s) de R$ 0.25");
      dec = dec%(0.25*100);
      m10 = (int)(dec/(.10*100));
       System.out.println(m10+" moeda(s) de R$ 0.10");
       dec = dec%(0.10*100);
       m5 =(int)(dec/(0.05*100));
       System.out.println(m5+" moeda(s) de R$ 0.05");
       dec = dec%(0.05*100);
       m1 =(int)(dec/(.01*100));
       System.out.println(m1+" moeda(s) de R$ 0.01"); 
  }
}
