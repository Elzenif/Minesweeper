package gameData;

public abstract class AbstractCell {

	protected int index;
	protected AbstractBoard board;
	protected AbstractCellContent cellContent;

	public int getIndex() {
		return index;
	}

	public abstract AbstractBoard getBoard();

	public AbstractCellContent getCellContent() {
		return cellContent;
	}
		
	private void setIndex(int index) throws Exception {
		if (index < 0)
			throw new Exception("index too small : " + index);
		if (index >= board.getLength())
			throw new Exception("index : " + index + " greater than length : " + board.getLength());
		this.index = index;
	}
	
	protected abstract void setBoard(AbstractBoard board);
	
	protected abstract void setCellContent(boolean hasMine);

	protected AbstractCell(AbstractBoard board, int index) {
		try {
			setBoard(board);
			setIndex(index);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	protected void revealCell() {
		cellContent.setCellDisplay(CellDisplay.CONTENT);
	}
	
	protected void flagCell() {
		cellContent.setCellDisplay(CellDisplay.FLAG);
	}
}
