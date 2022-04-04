import java.io.FileWriter;
import java.io.IOException;  
import java.util.Scanner;

public class ExpensesTracker{
  public static void main(String[] args){
  
    try {
	FileWriter fw = new FileWriter("expenses.txt",true);
	
	Scanner scan = new Scanner(System.in);
	
	String name,item;
	String y = "y";
	String n = "n";
	double price;
	String output;

		System.out.println("Input your name: ");
		name = scan.nextLine();

		System.out.println("What did you purchase: ");
		item = scan.nextLine();
		
		System.out.println("How much did you pay: ");
		price = scan.nextDouble();
		scan.nextLine();


		fw.write("<" + name + " > purchased < " + item + " > for < " + price + " > US Dollars.");
		
		
		System.out.println("Would you like to log another purchase?: (y/n)");
		output = scan.nextLine();
		
		
		while(output.equals(y)){
		
		System.out.println("Input your name: ");
		name = scan.nextLine();

		System.out.println("What did you purchase: ");
		item = scan.nextLine();

		System.out.println("How much did you pay: ");
		price = scan.nextDouble();
		scan.nextLine();

		System.out.println("Would you like to log another purchase?: ");
		output = scan.nextLine();

		fw.write("<" + name + " > purchased < " + item + " > for < " + price + " > US Dollars.");
		
		
	}


		if(output.equals(n)) { 

		System.out.println("Get off of ZoodMall!");
   	}
		
		




    } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
  }
}