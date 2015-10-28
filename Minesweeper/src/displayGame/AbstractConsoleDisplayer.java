package displayGame;

import gameData.AbstractBoard;

public abstract class AbstractConsoleDisplayer {

	protected AbstractBoard board;
	
	public AbstractBoard getBoard() {
		return board;
	}
		
	public abstract void displayBoard();
}
