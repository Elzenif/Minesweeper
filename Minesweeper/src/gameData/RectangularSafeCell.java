package gameData;

public class RectangularSafeCell extends AbstractSafeCell {

	@Override
	public RectangularCell getCell() {
		return (RectangularCell) cell;
	}
	
	@Override
	public RectangularNeighbours getNeighbours() {
		return (RectangularNeighbours) neighbours;
	}
	
	@Override
	public void initializeAnyNeighbour() {
		neighbours = new RectangularNeighbours(this);
	}

	public RectangularSafeCell(RectangularCell cell) {
		super(cell);
	}


}
