
public class MenschAergerDichNichtTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Wuerfel wuerfel = new Wuerfel();
		Spielbrett Spiel = new Spielbrett(2);
			
		wuerfel.wuerfeln();
		System.out.println(wuerfel.zahl);
		Spiel.gebeSpielaus();
		
	}

}
