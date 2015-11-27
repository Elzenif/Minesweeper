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
	
	@Override
	protected boolean revealCell() {
		setCellDisplay(new SafeCellDisplay(this));
		if (getNumberOfNeighbours() == 0) {
			getNeighbours().revealNeighbours();
		}
		return false;
	}
	
	protected AbstractSafeCell(AbstractCell cell) {
		super(cell);
		setNumberOfNeighbours(0);
		setNumberOfNeighboursMines(0);
	}
}
