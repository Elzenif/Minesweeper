package src;

public interface IndexConverterRectangular {

	/**
	 * Convert the line and row coordinates in the 1D index for Rectangular Boards
	 * @param line : the line coordinate
	 * @param row : the row coordinate
	 * @param width : the width of the board
	 * @return the 1D index
	 */
	public default int convertLineAndRowInIndex(int line, int row, int width) {
		return line * width + row;
	}
	
	public default int convertIndexInLine(int index, int width) {
		return index / width;
	}
	
	public default int convertIndexInRow(int index, int width) {
		return index % width;
	}
	
	public default boolean isOnTheTop(RectangularCell cell) {
		return (convertIndexInLine(cell.getIndex(), cell.getBoard().getWidth()) 
				== 0);
	}
	
	public default boolean isOnTheLeft(RectangularCell cell) {
		return (convertIndexInRow(cell.getIndex(), cell.getBoard().getWidth())
				== 0);
	}
	
	public default boolean isOnTheBottom(RectangularCell cell) {
		return (convertIndexInLine(cell.getIndex(), cell.getBoard().getWidth())
				== cell.getBoard().getHeight());
	}
	
	public default boolean isOnTheRight(RectangularCell cell) {
		return (convertIndexInRow(cell.getIndex(), cell.getBoard().getWidth())
				== cell.getBoard().getWidth());
	}
}
