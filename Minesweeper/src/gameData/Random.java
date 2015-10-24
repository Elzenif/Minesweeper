package gameData;

public interface Random {

	public default boolean getRandom(double proba) {
		return (Math.random() < proba);
	}
	
	public default int getRandom(int min, int max) {
		return min + (int) (Math.random() * (max - min + 1));
	}
}
