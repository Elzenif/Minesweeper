package src;

public class Cell {

	private int index;
	private Board board;
	private AbstractNeighbours neighbours;

	public int getIndex() {
		return index;
	}

	public Board getBoard() {
		return board;
	}
	
	public AbstractNeighbours getNeighbours() {
		return neighbours;
	}

	private void setIndex(int index) throws Exception {
		if (index < 0)
			throw new Exception("index too small : " + index);
		if (index >= board.getLength())
			throw new Exception("index : " + index + " greater than length : " + board.getLength());
		this.index = index;
	}
	
	private void setBoard(Board board) {
		this.board = board;
	}
	
	private void setNeighbours() {
		switch (board.getBoardShape()) {
			case RECTANGULAR:
				neighbours = new RectangleNeighbours(this);
				break;
			default:
				neighbours = new RectangleNeighbours(this);
				break;
		}
	}

	public Cell(Board board, int index) {
		try {
			setBoard(board);
			setIndex(index);
			setNeighbours();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
