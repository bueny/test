
import java.io.*;

public class MenschAergerDichNichtTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		InputStreamReader isr = new InputStreamReader(System.in);
	    BufferedReader br = new BufferedReader(isr);
	    System.out.print("Anzahl Spieler: ");
	    String eingabe = br.readLine();
	    
	    int anzahlSpieler = Integer.parseInt(eingabe);
	    
		Wuerfel wuerfel = new Wuerfel();
		Spielbrett Spiel = new Spielbrett(anzahlSpieler);
			
		// Spieler 1 würfelt 3 mal
		
		for (int i = 0; i < anzahlSpieler; i++) {
			
			for (int j = 0; j < 3; j++) {
				
				wuerfel.wuerfeln();
				if (wuerfel.wuerfeln() == 6) {
					Spiel.felder[Spiel.Spieler[i].start].Spieler = Spiel.Spieler[i];
				}
				
				
//				Spiel.Spieler[i]
			}
			
		}
		
		
		
/*		if (Spiel.spielerposition(Spiel.Spieler[0]) == null) {
			Spiel.felder[0].Spieler = Spiel.Spieler[0];
		}
		
		while (Spiel.laufen(Spiel.Spieler[0], wuerfel.wuerfeln()) < 30) {

			
			Spiel.laufen(Spiel.Spieler[0], wuerfel.wuerfeln());
		}*/
		
		
		
		
		//wuerfel.wuerfeln();

		//Spiel.gebeSpielaus();
		
		
	}

}
