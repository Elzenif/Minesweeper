package src;

import java.util.List;

public class RectangleNeighbours extends AbstractNeighbours implements IndexConverter {

	public RectangleCell getCell() {
		return (RectangleCell) cell;
	}
	
	public List<AbstractCell> getNeighbours() {
		return neighbours;
	}
	
	protected void setCell(AbstractCell cell) {
		this.cell = cell;
	}
	
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
		if (!isOnTheTop())
			neighbours.add(getCell().getBoard().getCell(indexTop));
		if (!isOnTheLeft())
			neighbours.add(getCell().getBoard().getCell(indexLeft));
		if (!isOnTheBottom())
			neighbours.add(getCell().getBoard().getCell(indexBottom));	
		if (!isOnTheRight())
			neighbours.add(getCell().getBoard().getCell(indexRight));		
	}

	public RectangleNeighbours(RectangleCell cell) {
		super();
		setNeighbours();
	}
	
	private boolean isOnTheTop() {
		return (convertIndexInLine(getCell().getIndex(), getCell().getBoard().getWidth()) 
				== 0);
	}
	
	private boolean isOnTheLeft() {
		return (convertIndexInRow(getCell().getIndex(), getCell().getBoard().getWidth())
				== 0);
	}
	
	private boolean isOnTheBottom() {
		return (convertIndexInLine(getCell().getIndex(), getCell().getBoard().getWidth())
				== getCell().getBoard().getHeight());
	}
	
	private boolean isOnTheRight() {
		return (convertIndexInRow(getCell().getIndex(), getCell().getBoard().getWidth())
				== getCell().getBoard().getWidth());
	}
	
}
