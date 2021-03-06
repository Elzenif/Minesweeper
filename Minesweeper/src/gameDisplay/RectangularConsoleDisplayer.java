package gameDisplay;

import gameData.IndexConverterRectangular;
import gameData.Random;
import gameData.RectangularBoard;
import gameInterface.ConsoleReader;

public class RectangularConsoleDisplayer extends AbstractConsoleDisplayer 
	implements IndexConverterRectangular, Random {
	
	@Override
	public RectangularBoard getBoard() {
		return (RectangularBoard) board;
	}
	
	protected void setBoard(int height, int width, int nbMines) {
		this.board = new RectangularBoard(height, width, nbMines);
	}
	
	private RectangularConsoleDisplayer(int height, int width, int nbMines) {
		super();
		setBoard(height, width, nbMines);
	}

	@Override
	public void displayBoard() {
		for (int i = 0; i < getBoard().getHeight(); i++) {
			for (int j = 0; j < getBoard().getWidth(); j++) {
				int index = convertLineAndRowInIndex(i, j, getBoard().getWidth());
				board.getCell(index).getCellContent().getCellDisplay().print();
			}
			System.out.println("");	
		}
	}
	
	public static RectangularConsoleDisplayer randomRectangularConsoleDisplayer(int min, int max) {
		int height = Random.getRandom(min, max);
		int width = Random.getRandom(min, max);
		int nbMines = Random.getRandom(height * width / 6, height * width / 2);
		return new RectangularConsoleDisplayer(height, width, nbMines);		
	}
	
	public static RectangularConsoleDisplayer randomRectangularConsoleDisplayer(ConsoleReader consoleReader) {
		int min = consoleReader.readNextInt("Minimum " );
		int max = consoleReader.readNextInt("Maximum " );
		return randomRectangularConsoleDisplayer(min, max);
	}

	public static RectangularConsoleDisplayer standardRectangularConsoleDisplayer(ConsoleReader consoleReader) {
		int height = consoleReader.readNextInt("Height : ");
		int width = consoleReader.readNextInt("Width : ");
		int nbMines  = consoleReader.readNextInt("Number of mines : ");
		return new RectangularConsoleDisplayer(height, width, nbMines);
	}
	
	public static RectangularConsoleDisplayer easyRectangularConsoleDisplayer() {
		return new RectangularConsoleDisplayer(10, 10, 10);
	}
}
