package displayGame;

import gameData.IndexConverterRectangular;
import gameData.RectangularBoard;

public class RectangularConsoleDisplayer extends AbstractConsoleDisplayer implements IndexConverterRectangular {

	@Override
	public RectangularBoard getBoard() {
		return (RectangularBoard) board;
	}
	
	protected void setBoard(int height, int width, int nbMines) {
		this.board = new RectangularBoard(height, width, nbMines);
	}
	
	public RectangularConsoleDisplayer(int height, int width, int nbMines) {
		super();
		setBoard(height, width, nbMines);
	}

	@Override
	public void displayBoard() {
		for (int i = 0; i < getBoard().getHeight(); i++) {
			for (int j = 0; j < getBoard().getWidth(); j++) {
				if (board.getCell(convertLineAndRowInIndex(i, j, getBoard().getWidth())).getHasMine())
					System.out.print("X ");
				else
					System.out.print(board.getCell(convertLineAndRowInIndex(i, j, getBoard().getWidth()))
							.getNumberOfNeighboursMines() + " ");
			}
			System.out.println("");	
		}
	}

}
