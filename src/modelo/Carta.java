package modelo;

public class Carta {

	private int id;
	private boolean velada = false;
	private boolean emparejada = false;

	public Carta(int id) {
		super();
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public boolean isVelada() {
		return velada;
	}

	public void setVelada(boolean velada) {
		this.velada = velada;
	}

	public boolean isEmparejada() {
		return emparejada;
	}

	public void setEmparejada(boolean emparejada) {
		this.emparejada = emparejada;
	}

}
