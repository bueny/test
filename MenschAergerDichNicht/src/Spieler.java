
public class Spieler {

	String name = null;
	int nr = 0;
	int start;

	public Spieler(String name, int nr) {
		this.name = name;
		this.nr = nr;

		switch (nr) {
		case 0:
			start = 0;
			break;
		case 1:
			start = 11;
			break;
		case 2:
			start = 21;
			break;
		case 3:
			start = 31;
			break;
		default:
			break;
		}

	}

}
