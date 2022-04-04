import java.io.FileWriter;  // Import the FileWriter class
import java.io.IOException;  // Import the IOException class to handle errors
import java.util.Scanner;

public class ExpensesTracker{
  public static void main(String[] args){
  
    try {
	FileWriter fw = new FileWriter("expenses.txt",true);
	
	Scanner scan = new Scanner(System.in);
	
	String name,item;
	String yes = "y";
	String no = "no";
	double price;
	String out;

		System.out.println("Input your name: ");
		name = scan.nextLine();

		System.out.println("What did you purchase: ");
		item = scan.nextLine();
		
		System.out.println("How much did you pay: ");
		price = scan.nextDouble();

		fw.write("<" + name + " > purchased < " + item + " > for < " + price + " > US Dollars.");
		
		
		System.out.println("Would you like to log another purchase?: ");
		out = scan.nextLine();
		
		
		while(out.equals(yes)){
		
		System.out.println("Input your name: ");
		name = scan.nextLine();

		System.out.println("What did you purchase: ");
		item = scan.nextLine();
		
		System.out.println("How much did you pay: ");
		price = scan.nextDouble();

		fw.write("<" + name + " > purchased < " + item + " > for < " + price + " > US Dollars.");
		
		String skip;
		System.out.println();
		skip = scan.nextLine();

		System.out.println("Would you like to log another purchase?: ");
		out = scan.nextLine();
		
	}
		




        
      // If you have already have a expenses.txt file, you need to delete it
      // before you compile your code again

    } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
  }
}
