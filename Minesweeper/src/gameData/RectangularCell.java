package gameData;

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

	private void setLine(int index) {
		this.line = convertIndexInLine(index, getBoard().getWidth());
	}

	private void setRow(int index) {
		this.row = convertIndexInRow(index, getBoard().getWidth());
	}
	
	protected void setBoard(AbstractBoard board) {
		this.board = board;
	}
	
	@Override
	protected void setCellContent(boolean hasMine) {
		if (hasMine)
			cellContent = new RectangularMineCell(this);
		else
			cellContent = new RectangularSafeCell(this);
	}
	
	public RectangularCell(RectangularBoard board, int index) {
		super(board, index);
		setLine(index);
		setRow(index);
	}
}
