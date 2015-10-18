package gameData;

public abstract class AbstractCell {

	protected int index;
	protected AbstractBoard board;
	protected AbstractNeighbours neighbours;
	protected boolean hasMine;

	public int getIndex() {
		return index;
	}

	public abstract AbstractBoard getBoard();
	
	public abstract AbstractNeighbours getNeighbours();

	public boolean getHasMine() {
		return hasMine;
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

	public AbstractCell(AbstractBoard board, int index) {
		try {
			setBoard(board);
			setIndex(index);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
