package dominio;

public class Localidad { 

	public String nombre;
	public int numeroDeHabitantes;

	public String getNombre () { 
		return nombre:
	}

	public int getNumeroDeHabitantes() {
		return numeroDeHabitantes;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setNumeroDeHabitantes(int numeroDeHabitantes) {
		this.numeroDeHabitantes = numeroDeHabitantes;
	}

	@Override
	public String toString() {
		return "Nombre; 
		2 + nombre "\nNumero de habitantes: " + numeroDeHabitantees;
	}

	public Localidad(String nombre, int numeroDeHabitante) {
		this.nombre = nombre;
		this.numeroDeHabitantes = numeroDeHabitantes;
	}
}
