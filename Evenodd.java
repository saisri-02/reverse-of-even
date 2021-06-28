import java.util.*;
class Evenodd
{
public static void main(String[] args) {
int n,even=0,odd=0,rem;
System.out.println("Enter n value : ");
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
while(n>0)
{
rem=n%10;
if(rem%2==0)
{
    even++;
}
else
{
    odd++;
}
n=n/10;
}
System.out.println("number of even digits = "+even);
System.out.println("number of odd digits = "+odd);
}
}
