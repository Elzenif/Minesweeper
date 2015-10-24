package gameData;

import displayGame.ConsolePrint;

public abstract class AbstractCellContent implements ConsolePrint {

	AbstractCell cell;
	int mineContained;
	
	public abstract AbstractCell getCell();

	public int getMineContained() {
		return mineContained;
	}
	
	protected void setCell(AbstractCell cell) {
		this.cell = cell;
	}
	
	protected abstract void setMineContained();
	
	public abstract void initializeAnyNeighbour();

	protected AbstractCellContent(AbstractCell cell) {
		setCell(cell);
		setMineContained();
	}
}
