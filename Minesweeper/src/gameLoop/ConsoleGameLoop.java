package gameLoop;

import gameDisplay.AbstractConsoleDisplayer;
import gameDisplay.ConsoleMenu;

public class ConsoleGameLoop {

	private ConsoleMenu menu;
	private boolean continuing;
	
	public ConsoleGameLoop() {
		menu = new ConsoleMenu();
		continuing = true;
	}
	
	public void loop() {
		while (continuing) {
			menu.intro();
			AbstractConsoleDisplayer consoleDisplayer = menu.selectLevel();
			if (consoleDisplayer != null) {
				consoleDisplayer.displayBoard();
			} else {
				System.out.println("Error while selecting the level");
			}
			continuing = false;
		}
	}
}
