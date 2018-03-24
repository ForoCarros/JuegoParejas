package utiles;

public class Random {
	public int[] generarCoordenadasAleatorias(int min, int max){
		int random[] = new int[2];
		for (int i = 0; i < random.length; i++) {
			random[i]=((int)(min+(Math.random()*((max+1)-min))));
		}
		return random;
	}
}
