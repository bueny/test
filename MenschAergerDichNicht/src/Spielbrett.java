import java.util.ArrayList;

public class Spielbrett {

	int feldanzahl = 39;
	Feld[] felder = new Feld[39];
	Spieler[] Spieler = new Spieler[4];
	ArrayList<Feld[]> ziele = new ArrayList<Feld[]>();
	Feld[] zielFelder = new Feld[4];
	
	public Spielbrett(int anzahlSpieler){
		
		// Felder anlegen
		for(int i=0;i<feldanzahl;i++){
			felder[i] = new Feld(i);
		}
		
		// Spieler anlegen
		for(int i=0;i<anzahlSpieler;i++){
			Spieler[i] = new Spieler("S"+i, i);
			
			// Zielfelder für Spieler anlegen
			for(int j=0;j<4;j++){
				zielFelder[j] = new Feld(j);
			}
			
			// Zielfelder der ZielListe hinzufügen
			ziele.add(zielFelder);
		}
		
	}
	
	public int laufen(Spieler spieler, int anzahlFelder){
		// Spieler um die anzahlFelder bewegen
		
		Feld aktuellePosition = spielerposition(spieler);
		
		Feld neuePosition = felder[aktuellePosition.Feldnr + anzahlFelder];
		
		aktuellePosition.Spieler = null;
		
		felder[neuePosition.Feldnr].Spieler = spieler;
		
		System.out.println(neuePosition.Feldnr);
		
		return neuePosition.Feldnr;
	}
	
	public void gebeSpielaus(){
		for (Feld feld : felder){
			System.out.println(feld.Feldnr);
			
		}
	}
	
	public Feld spielerposition(Spieler spieler){
		for (Feld feld : felder){
			if (feld.Spieler == spieler){
				return feld;
			}		
		}
		
		return null;
	}
	
}
