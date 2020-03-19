package clasesSeleccion;

public class Entrenador extends SeleccionFutbol{
	
	private int IdFederacion;
	
	public Entrenador() {}
	
	public Entrenador(int id,String nombres, String apellidos, int edad, int idFede) {
		super(id, nombres, apellidos, edad);
		this.IdFederacion = idFede;
	}
	
	
	public void PlanificarEntrenamiento() {
		System.out.println("El Entrenador " + this.getNombres() +" " + this.getApellidos() + " con el identificador " + this.getId() + " con la Edad de "+ this.getEdad() + " dentro de la federacion "+ this.IdFederacion +" debe planificar Entrenamiento del equipo.");
	}
	
	@Override
	public void Entrenamiento() {
		System.out.println("El Entrenador " + this.getNombres() +" " + this.getApellidos() + " con el identificador " + this.getId() + " con la Edad de "+ this.getEdad() + " dentro de la federacion "+ this.IdFederacion +" debe iniciar con el Entrenamiento del equipo.");
	}
	
	
	public void setIdFederacion(int idFede) {
		this.IdFederacion = idFede;
	}
	public int getIdFederacion() {
		return this.IdFederacion;
	}
	
}
