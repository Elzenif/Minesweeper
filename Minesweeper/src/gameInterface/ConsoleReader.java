package gameInterface;

import java.util.Scanner;

public class ConsoleReader extends AbstractReader {

	private Scanner scanner;
	
	public void setScanner() {
		scanner = new Scanner(System.in);
	}
	
	public ConsoleReader() {
		super();
		setScanner();
	}
	
	private int readNextInt() {
		return scanner.nextInt();
	}
	
	public int readNextInt(String message) {
		System.out.print(message);
		return readNextInt();
	}
	
	public void closeScanner() {
		scanner.close();
	}
}
