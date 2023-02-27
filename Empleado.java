import java.text.DecimalFormat;

public class Empleado {

	private String nombre;
	private String apellido;
	private int edad;
	private String telefono;
	private String correo;
	private String cargo;
	private int salario;

	DecimalFormat formato = new DecimalFormat("###,###,###.##");

	Empleado(String nombre, String apellido, int edad, String telefono, String correo) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.telefono = telefono;
		this.correo = correo;
		this.cargo = "Oficinista";
		this.salario = 1_160_000;
	}

	Empleado(String nombre, String apellido, int edad, String telefono, String correo, int salario) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.telefono = telefono;
		this.correo = correo;
		this.cargo = "Oficinista";
		this.salario = salario;
	}

	Empleado(String nombre, String apellido, int edad, String telefono, String correo, String cargo) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.telefono = telefono;
		this.correo = correo;
		this.cargo = cargo;
		this.salario = 1_160_000;
	}

	Empleado(String nombre, String apellido, int edad, String telefono, String correo, String cargo, int salario) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.telefono = telefono;
		this.correo = correo;
		this.cargo = cargo;
		this.salario = salario;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public String getSalario() {
		return formato.format(salario);
	}

	public void setSalario(int salario) {
		this.salario = salario;
	}

	public void mostrarDatos() {
		System.out.println("--------------------------------------------------------" +
				"\nNombre: " + nombre +
				"\nApellido: " + apellido +
				"\nEdad: " + edad +
				"\nTelefono: " + telefono +
				"\nCorreo: " + correo +
				"\ncargo: " + cargo +
				"\nSalario: " + formato.format(salario) +
				"\n--------------------------------------------------------");
	}
}