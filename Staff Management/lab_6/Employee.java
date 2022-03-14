import java.util.Scanner;

public class Employee {
    // Initializing variables
	private String First_Name;
	private String Last_Name;
	private int age;
	private double salary;

	public Employee() {
        		Scanner scan = new Scanner(System.in) ;
		System.out.println("Please enter your first name: ");
		First_Name = scan.nextLine(); 
		
		System.out.println("Please enter your last name: ");	
		Last_Name = scan.nextLine();
		
		System.out.println("Please enter your age: ");
		age = scan.nextInt();
		
		System.out.println("Please enter your salary: ");
		salary = scan.nextDouble();
		
		}

	public String toString() {

		String out = "First Name: " + First_Name +
			"\n Last Name: " + Last_Name +
			"\n age: " + age +
			"\n salary: " + salary;
			
			return out;
		}
}
