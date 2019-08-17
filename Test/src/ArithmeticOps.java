import java.io.File;
import java.util.Scanner;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

class InvalidMultiplyZeroOperation extends Exception {
	InvalidMultiplyZeroOperation(String s) {
		super(s);
	}
}

public class ArithmeticOps {

	static Logger logger = Logger.getLogger(ArithmeticOps.class);

	// PropertiesConfigurator is used to configure logger from properties file

	public static void main(String[] args) {
		String log4jConfigFile = System.getProperty("user.dir") + File.separator + "log4j.properties";
		PropertyConfigurator.configure(log4jConfigFile);
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the 1st No");
		int i = scan.nextInt();
		System.out.println("Enter the 2nd No");
		int j = scan.nextInt();

		ArithmeticOps ar = new ArithmeticOps();
		System.out.println(ar.AddOperation(i, j));
		System.out.println(ar.SubtractOperation(i, j));
		System.out.println(ar.MultiplyOperation(i, j));
		System.out.println(ar.DivideOpeartion(i, j));

	}

	public int AddOperation(int a, int b) {
		return a + b;
	}

	public int SubtractOperation(int a, int b) {
		return a - b;
	}

	public int MultiplyOperation(int a, int b) {
		int result = 0;
		if (a == 0 || b == 0) {
			logger.debug("Zero is not allowd", new InvalidMultiplyZeroOperation("not valid"));
		} else {
			result = a * b;
		}

		return result;
	}

	public int DivideOpeartion(int a, int b) {
		int result = 0;
		if (b == 0) {
			logger.debug("Zero is not allowed", new ArithmeticException());
		} else {
			result = a / b;
		}
		return result;
	}

}
