package gameData;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractNeighbours {

	protected AbstractCell cell;
	protected List<AbstractCell> neighbours;
	
	public abstract AbstractCell getCell();

	public abstract List<AbstractCell> getNeighbours();

	protected abstract void setCell(AbstractCell cell);

	protected void setNeighbours() {
		neighbours = new ArrayList<AbstractCell>();
	}

	protected AbstractNeighbours() {
		this.setNeighbours();
	}
	
	protected void addNeighbours(boolean condition, int index) {
		if (condition) {
			neighbours.add(getCell().getBoard().getCell(index));
			getCell().incNumberOfNeighbours();
			if (getCell().getBoard().getCell(index).getHasMine())
				getCell().incNumberOfNeighboursMines();
		}
	}
}
