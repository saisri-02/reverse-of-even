import java.util.*;
class Revofeven
{
public static void main(String args[ ])
{
int n,m;
Scanner sc=new Scanner(System.in);
System.out.println("Enter n value : ");
n=sc.nextInt();
System.out.println("Enter m value : ");
m=sc.nextInt();
while(m>=n)
{
if(m%2==0)
System.out.println("Range of even numbers = "+m);
m--;
}
}
}