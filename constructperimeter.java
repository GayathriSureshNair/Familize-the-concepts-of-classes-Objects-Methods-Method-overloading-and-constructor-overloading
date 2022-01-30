import java.util.*;
class constructperimeter
{
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter radius of circle");
        int rad=obj.nextInt();
        constructperimeter cp=new constructperimeter(rad);
        System.out.println("Enter length and breadth of rectangle");
        int len=obj.nextInt();
        int bread=obj.nextInt();
        cp=new constructperimeter(len,bread);
    }
    constructperimeter(int r)
    {
        System.out.println("Perimeter of circle is "+(2*3.14*r));
    }
    constructperimeter(int l,int b)
    {
        System.out.println("Area of rectangle is "+(2*(l+b)));
    }
}
