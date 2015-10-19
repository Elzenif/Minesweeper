package gameData;

public class RectangularBoard extends AbstractBoard implements IndexConverterRectangular, Random {

	private int height;
	private int width;
	private int nbMines;
		
	public int getHeight() {
		return height;
	}

	public int getWidth() {
		return width;
	}

	public int getNbMines() {
		return nbMines;
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
	
	private void setNbMines(int nbMines) throws Exception {
		if (nbMines > length)
			throw new Exception("there are more mines than cells : " + nbMines);
		this.nbMines = nbMines;
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
		super(BoardShape.RECTANGULAR, heigth * width);
		try {
			setHeight(heigth);
			setWidth(width);
			setNbMines(nbMines);
			setCells();
			setNeighBours();
			fillMines();
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
		for (int i = 0; i < length; i++) {
			proba = nbMinesRemaning / length;
			if (getRandom(proba)) {
				nbMinesRemaning--;
				getCell(i).setHasMine(true);
			}
			else {
				getCell(i).setHasMine(false);
			}
		}
	}
}
