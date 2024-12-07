package CIE;
import java.util.Scanner;
public class student5{
	protected String usn = new String();
	protected String name = new String();
	protected int sem;
	public void inputStudentDetails()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Student USN :");
		usn=s.next();
		System.out.println("Enter Student Name :");
		name=s.next();
		System.out.println("Enter Student Semester :");
		sem=s.nextInt();
	}
	public void displayStudentDetails()
	{
		System.out.println("USN of the Student : "+ usn);
		System.out.println("Name of the Student : "+ name);
		System.out.println("Semester of the Student : "+ sem);	
	}
}