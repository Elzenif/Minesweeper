package gameData;

public class Game {

	public static void main(String[] args) {

		RectangularBoard board = new RectangularBoard(10, 10, 10);
		
		for (int i = 0; i < board.getLength(); i++) {
			System.out.println(board.getCell(i).getHasMine());
		}
	}

}
