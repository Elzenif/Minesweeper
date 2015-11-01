package gameData;

import displayGame.ConsolePrint;

public abstract class AbstractCellDisplay implements ConsolePrint {

	protected AbstractCellContent cellContent;
	
	public abstract AbstractCellContent getCellContent();
	
	private void setCellContent(AbstractCellContent cellContent) {
		this.cellContent = cellContent;
	}
	
	protected AbstractCellDisplay(AbstractCellContent cellContent) {
		setCellContent(cellContent);
	}
}
