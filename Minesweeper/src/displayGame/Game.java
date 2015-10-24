package displayGame;

public class Game {

	public static void main(String[] args) {
		
		AbstractConsoleDisplayer consoleDisplayer = new RectangularConsoleDisplayer(2, 10);
		consoleDisplayer.displayBoard();
	}
	

}
