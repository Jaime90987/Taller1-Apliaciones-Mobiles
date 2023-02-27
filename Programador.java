public class Programador extends Empleado {

	private String lenguajeDeProgramacion;
	private String nivel;
	private String proyectoActual;

	Programador(String nombre, String apellido, int edad, String telefono, String correo, String lenguajeDeProgramacion, String nivel) {
		super(nombre, apellido, edad, telefono, correo, "Programador");
		this.lenguajeDeProgramacion = lenguajeDeProgramacion;
		this.nivel = nivel;
		this.proyectoActual = "El programador no se encuentra asignado a ningun proyecto";
	}

	Programador(String nombre, String apellido, int edad, String telefono, String correo, String lenguajeDeProgramacion, String nivel, String proyectoActual) {
		super(nombre, apellido, edad, telefono, correo, "Programador");
		this.lenguajeDeProgramacion = lenguajeDeProgramacion;
		this.nivel = nivel;
		this.proyectoActual = proyectoActual;
	}

	Programador(String nombre, String apellido, int edad, String telefono, String correo, int salario, String lenguajeDeProgramacion, String nivel, String proyectoActual) {
		super(nombre, apellido, edad, telefono, correo, "Programador", salario);
		this.lenguajeDeProgramacion = lenguajeDeProgramacion;
		this.nivel = nivel;
		this.proyectoActual = proyectoActual;
	}

	public String getLenguaje() {
		return lenguajeDeProgramacion;
	}

	public void setLenguaje(String lenguajeDeProgramacion) {
		this.lenguajeDeProgramacion = lenguajeDeProgramacion;
	}

	public String getNivel() {
		return nivel;
	}

	public void setNivel(String nivel) {
		this.nivel = nivel;
	}

	public String getProyectoActual() {
		return proyectoActual;
	}

	public void setProyecto(String proyectoActual) {
		this.proyectoActual = proyectoActual;
	}

	public void desarrollar() {
		System.out.println("\nEl proyecto '" + proyectoActual + "' ha sido desarrollado.\n");
		this.proyectoActual = "El programador no se encuentra asignado a ningun proyecto";
	}

	@Override
	public void mostrarDatos() {
		System.out.println("--------------------------------------------------------" +
				"\nNombre: " + getNombre() +
				"\nApellido: " + getApellido() +
				"\nEdad: " + getEdad() +
				"\nTelefono: " + getTelefono() +
				"\nCorreo: " + getCorreo() +
				"\ncargo: " + getCargo() +
				"\nSalario: " + getSalario() +
				"\nLenguaje de Programacion: " + lenguajeDeProgramacion +
				"\nNivel: " + nivel +
				"\nProyecto Actual: " + proyectoActual +
				"\n--------------------------------------------------------");
	}

}