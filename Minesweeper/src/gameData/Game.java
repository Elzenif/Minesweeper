package gameData;

public class Game {

	public static void main(String[] args) {

		RectangularBoard board = new RectangularBoard(3, 3, 3);
		
		for (int i = 0; i < board.getLength(); i++) {
			System.out.println(board.getCell(i).getHasMine());
		}
	}

}
