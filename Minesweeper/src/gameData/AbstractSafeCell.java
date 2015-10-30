package gameData;

public abstract class AbstractSafeCell extends AbstractCellContent {

	protected AbstractNeighbours neighbours;
	protected int numberOfNeighbours;
	protected int numberOfNeighboursMines;

	@Override
	protected void setMineContained() {
		mineContained = 0;
	}
	
	public abstract AbstractNeighbours getNeighbours();
	
	public int getNumberOfNeighbours() {
		return numberOfNeighbours;
	}
	
	public int getNumberOfNeighboursMines() {
		return numberOfNeighboursMines;
	}
	
	private void setNumberOfNeighbours(int nb) {
		this.numberOfNeighbours = nb;
	}
	
	protected void incNumberOfNeighbours() {
		numberOfNeighbours++;
	}
	
	private void setNumberOfNeighboursMines(int nb) {
		this.numberOfNeighboursMines = nb;
	}
	
	protected void incNumberOfNeighboursMines(int nb) {
		numberOfNeighboursMines += nb;
	}
	
	protected AbstractSafeCell(AbstractCell cell) {
		super(cell);
		setNumberOfNeighbours(0);
		setNumberOfNeighboursMines(0);
	}

	@Override
	public void print() {
		switch (cellDisplay) {
			case NOPE:
				System.out.print(". ");
				break;
			case FLAG:
				System.out.print("F ");
				break;
			case CONTENT:
				System.out.print(getNumberOfNeighboursMines() + " ");
				break;
			default:
				System.out.print(". ");
				break;
		}
	}
}
