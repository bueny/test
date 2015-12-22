
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

				if (Spiel.spielerposition(Spiel.Spieler[i]) == null) {
					int zahl = wuerfel.wuerfeln();
					if (zahl == 6) {
						Spiel.felder[Spiel.Spieler[i].start].Spieler = Spiel.Spieler[i];
						int wuerfelzahl = wuerfel.wuerfeln();
						Spiel.laufen(Spiel.Spieler[i], wuerfelzahl);
						System.out.println(Spiel.Spieler[i].name + " Würfelt:" + wuerfelzahl);
					} else

					{
						// System.out.println("Fehlversuch: " + zahl + " (" +
						// Spiel.Spieler[i].name + ")");
					}

				}

				// Spiel.Spieler[i]
			}
			Spiel.gebeSpielaus();
		}

	}

}
