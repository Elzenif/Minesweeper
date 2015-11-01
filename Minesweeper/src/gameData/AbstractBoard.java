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

	private void setLength(int length) throws IllegalArgumentException {
		if (length <= 0)
			throw new IllegalArgumentException("length must be strictly positive : " + length);
		this.length = length;
	}
	
	private void setCells() {
		cells = new ArrayList<AbstractCell>(length);
	}
	
	private void setNbMines(int nbMines) throws IllegalArgumentException {
		if (nbMines > length)
			throw new IllegalArgumentException("There are more mines than cells : " + nbMines);
		this.nbMines = nbMines;
	}
	
	protected AbstractBoard(int length, int nbMines) {
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
	
	protected void fillMines() {
		int nbMinesRemaning = nbMines;
		double proba = 0;
		for (int i = length; i >= 1; i--) {
			proba = (double) nbMinesRemaning / (double) i;
			if (Random.getRandom(proba)) {
				nbMinesRemaning--;
				getCell(i-1).setCellContent(true);
			}
			else {
				getCell(i-1).setCellContent(false);
			}
		}
	}
	
	public boolean revealCell(int index) {
		return cells.get(index).revealCell();
	}
	
	public void flagCell(int index) {
		cells.get(index).flagCell();
	}
}
