package test;

import gameDisplay.RectangularConsoleDisplayer;

public class TestConsoleEasyRectangularBoard extends AbstractTestConsoleBoard {

	public static void main(String[] args) {
		
		TestConsoleEasyRectangularBoard test = new TestConsoleEasyRectangularBoard();
		test.start();

	}
	protected void start() {
		startTest("--- TestConsoleEasyRectangularBoard ---", RectangularConsoleDisplayer.easyRectangularConsoleDisplayer());
	}
	
}
