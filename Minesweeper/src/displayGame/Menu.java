package displayGame;

public class Menu {

	private ConsoleReader consoleReader;

	public ConsoleReader getConsoleReader() {
		return consoleReader;
	}

	public void setConsoleReader() {
		consoleReader = new ConsoleReader();
	}

	public Menu() {
		setConsoleReader();
	}
	
	public void selectLevel() {		
		AbstractConsoleDisplayer consoleDisplayer;
		
		consoleDisplayer = RectangularConsoleDisplayer.randomRectangularConsoleDisplayer(2, 10);
		consoleDisplayer.displayBoard();
		
		consoleDisplayer = RectangularConsoleDisplayer.standardRectangularConsoleDisplayer(consoleReader);
		consoleDisplayer.displayBoard();
	}
	
}
