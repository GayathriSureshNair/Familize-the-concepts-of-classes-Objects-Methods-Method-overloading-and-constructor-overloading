import java.util.*;
class student
{
    	int c,r,m1,m2,m3,m4,m5;
    	String n;
    	public static void main(String args[]) 
	    {
       		student std =  new student();
       		std.read();
       		std.display();
    	}


    	void read()
	    {
        	Scanner obj= new Scanner(System.in);
        	System.out.print("Enter name of student: ");
        	n = obj.nextLine();
        	System.out.print("Enter class of student: ");
        	c = obj.nextInt();
        	System.out.print("Enter roll no of student: ");
        	r = obj.nextInt();
		      System.out.println("Enter the marks in the following subjects");
        	System.out.print("1st subject: ");
        	m1 = obj.nextInt();
        	System.out.print("2nd subject: ");
        	m2 = obj.nextInt();
        	System.out.print("3rd subject: ");
        	m3 = obj.nextInt();
        	System.out.print("4th subject: ");
        	m4 = obj.nextInt();
        	System.out.print("5th subject: ");
        	m5 = obj.nextInt();
        	obj.close();
    	}
            
    	void display() 
	    {
	        System.out.println("\nDisplaying the student details\n");
	        System.out.println("Name of the Student is " + n);
	        System.out.println("Class of the student is "+ c);
	        System.out.println("Roll no of the Student is " + r);
		      System.out.println("Marks of this student in different subjects are");
	        System.out.println("1st subject  :" + m1);
	        System.out.println("2nd subject  :" + m2);
	        System.out.println("3rd subject  :" + m3);
	        System.out.println("4th subject  :" + m4);
	        System.out.println("5th subject  :" + m5);
      }
    
}
