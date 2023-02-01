import java.util.Scanner;
public class task1065
{
public static void main(String[] args)
{
Scanner go = new Scanner(System.in);

int i;
int n;
int even=0;
   
        for(i =1; i <= 5; i++){
              n =go.nextInt();
              if(n % 2 == 0){
                    even += 1;
              }
         }
          System.out.printf("%d valores pares\n", even);
  }
}