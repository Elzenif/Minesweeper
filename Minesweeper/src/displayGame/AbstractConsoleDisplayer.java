package displayGame;

import gameData.AbstractBoard;

public abstract class AbstractConsoleDisplayer {

	AbstractBoard board;
	
	public AbstractBoard getBoard() {
		return board;
	}
	
	protected AbstractConsoleDisplayer() {
	}
	
	public abstract void displayBoard();
}
