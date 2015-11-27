package test;

import gameDisplay.AbstractConsoleDisplayer;

public abstract class AbstractTestConsoleBoard {
	
	protected void startTest(String testName, AbstractConsoleDisplayer consoleDisplayer) {
		System.out.println(testName);
		System.out.println("");
		System.out.println("Displaying the board");
		consoleDisplayer.displayBoard();
		System.out.println("");
		System.out.println("Revealing all the cells");
		consoleDisplayer.revealAllBoard();
		System.out.println("");
		System.out.println("Displaying the board");
		consoleDisplayer.displayBoard();		
		
	}
}
