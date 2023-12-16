import java.util.Scanner;
class NaturalNoAky
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int i;
int n;
System.out.println("ENter the last number till where you want to print natural numbers:");
n=sc.nextInt();
System.out.print("Natural Numbers are : ");
for(i=1;i<=n;i++)
{
System.out.print(" "+i);
}
}
}