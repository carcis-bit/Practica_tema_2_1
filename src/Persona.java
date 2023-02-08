
public class Persona {

	String nombre;
	int edad;
	String profesion;

	public Persona(String nombre, int edad, String profesion) {
		this.nombre = nombre;
		this.edad = edad;
		this.profesion = profesion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getProfesion() {
		return profesion;
	}

	public void setProfesion(String profesion) {
		this.profesion = profesion;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + ", profesion=" + profesion + "]";
	}

}
