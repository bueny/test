
import java.io.*;

public class MenschAergerDichNichtTest {

	public static void main(String[] args) throws IOException {

		// Eingabe Anzahl der Spieler
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		System.out.print("Anzahl Spieler: ");
		String eingabe = br.readLine();
	

		int anzahlSpieler = Integer.parseInt(eingabe);

		Wuerfel wuerfel = new Wuerfel();
		Spielbrett Spiel = new Spielbrett(anzahlSpieler);

		// Spieler würfelt 3 mal

		for (int i = 0; i < anzahlSpieler; i++) {

			for (int j = 0; j < 3; j++) {

				if (Spiel.spielerposition(Spiel.Spieler[i]) == null) {
					int zahl = wuerfel.wuerfeln();
					if (zahl == 6) {
						System.out.println("Super du hast eine " + zahl + " gewürfelt jetzt darfst du nochmal würfeln");
						Spiel.felder[Spiel.Spieler[i].start].Spieler = Spiel.Spieler[i];
						int wuerfelzahl = wuerfel.wuerfeln();
						System.out.println(Spiel.Spieler[i].name + " würfelt eine " + wuerfelzahl);
						Spiel.laufen(Spiel.Spieler[i], wuerfelzahl);

					} else

					{
						System.out.println(Spiel.Spieler[i].name + " leider keine 6 gewürfelt");
					}

				}

				// Spiel.Spieler[i]
			}
			Spiel.gebeSpielaus();
		}

	}

}
