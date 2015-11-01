package gameData;

public class FlagCellDisplay extends AbstractCellDisplay {

	@Override
	public AbstractCellContent getCellContent() {
		return cellContent;
	}

	public FlagCellDisplay(AbstractCellContent cellContent) {
		super(cellContent);
	}

	@Override
	public void print() {
		System.out.print("F ");
	}
}
