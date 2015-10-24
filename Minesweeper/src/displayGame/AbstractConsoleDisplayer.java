package displayGame;

import gameData.AbstractBoard;

public abstract class AbstractConsoleDisplayer {

	AbstractBoard board;
	
	public AbstractBoard getBoard() {
		return board;
	}
	
	public AbstractConsoleDisplayer() {
	}
	
	public abstract void displayBoard();
}
