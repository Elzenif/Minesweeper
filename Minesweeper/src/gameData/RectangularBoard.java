package gameData;

public class RectangularBoard extends AbstractBoard implements IndexConverterRectangular, Random {

	private int height;
	private int width;
	
	public int getHeight() {
		return height;
	}

	public int getWidth() {
		return width;
	}

	private void setHeight(int height) throws Exception {
		if (height <= 2)
			throw new Exception("height must be 2 or more : " + height);
		this.height = height;
	}

	private void setWidth(int width) throws Exception {
		if (width <= 2)
			throw new Exception("width must be 2 or more : " + width);
		this.width = width;
	}
	
	private void setCells() {
		for (int i = 0; i < length; i++) {
			cells.add(i, new RectangularCell(this, i));
		}
	}
	
	private void setNeighBours() {
		for (int i = 0; i < length; i++) {
			cells.get(i).setNeighbours();
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
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public RectangularCell getCell(int index) {
		return (RectangularCell) getCells().get(index);
	}
	
	@Override
	protected void fillMines() {
		int nbMinesRemaning = nbMines;
		double proba = 0;
		for (int i = length; i >= 1; i--) {
			proba = (double) nbMinesRemaning / (double) i;
			if (getRandom(proba)) {
				nbMinesRemaning--;
				getCell(i-1).setHasMine(true);
			}
			else {
				getCell(i-1).setHasMine(false);
			}
		}
	}
}
