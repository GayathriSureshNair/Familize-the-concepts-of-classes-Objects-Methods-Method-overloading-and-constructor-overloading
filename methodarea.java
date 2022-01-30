import java.util.*;
class methodarea
{
    	public static void main(String args[])
    	{
        	Scanner obj=new Scanner(System.in);
        	System.out.println("Enter radius of circle");
        	int rad=obj.nextInt();
        	methodarea sh=new methodarea();
        	sh.area(rad);
        	System.out.println("Enter length and breadth of rectangle");
        	int len=obj.nextInt();
        	int bread=obj.nextInt();
        	sh.area(len,bread);
        	System.out.println("Enter base and height of triangle");
        	float base=obj.nextFloat();
        	float height=obj.nextFloat();
        	sh.area(base,height);
    	}
    	void area(int r)
    	{
       	 	System.out.println("Area of circle is "+(3.14*r*r));
    	}
    	void area(int l,int b)
    	{
        	System.out.println("Area of rectangle is "+(l*b));
    	}	
    	void area(float b,float h)
    	{
        	System.out.println("Area of triangle is "+(0.5*b*h));
    	}
}
