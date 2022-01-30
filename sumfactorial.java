import java.util.*;
class sumfactorial
{
    public static void main(String args[])
    {
        	Scanner obj=new Scanner(System.in);
        	System.out.println("Enter a number");
        	int n=obj.nextInt();
        	sumfactorial fact=new sumfactorial();
        	fact.factorial(n);
        	fact.sum(n);
    }
    void factorial(int x)
    {
        	int i,fact=1;
        	for(i=1;i<=x;i++)
        	{
            		fact=fact*i;
        	}
        	System.out.println("Factorial of the number is "+fact);
    }
    void sum(int x)
    {
        	int r,sum=0;
        	while(x!=0)
        	{
            		r=x%10;
            		sum=sum+r;
            		x=x/10;
        	}
        	System.out.println("Sum of digits of the number is "+sum);
    }
}
