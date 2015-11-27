package gameData;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractNeighbours {

	protected AbstractSafeCell safeCell;
	protected List<AbstractCell> neighbours;
	
	public abstract AbstractSafeCell getSafeCell();

	public abstract List<AbstractCell> getNeighbours();

	protected void setSafeCell(AbstractSafeCell safeCell) {
		this.safeCell = safeCell;
	}

	protected void setNeighbours() {
		neighbours = new ArrayList<AbstractCell>();
	}

	protected AbstractNeighbours(AbstractSafeCell safeCell) {
		setSafeCell(safeCell);
		this.setNeighbours();
	}
	
	protected void addNeighbours(boolean hasANeighbour, int index) {
		if (hasANeighbour) {
			AbstractCell neighbour = getSafeCell().getCell().getBoard().getCell(index);
			neighbours.add(neighbour);
			getSafeCell().incNumberOfNeighbours();
			getSafeCell().incNumberOfNeighboursMines(neighbour.getCellContent().getMineContained());
		}
	}

	protected void revealNeighbours() {
		for (AbstractCell neighbour : neighbours) {
			if (!neighbour.isRevealed())
				neighbour.revealCell();
		}
	}
	
}
