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
	
	protected AbstractMineCell(AbstractCell cell) {
		super(cell);
	}
	
	@Override
	public void print() {
		switch (cellDisplay) {
			case NOPE:
				System.out.print(". ");
				break;
			case FLAG:
				System.out.print("F ");
				break;
			case CONTENT:
				System.out.print("X ");
				break;
			default:
				System.out.print(". ");
				break;
		}
	}
}
