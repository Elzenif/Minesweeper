package displayGame;

public class Game {

	public static void main(String[] args) {

		AbstractConsoleDisplayer consoleDisplayer = new RectangularConsoleDisplayer(5, 5, 5);
		consoleDisplayer.displayBoard();
	}
	

}
