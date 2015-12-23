import java.util.Random;

public class Wuerfel {

	Integer zahl = null;
	Random rand = new Random();

	public Wuerfel() {
		this.zahl = 0;
	}

	public int wuerfeln() {
		this.zahl = rand.nextInt(6) + 1;
		return this.zahl;
	}
}
