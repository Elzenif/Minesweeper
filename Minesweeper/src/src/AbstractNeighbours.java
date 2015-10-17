package src;

import java.util.LinkedList;
import java.util.List;

public abstract class AbstractNeighbours {

	protected AbstractCell cell;
	protected List<AbstractCell> neighbours;
	
	public abstract AbstractCell getCell();

	public abstract List<AbstractCell> getNeighbours();

	protected abstract void setCell(AbstractCell cell);

	protected void setNeighbours() {
		neighbours = new LinkedList<AbstractCell>();
	}

	protected AbstractNeighbours() {
		setNeighbours();
	}
}
