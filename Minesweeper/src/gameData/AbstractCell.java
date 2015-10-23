package gameData;

public abstract class AbstractCell {

	protected int index;
	protected AbstractBoard board;
	protected AbstractNeighbours neighbours;
	protected boolean hasMine;
	protected int numberOfNeighbours;
	protected int numberOfNeighboursMines;

	public int getIndex() {
		return index;
	}

	public abstract AbstractBoard getBoard();
	
	public abstract AbstractNeighbours getNeighbours();

	public boolean getHasMine() {
		return hasMine;
	}
	
	public int getNumberOfNeighbours() {
		return numberOfNeighbours;
	}
	
	public int getNumberOfNeighboursMines() {
		return numberOfNeighboursMines;
	}
	
	private void setIndex(int index) throws Exception {
		if (index < 0)
			throw new Exception("index too small : " + index);
		if (index >= board.getLength())
			throw new Exception("index : " + index + " greater than length : " + board.getLength());
		this.index = index;
	}
	
	protected abstract void setBoard(AbstractBoard board);
	
	protected abstract void setNeighbours();
	
	protected void setHasMine(boolean mine) {
		this.hasMine = mine;
	}
	
	private void setNumberOfNeighbours(int nb) {
		this.numberOfNeighbours = nb;
	}
	
	protected void incNumberOfNeighbours() {
		numberOfNeighbours++;
	}
	
	private void setNumberOfNeighboursMines(int nb) {
		this.numberOfNeighboursMines = nb;
	}
	
	protected void incNumberOfNeighboursMines() {
		numberOfNeighboursMines++;
	}

	public AbstractCell(AbstractBoard board, int index) {
		try {
			setBoard(board);
			setIndex(index);
			setNumberOfNeighbours(0);
			setNumberOfNeighboursMines(0);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
