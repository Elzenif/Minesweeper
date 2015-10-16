package src;

import java.util.LinkedList;

public class SquareNeighbours extends AbstractNeighbours {

	// index = line * width + row
		public SquareNeighbours(Cell cell) {
		super(cell);
		neighbours = new LinkedList<Cell>();
		
	}
	
	private boolean isOnTheLeft() {
		return false;
	}
}
