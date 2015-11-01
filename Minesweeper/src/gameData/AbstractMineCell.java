package gameData;

public abstract class AbstractMineCell extends AbstractCellContent {

	@Override
	public void initializeAnyNeighbour() {
		// does not have any neighbour so there is nothing to do
	}

	@Override
	protected void setMineContained() {
		mineContained = 1;
	}
	
	@Override
	protected boolean revealCell() {
		setCellDisplay(new MineCellDisplay(this));
		return true;
	}
	
	protected AbstractMineCell(AbstractCell cell) {
		super(cell);
	}
	
}
