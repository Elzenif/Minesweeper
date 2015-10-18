package gameData;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractBoard {

	protected BoardShape boardShape;
	protected int length;
	protected List<AbstractCell> cells;
	
	public int getLength() {
		return length;
	}

	public BoardShape getBoardShape() {
		return boardShape;
	}
	
	public List<AbstractCell> getCells() {
		return cells;
	}
	
	private void setBoardShape(BoardShape boardShape) {
		this.boardShape = boardShape;
	}

	private void setLength(int length) throws Exception {
		if (length <= 0)
			throw new Exception("length must be strictly positive : " + length);
		this.length = length;
	}
	
	private void setCells() {
		cells = new ArrayList<AbstractCell>(length);
	}
	
	public AbstractBoard(BoardShape boardShape, int length) {
		try {
			setBoardShape(boardShape);
			setLength(length);
			setCells();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public AbstractCell getCell(int index) {
		return cells.get(index);
	}
	
	protected abstract void fillMines();
}
