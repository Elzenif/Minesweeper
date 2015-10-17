package src;

public class RectangleCell extends AbstractCell implements IndexConverter {

	private int line;
	private int row;
		
	public int getLine() {
		return line;
	}

	public int getRow() {
		return row;
	}

	public RectangleBoard getBoard() {
		return (RectangleBoard) board;
	}
	
	public RectangleNeighbours getNeighbours() {
		return (RectangleNeighbours) neighbours;
	}

	private void setLine(int index) {
		this.line = convertIndexInLine(index, getBoard().getWidth());
	}

	private void setRow(int index) {
		this.row = convertIndexInRow(index, getBoard().getWidth());
	}
	
	protected void setBoard(AbstractBoard board) {
		this.board = board;
	}
	
	protected void setNeighbours() {
		neighbours = new RectangleNeighbours(this);
	}
	
	public RectangleCell(RectangleBoard board, int index) {
		super(index);
		setBoard(board);
		setLine(index);
		setRow(index);
		setNeighbours();
	}

}
