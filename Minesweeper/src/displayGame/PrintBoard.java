package displayGame;

import gameData.IndexConverterRectangular;
import gameData.RectangularBoard;

public class PrintBoard implements IndexConverterRectangular {

	public PrintBoard() {

		RectangularBoard board = new RectangularBoard(5, 5, 1);
		
		for (int i = 0; i < board.getHeight(); i++) {
			for (int j = 0; j < board.getWidth(); j++) {
				System.out.print(board.getCell(convertLineAndRowInIndex(i, j, 3))
						.getHasMine() + " ");
			}
			System.out.println("");
		}
		for (int i = 0; i < board.getHeight(); i++) {
			for (int j = 0; j < board.getWidth(); j++) {
				System.out.print(board.getCell(convertLineAndRowInIndex(i, j, 3))
						.getNumberOfNeighboursMines() + " ");
			}
			System.out.println("");
		}
	}
}
