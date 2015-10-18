package src;

public class RectangularCell extends AbstractCell implements IndexConverterRectangular {

	private int line;
	private int row;
		
	public int getLine() {
		return line;
	}

	public int getRow() {
		return row;
	}

	public RectangularBoard getBoard() {
		return (RectangularBoard) board;
	}
	
	public RectangularNeighbours getNeighbours() {
		return (RectangularNeighbours) neighbours;
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
		neighbours = new RectangularNeighbours(this);
	}
	
	public RectangularCell(RectangularBoard board, int index) {
		super(index);
		setBoard(board);
		setLine(index);
		setRow(index);
		setNeighbours();
	}

}
