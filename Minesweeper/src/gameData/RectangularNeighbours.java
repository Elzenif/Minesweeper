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
	
	@Override
	protected void setNeighbours() {
		int indexTop = convertLineAndRowInIndex(
				getCell().getLine() - 1,
				getCell().getRow(),
				getCell().getBoard().getWidth());
		int indexLeft = convertLineAndRowInIndex(
				getCell().getLine(),
				getCell().getRow() - 1 ,
				getCell().getBoard().getWidth());
		int indexBottom = convertLineAndRowInIndex(
				getCell().getLine() + 1,
				getCell().getRow(),
				getCell().getBoard().getWidth());
		int indexRight = convertLineAndRowInIndex(
				getCell().getLine(),
				getCell().getRow() + 1,
				getCell().getBoard().getWidth());
		if (!isOnTheTop(getCell()))
			neighbours.add(getCell().getBoard().getCell(indexTop));
		if (!isOnTheLeft(getCell()))
			neighbours.add(getCell().getBoard().getCell(indexLeft));
		if (!isOnTheBottom(getCell()))
			neighbours.add(getCell().getBoard().getCell(indexBottom));	
		if (!isOnTheRight(getCell()))
			neighbours.add(getCell().getBoard().getCell(indexRight));		
	}

	public RectangularNeighbours(RectangularCell cell) {
		super();
		setNeighbours();
	}
	

	
}
