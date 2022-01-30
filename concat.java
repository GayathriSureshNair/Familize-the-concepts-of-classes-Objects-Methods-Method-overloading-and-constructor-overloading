import java.util.*;
class concat
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first string");
        String str1=sc.nextLine();
        System.out.println("Enter second string");
        String str2=sc.nextLine();
        concat obj =new concat();
        obj.concatenate(str1,str2);
        System.out.println("Enter first number");
        int num1=sc.nextInt();
        System.out.println("Enter second number");
        int num2=sc.nextInt();
        obj.concatenate(num1,num2);
    }
    void concatenate(int a,int b)
    {
        System.out.println("Concatenated number is "+a+b);
    }
    void concatenate(String s,String c)
    {
        System.out.println("Concatenated string is "+s+c);
    }
}
