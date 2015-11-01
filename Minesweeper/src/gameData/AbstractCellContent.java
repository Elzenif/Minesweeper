package gameData;

public abstract class AbstractCellContent {

	protected AbstractCell cell;
	protected int mineContained;
	protected AbstractCellDisplay cellDisplay;
	
	public abstract AbstractCell getCell();

	public int getMineContained() {
		return mineContained;
	}
	
	public AbstractCellDisplay getCellDisplay() {
		return cellDisplay;
	}

	protected void setCell(AbstractCell cell) {
		this.cell = cell;
	}
	
	protected abstract void setMineContained();
	
	protected void setCellDisplay(AbstractCellDisplay cellDisplay) {
		this.cellDisplay = cellDisplay;
	}
	
	protected void flagCell() {
		setCellDisplay(new FlagCellDisplay(this));
	}
	
	/**
	 * Reveal the cell content
	 * @return true if it contains a mine
	 */
	protected abstract boolean revealCell();
	
	public abstract void initializeAnyNeighbour();

	protected AbstractCellContent(AbstractCell cell) {
		setCell(cell);
		setMineContained();
		setCellDisplay(new UnknownCellDisplay(this));
	}
}
