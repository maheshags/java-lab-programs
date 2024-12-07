package SEE;
import CIE.internals;
import java.util.Scanner;
public class externals extends internals {
	protected int externalmarks[];
	protected int finalMarks[];
	public externals(){
		externalmarks=new int[5];
		finalMarks = new int[5];
	}
	public void inputSEEmarks() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter External marks for 5 courses for 100: ");
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter marks for course " + (i + 1) + ": ");
            externalmarks[i] = s.nextInt();
        }
    	}
	public void calculateFinalMarks(){
		for (int i = 0; i < 5; i++) {
            		finalMarks[i] = marks[i] + externalmarks[i]/2;        	
		}
    	}
	public void displayFinalMarks(){
		displayStudentDetails();
		System.out.println("Final Marks: ");
        	for (int i = 0; i < 5; i++) {
            		System.out.println("Course "+(i+1)+":"+finalMarks[i]);
        	}
	}
}