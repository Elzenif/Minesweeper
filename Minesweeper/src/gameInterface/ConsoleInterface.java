package gameInterface;

public class ConsoleInterface {

	private ConsoleReader consoleReader;

	public ConsoleReader getConsoleReader() {
		return consoleReader;
	}

	private void setConsoleReader() {
		consoleReader = new ConsoleReader();
	}

	public ConsoleInterface() {
		setConsoleReader();
	}

}
