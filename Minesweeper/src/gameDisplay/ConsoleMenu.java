package gameDisplay;

import gameInterface.ConsoleInterface;
import gameInterface.ConsoleReader;

public class ConsoleMenu {

	private ConsoleInterface consoleInterface;

	public ConsoleInterface getConsoleInterface() {
		return consoleInterface;
	}
	
	private void setConsoleInterface() {
		consoleInterface = new ConsoleInterface();
	}
	
	public ConsoleMenu() {
		setConsoleInterface();
	}
	
	public void start() {
		System.out.println("--- Welcome to Mineweeper ---");
		AbstractConsoleDisplayer consoleDisplayer = selectLevel();
		if (consoleDisplayer != null) {
			consoleDisplayer.displayBoard();
		} else {
			System.out.println("Erreur: consoleDisplayer is null");
		}
	}
	
	private AbstractConsoleDisplayer selectLevel() {		
		AbstractConsoleDisplayer consoleDisplayer = null;
		ConsoleReader consoleReader = consoleInterface.getReader();
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
