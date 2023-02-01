import java.util.Scanner;
public class task1041
{
public static void main(String[] args)
{
Scanner go = new Scanner(System.in);
double x = go.nextDouble();
double y = go.nextDouble();

if(x==0.0 && y==0.0){
  System.out.println("Origem");}
else if((x<0.0 || x>0.0) && y==0.0)
{System.out.println("Exio X");
}
else if((y<0.0 || y>0.0) && x==0.0)
{System.out.println("Exio Y");
}
else if(x>0.0 && y>0.0)
{System.out.println("Q1");
}
else if(x<0.0 && y>0.0)
{System.out.println("Q2");
}

else if(x<0.0 && y<0.0)
{System.out.println("Q3");
}

else if(x>0.0 && y<0.0)
{System.out.println("Q4");
}
}
}