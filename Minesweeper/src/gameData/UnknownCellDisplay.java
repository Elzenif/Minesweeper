package gameData;

public class UnknownCellDisplay extends AbstractCellDisplay {

	@Override
	public AbstractCellContent getCellContent() {
		return cellContent;
	}
	
	public UnknownCellDisplay(AbstractCellContent cellContent) {
		super(cellContent);
	}

	@Override
	public void print() {
		System.out.print(". ");
	}

}
