package gameData;

import java.util.List;

public class RectangularNeighbours extends AbstractNeighbours implements IndexConverterRectangular {

	public RectangularCell getCell() {
		return (RectangularCell) cell;
	}
	
	public List<AbstractCell> getNeighbours() {
		return neighbours;
	}
	
	protected void setCell(AbstractCell cell) {
		this.cell = cell;
	}
	
	private void setRectangularNeighbours() {
		int line = getCell().getLine();
		int row = getCell().getRow();
		int width = getCell().getBoard().getWidth();
		int indexTopLeft = convertLineAndRowInIndex(line - 1, row - 1, width);
		int indexTop = convertLineAndRowInIndex(line - 1, row, width);
		int indexTopRight = convertLineAndRowInIndex(line - 1, row + 1, width);
		int indexLeft = convertLineAndRowInIndex(line, row - 1, width);
		int indexRight = convertLineAndRowInIndex(line, row + 1, width);
		int indexBottomLeft = convertLineAndRowInIndex(line + 1, row - 1, width);
		int indexBottom = convertLineAndRowInIndex(line + 1, row, width);
		int indexBottomRight = convertLineAndRowInIndex(line + 1, row + 1, width);
		if (!isOnTheTop(getCell())) {
			neighbours.add(getCell().getBoard().getCell(indexTop));
			if (!isOnTheLeft(getCell()))
				neighbours.add(getCell().getBoard().getCell(indexTopLeft));			
			if (!isOnTheRight(getCell()))
				neighbours.add(getCell().getBoard().getCell(indexTopRight));
		}
		if (!isOnTheLeft(getCell()))
			neighbours.add(getCell().getBoard().getCell(indexLeft));
		if (!isOnTheRight(getCell()))
			neighbours.add(getCell().getBoard().getCell(indexRight));
		if (!isOnTheBottom(getCell())) {
			neighbours.add(getCell().getBoard().getCell(indexBottom));
			if (!isOnTheLeft(getCell()))
				neighbours.add(getCell().getBoard().getCell(indexBottomLeft));
			if (!isOnTheRight(getCell()))
				neighbours.add(getCell().getBoard().getCell(indexBottomRight));		
		}
	}

	public RectangularNeighbours(RectangularCell cell) {
		super();
		setCell(cell);
		setRectangularNeighbours();
	}
	

	
}
