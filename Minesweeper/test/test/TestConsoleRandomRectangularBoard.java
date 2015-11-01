package test;

import displayGame.RectangularConsoleDisplayer;

public class TestConsoleRandomRectangularBoard extends AbstractTestConsoleBoard {

	public static void main(String[] args) {
		
		TestConsoleRandomRectangularBoard test = new TestConsoleRandomRectangularBoard();
		test.start();
	}
	
	protected void start() {
		startTest("--- TestConsoleRandomRectangularBoard ---", RectangularConsoleDisplayer.randomRectangularConsoleDisplayer(2, 15));
	}
}
