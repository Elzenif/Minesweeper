package src;

import java.util.LinkedList;

public class RectangleNeighbours extends AbstractNeighbours {

	// index = line * width + row
		public RectangleNeighbours(Cell cell) {
		super(cell);
		neighbours = new LinkedList<Cell>();
		
	}
	
	private boolean isOnTheLeft() {
		return false;
	}
}
