package gameDisplay;

public class ConsoleMenu {

	private ConsoleReader consoleReader;

	public ConsoleReader getConsoleReader() {
		return consoleReader;
	}

	private void setConsoleReader() {
		consoleReader = new ConsoleReader();
	}

	public ConsoleMenu() {
		setConsoleReader();
	}
	
	public void start() {
		System.out.println("--- Welcome to Mineweeper ---");
		AbstractConsoleDisplayer consoleDisplayer = selectLevel();
		if (consoleDisplayer != null) {
			consoleDisplayer.displayBoard();
		} else {
			
		}
	}
	
	private AbstractConsoleDisplayer selectLevel() {		
		AbstractConsoleDisplayer consoleDisplayer = null;

		String message = "";
		message += "Which type of Minesweeper would you like to play ?\n";
		message += "1. Rectangular\n";
		message += "0. Quit\n";
		
		switch (consoleReader.readNextInt(message))
		{
			case 1:
				message = "";
				message += "Which kind of generation would you like ?\n";
				message += "1. Custom\n";
				message += "2. Random\n";
				message += "3. Easy\n";
				message += "0. Quit\n";
				switch (consoleReader.readNextInt(message)) {
					case 1:
						consoleDisplayer = RectangularConsoleDisplayer.standardRectangularConsoleDisplayer(consoleReader);
						break;
					case 2:
						consoleDisplayer = RectangularConsoleDisplayer.randomRectangularConsoleDisplayer(consoleReader);
						break;
					case 3:
						consoleDisplayer = RectangularConsoleDisplayer.easyRectangularConsoleDisplayer();
						
					default:
						break;
				}
				break;
			default:
				break;
		}
		return consoleDisplayer;
	}
	
}
