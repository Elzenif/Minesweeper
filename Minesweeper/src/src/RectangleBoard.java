package src;

public class RectangleBoard extends AbstractBoard implements IndexConverter {

	private int height;
	private int width;
		
	public int getHeight() {
		return height;
	}

	public int getWidth() {
		return width;
	}

	private void setHeight(int height) throws Exception {
		if (height <= 2)
			throw new Exception("height must be 2 or more : " + height);
		this.height = height;
	}

	private void setWidth(int width) throws Exception {
		if (width <= 2)
			throw new Exception("width must be 2 or more : " + width);
		this.width = width;
	}

	public RectangleBoard(int heigth, int width) {
		super(BoardShape.RECTANGULAR, heigth * width);
		try {
			setHeight(heigth);
			setWidth(width);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public RectangleCell getCell(int index) {
		return getCell(index);
	}
}
