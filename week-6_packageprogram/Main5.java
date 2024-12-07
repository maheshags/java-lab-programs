import SEE.externals;
import java.util.Scanner;
public class Main5{
    public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.println("Enter number of students: ");
        int n = s.nextInt();
	externals[] students = new externals[n];
	for (int i = 0; i < n; i++) {
            students[i] = new externals();
            students[i].inputStudentDetails(); 
            students[i].inputCIEmarks();       
            students[i].inputSEEmarks();       
            students[i].calculateFinalMarks(); 
        }
	for (int i = 0; i < n; i++) {
            students[i].displayFinalMarks();
        }
	System.out.println("Kushal Naidu N \n24BECS408");
}
}