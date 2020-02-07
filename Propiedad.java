
public class Propiedad {
	
	static int contadorPropiedades;
	
	public Propiedad() {
		contadorPropiedades++;
	}
	
	public Propiedad(String condicion) {
		this();
		setCondicion(condicion);
	}

	private String condicion = "nuevo";

	public String getCondicion() {
		return condicion;
	}

	public void setCondicion(String condicion) {
		if (condicion.equals("nuevo") || condicion.equals("usado")) {
			this.condicion = condicion;
		} else {
			this.condicion = null;
		}
	}

	@Override
	public String toString() {
		return "condicion: " + condicion;
	}

}
