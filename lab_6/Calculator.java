import java.util.Scanner;

public class Calculator {
    private int num1;
    private int num2;
    private String operator;

    // Constructor to initialize the calculator
    public Calculator() {
        // Get user input
        Scanner scanCalc = new Scanner(System.in);
	System.out.println("Input the first number: ");
	num1 = scanCalc.nextInt();	
	System.out.println("Input the operator: ");
	operator = scanCalc.nextLine();
	System.out.println("Input the second number: ");
	num2 = scanCalc.nextInt();
	

	if(operator == "+") {
		System.out.println(num1 + num2);
}	
	if(operator =="-") {
		System.out.println(num1 - num2);
}
	  if(operator == "*") {
		System.out.println(num1 * num2);
}
	 if(operator == "/") {
	System.out.println(num1 / num2);
}
	
	
	
    }

    public String add(int a, int b) {
	
		return a + "+" + b + "=" + (a+b);
       }
    

    public String subtract(int a, int b) {
	
		return a + "-" + b + "=" + (a-b);
       
    }

    public String multiply(int a, int b) {
   
		return a + "*" + b + "=" + (a*b);
    
}

    public String divide(int a, int b) {
     
		return a + "/" + b + "=" + (a/b);
	
    }
}