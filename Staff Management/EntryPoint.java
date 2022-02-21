import java.util.Scanner;
public class EntryPoint {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please input the employee's first name: ");
		String First_Name = scan.nextLine();
		System.out.println("Please input the employee's last name: ");
		String Last_Name = scan.nextLine();
		System.out.println("Please input the employee's age: ");
		int age = scan.nextInt();
		System.out.println("Please input the employee's monthly salary: ");
		double Monthly_Salary = scan.nextDouble();
		DecimalFormat fmt = new DecimalFormat(#,###);
		System.out.println(First_Name + Last_Name + "," + age + "," + Monthly_Salary);
		
		

	}
}