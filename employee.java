import java.util.*;
class employee
{
    int eno,ephn;
    String ename;
    public static void main(String args[])
    {
        int i;
        employee obj[]=new employee[10];
        for(i=0;i<5;i++)
        {
            obj[i]=new employee();
            obj[i].read();
        }
        for(i=0;i<5;i++)
        {
            obj[i].display();
        }
    }
    void read()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter name of employee");
        ename=sc.nextLine();
        System.out.println("Enter employee number of employee");
        eno=sc.nextInt();
        System.out.println("Enter phone number of employee");
        ephn=sc.nextInt();
    }
    void display()
    {
        System.out.println("Name of employee is "+ename);
        System.out.println("Employee number of employee is "+eno);
        System.out.println("Phone number of employee is "+ephn);
    }
        
}
