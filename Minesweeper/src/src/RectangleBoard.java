package src;

public class RectangleBoard extends Board {

	private int height;
	private int width;
		
	public int getHeight() {
		return height;
	}

	public int getWidth() {
		return width;
	}

	private void setHeight(int height) throws Exception {
		if (height <= 0)
			throw new Exception("height must be strictly positive : " + height);
		this.height = height;
	}


	private void setWidth(int width) throws Exception {
		if (width <= 0)
			throw new Exception("width must be strictly positive : " + width);
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
	
}
