package gameData;

public class RectangularBoard extends AbstractBoard
	implements IndexConverterRectangular {

	private int height;
	private int width;
	
	public int getHeight() {
		return height;
	}

	public int getWidth() {
		return width;
	}

	private void setHeight(int height) throws IllegalArgumentException {
		if (height < 2)
			throw new IllegalArgumentException("height must be 2 or more : " + height);
		this.height = height;
	}

	private void setWidth(int width) throws IllegalArgumentException {
		if (width < 2)
			throw new IllegalArgumentException("width must be 2 or more : " + width);
		this.width = width;
	}
	
	private void setCells() {
		for (int i = 0; i < length; i++) {
			cells.add(i, new RectangularCell(this, i));
		}
	}
	
	private void setNeighBours() {
		for (int i = 0; i < length; i++) {
			cells.get(i).getCellContent().initializeAnyNeighbour();
		}	
	}

	public RectangularBoard(int heigth, int width, int nbMines) {
		super(heigth * width, nbMines);
		try {
			setHeight(heigth);
			setWidth(width);
			setCells();
			fillMines();
			setNeighBours();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public RectangularCell getCell(int index) {
		return (RectangularCell) getCells().get(index);
	}
		
	public boolean revealCell(int line, int row) {
		return super.revealCell(convertLineAndRowInIndex(line, row, width));
	}
	
	public void flagCell(int line, int row) {
		super.flagCell(convertLineAndRowInIndex(line, row, width));
	}
}
