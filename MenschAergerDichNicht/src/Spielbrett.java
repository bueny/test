
public class Spielbrett {

	// Eigenschaften des Spiels

	int feldanzahl = 39;
	Feld[] felder = new Feld[39];
	Spieler[] Spieler = new Spieler[4];
	Feld[] zielFelder = new Feld[4];

	public Spielbrett(int anzahlSpieler) {

		// Felder anlegen
		for (int i = 0; i < feldanzahl; i++) {
			felder[i] = new Feld(i);
		}

		// Spieler anlegen
		for (int i = 0; i < anzahlSpieler; i++) {
			Spieler[i] = new Spieler("Spieler " + (i + 1), i);

			for (int j = 0; j < 4; j++) {
				zielFelder[j] = new Feld(j);
			}

		}

	}

	public int laufen(Spieler spieler, int anzahlFelder) {

		// Spieler um die anzahlFelder bewegen

		Feld aktuellePosition = spielerposition(spieler);

		int neueFeldnr = aktuellePosition.Feldnr + anzahlFelder;

		// Spieler beginnt vom Startpunkt

		if (neueFeldnr >= feldanzahl) {

			neueFeldnr = neueFeldnr - 38;
		}

		// laufen bis start-1

		if (neueFeldnr > spieler.start - 1 && aktuellePosition.Feldnr < spieler.start) {

			zielFelder[spieler.nr].Spieler = spieler;

		}

		else {
			felder[neueFeldnr].Spieler = spieler;

		}

		aktuellePosition.Spieler = null;

		System.out.println(spieler.name + " steht auf Feld " + neueFeldnr);

		return neueFeldnr;
	}

	public void gebeSpielaus() {
		for (Feld feld : felder) {

			if (feld.Spieler != null) {
				System.out.print("( " + feld.Spieler.name + " )");
			}

			else {
				System.out.print("()");

			}
		}
	}

	public void gebeZielfeldaus() {
		for (Feld zielfeld : zielFelder) {
			if (zielfeld.Spieler != null) {
				System.out.print("( " + zielfeld.Spieler.name + " )");
			}

			else {
				System.out.print("()");

			}
		}
	}

	public Feld spielerposition(Spieler spieler) {
		for (Feld feld : felder) {
			if (feld.Spieler == spieler) {
				return feld;
			}
		}

		return null;
	}

}
