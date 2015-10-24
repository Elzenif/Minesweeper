package displayGame;

import gameData.IndexConverterRectangular;
import gameData.Random;
import gameData.RectangularBoard;

public class RectangularConsoleDisplayer extends AbstractConsoleDisplayer 
	implements IndexConverterRectangular, Random {

	@Override
	public RectangularBoard getBoard() {
		return (RectangularBoard) board;
	}
	
	protected void setBoard(int height, int width, int nbMines) {
		this.board = new RectangularBoard(height, width, nbMines);
	}
	
	public RectangularConsoleDisplayer(int min, int max) {
		super();
		int height = getRandom(min, max);
		int width = getRandom(min, max);
		int nbMines = getRandom(1, height * width / 2);
		setBoard(height, width, nbMines);
	}
	
	public RectangularConsoleDisplayer(int height, int width, int nbMines) {
		super();
		setBoard(height, width, nbMines);
	}

	@Override
	public void displayBoard() {
		for (int i = 0; i < getBoard().getHeight(); i++) {
			for (int j = 0; j < getBoard().getWidth(); j++) {
				int index = convertLineAndRowInIndex(i, j, getBoard().getWidth());
				board.getCell(index).getCellContent().print();
			}
			System.out.println("");	
		}
	}

}
