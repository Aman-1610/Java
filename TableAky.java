import java.util.Scanner;
class TableAky
{
public static void main( String args[])
{
Scanner sc=new Scanner(System.in);
int i;
int n;
int c;
System.out.print("Enter the number whose table you want: ");
n=sc.nextInt();
System.out.println("Table of "+n);
for(i=1;i<=10;i++)
{
 c=n*i;
System.out.println(n + " * " + i +" = " + c);
}
}
}