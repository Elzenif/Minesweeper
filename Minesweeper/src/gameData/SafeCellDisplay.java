package gameData;

public class SafeCellDisplay extends AbstractCellDisplay {

	@Override
	public AbstractSafeCell getCellContent() {
		return (AbstractSafeCell) cellContent;
	}

	public SafeCellDisplay(AbstractCellContent cellContent) {
		super(cellContent);
	}

	@Override
	public void print() {
		System.out.print(getCellContent().getNumberOfNeighboursMines() + " ");
	}

}
