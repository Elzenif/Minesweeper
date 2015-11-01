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
		
	private void setIndex(int index) throws IllegalArgumentException {
		if (index < 0)
			throw new IllegalArgumentException("index too small : " + index);
		if (index >= board.getLength())
			throw new IllegalArgumentException("index : " + index + " greater than length : " + board.getLength());
		this.index = index;
	}
	
	protected abstract void setBoard(AbstractBoard board);
	
	protected abstract void setCellContent(boolean hasMine);

	protected AbstractCell(AbstractBoard board, int index) {
		try {
			setBoard(board);
			setIndex(index);
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * Reveal the cell content
	 * @return true if it contains a mine
	 */
	protected boolean revealCell() {
		return cellContent.revealCell();
	}
	
	protected void flagCell() {
		cellContent.flagCell();
	}
}
