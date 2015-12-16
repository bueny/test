
public class Spieler {

	String name = null;
	int nr = 0;
	int start;
	
	
	public Spieler(String name, int nr){
		this.name=name;
		this.nr=nr;
		
		switch (nr){
			case 1:
				start = 1;
				break;
			case 2:
				start = 11;
				break;
			case 3:
				start = 21;
				break;
			case 4:
				start = 31;
				break;
			default:
				break;
		}
	
	}
	
	

	
	
}
