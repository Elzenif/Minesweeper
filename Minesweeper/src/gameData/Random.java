package gameData;

public interface Random {

	public static boolean getRandom(double proba) {
		return (Math.random() < proba);
	}
	
	public static int getRandom(int min, int max) {
		return min + (int) (Math.random() * (max - min + 1));
	}
}
