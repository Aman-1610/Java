import java.util.Scanner;

class HelloForAky
{
  public static void main(String[] args)
{
  Scanner sc=new Scanner(System.in);
  int i,n;
  System.out.print("Enter the number of times you want to print Hello: ");
  n=sc.nextInt();
  
  for(i=1;i<=n;i++)
{
  System.out.println("Hello");
}
}
}
