import java.util.Scanner;
public class Skeleton {
    public static void main(String[] args) {
       	Scanner scan = new Scanner(System.in);
		int Assignments, Attendances, Midterm;
		double Average, LabPercentage, MidPercentage;
		int Grades[]=new int[5];
		int sum = 0;
	for(int idx = 1; idx <= 5; idx++) {
		System.out.println("Input the grade for assignment " + idx + ": ");
		Assignments = scan.nextInt();
		Grades[idx-1] = Assignments;
	}
		
	System.out.println("Input the number of attended labs: ");
		Attendances = scan.nextInt();
	System.out.println("Input the midterm grade: ");
		Midterm = scan.nextInt();
	
	for(int i = 0; i < 5; i++) {
		sum += Grades[i];
	}

	Average = ((double)sum/5) * 0.3;
	LabPercentage = (Attendances* 100) * 0.05;
	MidPercentage = Midterm * 0.3;
	
	System.out.println("Assignments (30%): " + Average);
	System.out.println("Attendance (5%): " + LabPercentage);
	System.out.println("Midterm (30%): " + MidPercentage);


    }
}