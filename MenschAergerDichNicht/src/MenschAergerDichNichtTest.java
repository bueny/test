
import java.io.*;

public class MenschAergerDichNichtTest {

	public static void main(String[] args) throws IOException {

		// Eingabe Anzahl der Spieler

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		int anzahlSpieler = 0;

		do {
			// Überprüfung der angegeben Spieleranzahl
			System.out.print("Anzahl Spieler: ");
			String eingabe = br.readLine();
			try {
				anzahlSpieler = Integer.parseInt(eingabe);
			// Abfangen von Fehlern bei der Eingabe
			} catch (Exception e) {

			}
			// Eingabe der Spieleranzahl
		} while ((anzahlSpieler > 4) || (anzahlSpieler <= 1)); 
		Wuerfel wuerfel = new Wuerfel();
		Spielbrett Spiel = new Spielbrett(anzahlSpieler);
			// Belegung der Zielfelder durch die nicht spielenden Spieler
		switch (anzahlSpieler) { 
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

				if (Spiel.spielerposition(Spiel.Spieler[i]) == null)

					for (int j = 0; j < 3; j++) {

						if (Spiel.spielerposition(Spiel.Spieler[i]) == null)

						{
							int zahl = wuerfel.wuerfeln();
			// Ablauf wenn Spieler eine 6 würfelt
							if (zahl == 6) {
								System.out.print(Spiel.Spieler[i].name + " SUPER du hast jetzt eine " + zahl // Überprüfung
										+ " gewürfelt du darfst nochmal würfeln");
								br.readLine();
								Spiel.felder[Spiel.Spieler[i].start].Spieler = Spiel.Spieler[i];
								int wuerfelzahl = wuerfel.wuerfeln();
								System.out.print(Spiel.Spieler[i].name + " würfelt eine " + wuerfelzahl);
								br.readLine();
								Spiel.laufen(Spiel.Spieler[i], wuerfelzahl);
								Spiel.gebeSpielaus();

							} else
			// Ablauf wenn Spieler keine 6 würfelt
							{

								System.out.print(Spiel.Spieler[i].name + " du hast leider keine 6 gewürfelt");

							}
							br.readLine();

						}

					}
				else
			// Ablauf nachdem 39 Feld
				{

					int wurf = wuerfel.wuerfeln();
					System.out.print(Spiel.Spieler[i].name + " würfelt eine " + wurf);
					br.readLine();
					Spiel.laufen(Spiel.Spieler[i], wurf);
					Spiel.gebeSpielaus();
					br.readLine();

				}
				br.readLine();
			}
			// Soll solange laufen bis Spieler auf Zielfelder sind
		} while ((Spiel.zielFelder[0].Spieler == null) || (Spiel.zielFelder[1].Spieler == null)
				|| (Spiel.zielFelder[2].Spieler == null) || (Spiel.zielFelder[3].Spieler == null));
	}

}
