package gameData;

public class MineCellDisplay extends AbstractCellDisplay {

	@Override
	public AbstractMineCell getCellContent() {
		return (AbstractMineCell) cellContent;
	}

	public MineCellDisplay(AbstractCellContent cellContent) {
		super(cellContent);
	}

	@Override
	public void print() {
		System.out.print("X ");
	}

}
