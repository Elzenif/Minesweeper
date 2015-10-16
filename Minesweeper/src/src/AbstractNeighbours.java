package src;

import java.util.List;

public abstract class AbstractNeighbours {

	protected Cell cell;
	protected List<Cell> neighbours;
	
	protected AbstractNeighbours(Cell cell) {
		this.cell = cell;
	}
}
