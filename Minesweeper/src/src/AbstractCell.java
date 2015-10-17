package src;

public abstract class AbstractCell {

	protected int index;
	protected AbstractBoard board;
	protected AbstractNeighbours neighbours;

	public int getIndex() {
		return index;
	}

	public abstract AbstractBoard getBoard();
	
	public abstract AbstractNeighbours getNeighbours();

	private void setIndex(int index) throws Exception {
		if (index < 0)
			throw new Exception("index too small : " + index);
		if (index >= board.getLength())
			throw new Exception("index : " + index + " greater than length : " + board.getLength());
		this.index = index;
	}
	
	protected abstract void setBoard(AbstractBoard board);
	
	protected abstract void setNeighbours();

	public AbstractCell(int index) {
		try {
			setIndex(index);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
