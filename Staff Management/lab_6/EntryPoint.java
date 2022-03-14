import java.util.Scanner;

public class EntryPoint {
	public static void main (String[] args) {
       	
		Scanner scan = new Scanner (System.in);
		int val;
	
		System.out.println("Please select from 1 to 4 which code you want to choose");
		val = scan.nextInt();

			switch(val) {

			case 1:
				BasicWeek first = new BasicWeek();
				   first.printDays();
				break;

			case 2:
				AdvancedWeek second = new AdvancedWeek();
				second.printDays();
				break;
			case 3:
				Calculator third = new Calculator();
				break;

			case 4:
				Employee fourth = new Employee();
				fourth.toString();
				System.out.println(fourth);
				break;
			default:
				System.out.println("Please Enter a number from 1 through 4");

	}
				
		
    }
}