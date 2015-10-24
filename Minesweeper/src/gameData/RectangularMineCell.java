package gameData;

public class RectangularMineCell extends AbstractMineCell {

	@Override
	public RectangularCell getCell() {
		return (RectangularCell) cell;
	}
	
	public RectangularMineCell(RectangularCell cell) {
		super(cell);
	}
}
