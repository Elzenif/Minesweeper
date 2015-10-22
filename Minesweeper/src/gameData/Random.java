package gameData;

public interface Random {

	public default boolean getRandom(double proba) {
		return (Math.random() < proba);
	}
}
