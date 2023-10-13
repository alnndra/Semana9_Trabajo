package Uchill;

public class Facultad {

	private char pabellon;
	private String nameFa;
	
	public Facultad() {
		
	}
	
	public Facultad(char pabellon, String nameFa) {
		super();
		this.pabellon = pabellon;
		this.nameFa = nameFa;
	}
	
	public char getPabellon() {
		return pabellon;
	}

	public void setPabellon(char pabellon) {
		this.pabellon = pabellon;
	}

	public String getNameFa() {
		return nameFa;
	}

	public void setNameFa(String nameFa) {
		this.nameFa = nameFa;
	}

	@Override
	public String toString() {
		return "Pabellon:" + pabellon + " - " + "Nombre de Facultad:" + " " + nameFa;
	}
}
