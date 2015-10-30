package gameData;

import displayGame.ConsolePrint;

public abstract class AbstractCellContent implements ConsolePrint {

	protected AbstractCell cell;
	protected int mineContained;
	protected CellDisplay cellDisplay;
	
	public abstract AbstractCell getCell();

	public int getMineContained() {
		return mineContained;
	}
	
	public boolean isHidden() {
		return cellDisplay.equals(CellDisplay.NOPE);
	}
	
	public boolean isRevealed() {
		return cellDisplay.equals(CellDisplay.CONTENT);
	}
	
	public boolean isFlag() {
		return cellDisplay.equals(CellDisplay.FLAG);
	}
	
	protected void setCell(AbstractCell cell) {
		this.cell = cell;
	}
	
	protected abstract void setMineContained();
	
	protected void setCellDisplay(CellDisplay cellDisplay) {
		this.cellDisplay = cellDisplay;
	}
	
	public abstract void initializeAnyNeighbour();

	protected AbstractCellContent(AbstractCell cell) {
		setCell(cell);
		setMineContained();
		setCellDisplay(CellDisplay.NOPE);
	}
}
