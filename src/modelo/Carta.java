package modelo;

public class Carta {

	protected boolean oculta = true;
	protected int id;
	public Carta(boolean oculta, int id) {
		super();
		this.oculta = oculta;
		this.id = id;
	}
	public boolean isOculta() {
		return oculta;
	}
	public void setOculta(boolean oculta) {
		this.oculta = oculta;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	

}
