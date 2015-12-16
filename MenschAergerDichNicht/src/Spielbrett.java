import java.util.ArrayList;

public class Spielbrett {

	int feldanzahl = 39;
	Feld[] felder = new Feld[39];
	Spieler[] Spieler = new Spieler[2];
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
	
	public void laufen(Spieler spieler, int anzahlFelder){
		// Spieler um die anzahlFelder bewegen
		
		System.out.println(spieler + "ist auf Feld" + anzahlFelder);

		
		
	}
	
	public void gebeSpielaus(){
		for (Feld feld : felder){
			System.out.println(feld.Feldnr);
			
		}
	}
	
	public void spielerposition(){
		for (Feld feld : felder){
			if (feld.Spieler == Spieler)
				
				
			
			
		}
	}
	
}
