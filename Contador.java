public class Contador extends Empleado {

	private String especialidad;
	private String trabajoPrincipal;

	Contador(String nombre, String apellido, int edad, String telefono, String correo, String especialidad) {
		super(nombre, apellido, edad, telefono, correo, "Contador");
		this.especialidad = especialidad;
		this.trabajoPrincipal = "El contador no tiene trabajo asignado actualmente";
	}

	Contador(String nombre, String apellido, int edad, String telefono, String correo, String especialidad, String trabajoPrincipal) {
		super(nombre, apellido, edad, telefono, correo, "Contador");
		this.especialidad = especialidad;
		this.trabajoPrincipal = trabajoPrincipal;
	}

	Contador(String nombre, String apellido, int edad, String telefono, String correo, int salario, String especialidad, String trabajoPrincipal) {
		super(nombre, apellido, edad, telefono, correo, "Contador", salario);
		this.especialidad = especialidad;
		this.trabajoPrincipal = trabajoPrincipal;
	}

	public String getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}

	public String getTrabajoPrincipal() {
		return trabajoPrincipal;
	}

	public void setTrabajoPrincipal(String trabajoPrincipal) {
		this.trabajoPrincipal = trabajoPrincipal;
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
				"\nEspecialidad: " + especialidad +
				"\nTrabajo Principal: " + trabajoPrincipal +
				"\n--------------------------------------------------------");
	}

}