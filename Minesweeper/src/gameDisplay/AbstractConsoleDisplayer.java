package gameDisplay;

import gameData.AbstractBoard;

public abstract class AbstractConsoleDisplayer {

	protected AbstractBoard board;
	
	public AbstractBoard getBoard() {
		return board;
	}
		
	public abstract void displayBoard();
	
	public void revealAllBoard() {
		for (int i = 0; i < getBoard().getLength(); i++) {
			getBoard().revealCell(i);
		}
	}
}
