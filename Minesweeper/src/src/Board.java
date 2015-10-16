package src;

public abstract class Board {

	protected BoardShape boardShape;
	private int length;
	
	public int getLength() {
		return length;
	}

	public BoardShape getBoardShape() {
		return boardShape;
	}

	private void setLength(int length) throws Exception {
		if (length <= 0)
			throw new Exception("length must be strictly positive : " + length);
		this.length = length;
	}
	
	public Board(BoardShape boardShape, int length) {
		this.boardShape = boardShape;
		try {
			setLength(length);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
