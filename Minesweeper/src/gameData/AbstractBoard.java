package gameData;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractBoard {

	protected int length;
	protected List<AbstractCell> cells;
	protected int nbMines;
	
	public int getLength() {
		return length;
	}
	
	public List<AbstractCell> getCells() {
		return cells;
	}
	
	public int getNbMines() {
		return nbMines;
	}

	private void setLength(int length) throws Exception {
		if (length <= 0)
			throw new Exception("length must be strictly positive : " + length);
		this.length = length;
	}
	
	private void setCells() {
		cells = new ArrayList<AbstractCell>(length);
	}
	
	private void setNbMines(int nbMines) throws Exception {
		if (nbMines > length)
			throw new Exception("there are more mines than cells : " + nbMines);
		this.nbMines = nbMines;
	}
	
	public AbstractBoard(int length, int nbMines) {
		try {
			setLength(length);
			setCells();
			setNbMines(nbMines);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public AbstractCell getCell(int index) {
		return cells.get(index);
	}
	
	protected abstract void fillMines();
}
