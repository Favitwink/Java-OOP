
public class Inquilino {
	
	private String nombre = "";
	
	private Apartamento apartamento;

	public Apartamento getApartamento() {
		return apartamento;
	}

	public void setApartamento(Apartamento apartamento) {
		this.apartamento = apartamento;
		apartamento.setInquilino(this);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	void verMisHabitaciones() {
		int h = apartamento.getHabitaciones(); 
		System.out.println("nombre: " + nombre);
		System.out.println("condicion: " + apartamento.getCondicion());
		System.out.println("habitaciones: " + h + ( h == 5 ? "\nhabitacion premium" : "" ) );
	}

	public Inquilino(String nombre, Apartamento apartamento) {
		super();
		this.nombre = nombre;
		setApartamento(apartamento);
	}

}
