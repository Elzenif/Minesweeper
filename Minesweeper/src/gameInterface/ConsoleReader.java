package gameInterface;

import java.util.Scanner;

public class ConsoleReader {

	private Scanner scanner;
	
	public void setScanner() {
		scanner = new Scanner(System.in);
	}
	
	public ConsoleReader() {
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
