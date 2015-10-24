package gameData;

import java.util.List;

public class RectangularNeighbours extends AbstractNeighbours implements IndexConverterRectangular {

	@Override
	public RectangularSafeCell getSafeCell() {
		return (RectangularSafeCell) safeCell;
	}
	
	public List<AbstractCell> getNeighbours() {
		return neighbours;
	}
	
	private void setRectangularNeighbours() {
		RectangularCell cell = getSafeCell().getCell();
		
		int line = cell.getLine();
		int row = cell.getRow();
		int width = cell.getBoard().getWidth();
		int indexTopLeft = convertLineAndRowInIndex(line - 1, row - 1, width);
		int indexTop = convertLineAndRowInIndex(line - 1, row, width);
		int indexTopRight = convertLineAndRowInIndex(line - 1, row + 1, width);
		int indexLeft = convertLineAndRowInIndex(line, row - 1, width);
		int indexRight = convertLineAndRowInIndex(line, row + 1, width);
		int indexBottomLeft = convertLineAndRowInIndex(line + 1, row - 1, width);
		int indexBottom = convertLineAndRowInIndex(line + 1, row, width);
		int indexBottomRight = convertLineAndRowInIndex(line + 1, row + 1, width);

		addNeighbours(!isOnTheLeft(cell) && !isOnTheTop(cell), indexTopLeft);
		addNeighbours(!isOnTheTop(cell), indexTop);
		addNeighbours(!isOnTheRight(cell) && ! isOnTheTop(cell), indexTopRight);
		addNeighbours(!isOnTheLeft(cell), indexLeft);
		addNeighbours(!isOnTheRight(cell), indexRight);
		addNeighbours(!isOnTheLeft(cell) && !isOnTheBottom(cell), indexBottomLeft);
		addNeighbours(!isOnTheBottom(cell), indexBottom);
		addNeighbours(!isOnTheRight(cell) && !isOnTheBottom(cell), indexBottomRight);
	}

	public RectangularNeighbours(RectangularSafeCell safeCell) {
		super(safeCell);
		setRectangularNeighbours();
	}
	

	
}
