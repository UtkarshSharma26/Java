class Revdig
{
public static void main(String args[])
{
int n=947863;
int rev=0;
System.out.println("The Number is :"+n);
while(n!=0)
{
rev=rev*10;
rev=rev+n%10;
n = n/10;
}
System.out.println("The reverse of the Number is :"+rev);
}
}