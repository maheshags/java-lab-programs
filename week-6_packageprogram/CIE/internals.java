package CIE;
import java.util.Scanner;
public class internals extends student5{
	public int marks[] = new int[5];
	public void inputCIEmarks()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Internal Marks for the following Subjects out of 50 :");
		for (int i=0;i<5;i++)
		{
			System.out.println("Course "+(i+1)+":");
			marks[i]=s.nextInt();
		}
	}
}