package clasesSeleccion;

public class Futbolista extends SeleccionFutbol {
	
	protected String posicion;
	protected int golesMarcados;

	public Futbolista(int id,String nombres, String apellidos, 
			int edad, String posicion, int golesMarcados) {
		super(id, nombres, apellidos, edad);
		this.posicion = posicion;
		this.golesMarcados = golesMarcados;
	}
	
	public int darGolesMarcados() {
		return this.golesMarcados;
	}
	public String darPosicion() {
		return this.posicion;
	}
	
	public int agregarGoles(int goles) {
		return this.golesMarcados += goles;			
	}
	
	public String cambiarPosicion(String posicion) {
		this.posicion = posicion;
		return this.posicion;
	}

	@Override
	public void Entrenamiento() {
		System.out.println("El jugador  " + this.getNombres() +" "
	+ this.getApellidos() + " con el identificador " + this.getId()
	+ " con la Edad de "+ this.getEdad() + " ha marcado  "
	+ this.golesMarcados +" y juega de la posicion " + this.posicion);
	}

}
