
import java.io.*;

public class MenschAergerDichNichtTest {

	public static void main(String[] args) throws IOException {

																		// Eingabe Anzahl der Spieler

		InputStreamReader isr = new InputStreamReader(System.in);		
		BufferedReader br = new BufferedReader(isr);
		int anzahlSpieler = 0;

		do {

			System.out.print("Anzahl Spieler: ");
			String eingabe = br.readLine();								// Eingabe der richtigen Spieleranzahl
			try {
				anzahlSpieler = Integer.parseInt(eingabe);
			} catch (Exception e) { 									// fängt Fehler ab

			}
		} while ((anzahlSpieler > 4) || (anzahlSpieler <= 1)); 			// min. max. Spieleranzahl
																

		Wuerfel wuerfel = new Wuerfel();
		Spielbrett Spiel = new Spielbrett(anzahlSpieler);

		switch (anzahlSpieler) { 										// belegung der Zielfelder
		case 2:
			Spiel.zielFelder[2].Spieler = new Spieler("Spieler", 2);

			break;
		case 3:
			Spiel.zielFelder[3].Spieler = new Spieler("Spieler", 3);

			break;
		default:
			break;
		}

																		// Spieler würfelt 3 mal

		do {
			
			for (int i = 0; i < anzahlSpieler; i++) {

				
				
				for (int j = 0; j < 3 ; j++) {
					if (Spiel.spielerposition(Spiel.Spieler[i]) == Spiel.spielerposition(Spiel.Spieler[i])) {	
						
					 
						int zahl = wuerfel.wuerfeln();
				
									
						if (zahl == 6) {
							System.out.print(Spiel.Spieler[i].name + " SUPER du hast jetzt eine " + zahl		 // Überprüfung
									+ " gewürfelt du darfst nochmal würfeln");
							br.readLine();
							Spiel.felder[Spiel.Spieler[i].start].Spieler = Spiel.Spieler[i];
							int wuerfelzahl = wuerfel.wuerfeln();
							System.out.print(Spiel.Spieler[i].name + " würfelt eine " + wuerfelzahl);
							br.readLine();
							Spiel.laufen(Spiel.Spieler[i], wuerfelzahl);
							Spiel.gebeSpielaus();
							
						} else
							

						{

							System.out.print(Spiel.Spieler[i].name + " du hast leider keine 6 gewürfelt");

						}
						br.readLine();

					}

				}
			}

			// Spiel.gebeSpielaus();
		} while ((Spiel.zielFelder[0].Spieler == null) || (Spiel.zielFelder[1].Spieler == null)
				|| (Spiel.zielFelder[2].Spieler == null) || (Spiel.zielFelder[3].Spieler == null));
	}

}
