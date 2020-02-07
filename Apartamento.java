
public class Apartamento extends Propiedad {
	
	public Apartamento(String condicion) {
		super(condicion);
		// TODO Auto-generated constructor stub
	}
	
	private Inquilino inquilino;

	public Inquilino getInquilino() {
		return inquilino;
	}

	public void setInquilino(Inquilino inquilino) {
		this.inquilino = inquilino;
		//inquilino.setApartamento(this);
	}

	private int habitaciones;

	public int getHabitaciones() {
		return habitaciones;
	}

	public Apartamento(int habitaciones, String condicion) {
		super(condicion);
		this.habitaciones = habitaciones;
	}

	public void setHabitaciones(int habitaciones) {
		if (1 <= habitaciones && habitaciones <= 5) {
			this.habitaciones = habitaciones;
		}
	}

	@Override
	public String toString() {
		return (inquilino != null ? "nombre: " + inquilino.getNombre() + "\n" : "")
		+ "condicion: " + getCondicion() + "\nhabitaciones: " + habitaciones;
	}

}
