public class Principal {

	public static void main(String[] args) {

		Empleado juan = new Empleado("Juan", "Gomez", 34, "3143267892", "juan.g@gmail.com");
		System.out.println(juan.getCargo());
		System.out.println(juan.getSalario());
		juan.mostrarDatos();

		Empleado maria = new Empleado("Maria", "Pinzon", 27, "3113877014", "maria.p@gmail.com", 1_550_000);
		System.out.println(maria.getCargo());
		System.out.println(maria.getSalario());
		maria.mostrarDatos();

		Empleado tatiana = new Empleado("Tatiana", "Parra", 26, "3158826321", "tatiana.p@gmail.com", "Gerente");
		System.out.println(tatiana.getCargo());
		System.out.println(tatiana.getSalario());
		tatiana.mostrarDatos();

		Empleado jhon = new Empleado("Jhon", "Valbuena", 31, "3121205279", "jhon.v@gmail.com", "Guarda de Seguridad", 1_670_000);
		System.out.println(jhon.getCargo());
		System.out.println(jhon.getSalario());
		jhon.mostrarDatos();

		Programador jaime = new Programador("Jaime", "Jaramillo", 20, "3228109812", "jaime.dev@gmail.com", "Java", "Junior");
		System.out.println(jaime.getCargo());
		System.out.println(jaime.getSalario());
		System.out.println(jaime.getLenguaje());
		System.out.println(jaime.getNivel());
		System.out.println(jaime.getProyectoActual());
		jaime.setSalario(2_580_000);
		jaime.setNivel("Senior");
		jaime.setProyecto("Backend Tienda Web");
		System.out.println(jaime.getSalario());
		System.out.println(jaime.getNivel());
		System.out.println(jaime.getProyectoActual());
		jaime.mostrarDatos();
		jaime.desarrollar();

		Programador karen = new Programador("Karen", "Perez", 19, "3153409812", "karen.dev@gmail.com", 2_200_000, "Kotlin", "Semi-Senior", "Aplicacion gestion de mercancia");
		System.out.println(karen.getCargo());
		System.out.println(karen.getSalario());
		System.out.println(karen.getLenguaje());
		System.out.println(karen.getNivel());
		System.out.println(karen.getProyectoActual());
		karen.mostrarDatos();

		Contador pedro = new Contador("Pedro", "Sanchez", 45, "3056719211", "pedro.s@gmail.com", "Impuestos");
		System.out.println(pedro.getCargo());
		System.out.println(pedro.getSalario());
		System.out.println(pedro.getEspecialidad());
		System.out.println(pedro.getTrabajoPrincipal());
		pedro.setSalario(1_840_000);
		pedro.setTrabajoPrincipal("Realizar el Estado de Resultados");
		System.out.println(pedro.getSalario());
		System.out.println(pedro.getTrabajoPrincipal());
		pedro.mostrarDatos();

		int base = 5;
		int exponente = 5;

		Potenciacion p1 = new Potenciacion(base, exponente);
		System.out.println("\n" + base + "^" + exponente + " = " + p1.getPotenciacion() + "\n");

		base = 5;
		exponente = 6;

		Potenciacion p2 = new Potenciacion(base, exponente);
		System.out.println("\n" + base + "^" + exponente + " = " + p2.getPotenciacion() + "\n");

		base = -5;
		exponente = 5;

		Potenciacion p3 = new Potenciacion(base, exponente);
		System.out.println("\n" + base + "^" + exponente + " = " + p3.getPotenciacion() + "\n");

		base = -5;
		exponente = 6;

		Potenciacion p4 = new Potenciacion(base, exponente);
		System.out.println("\n" + base + "^" + exponente + " = " + p4.getPotenciacion() + "\n");

		base = 5;
		exponente = -5;

		Potenciacion p5 = new Potenciacion(base, exponente);
		System.out.println("\n" + base + "^" + exponente + " = " + p5.getPotenciacion() + "\n");

		base = 5;
		exponente = -6;

		Potenciacion p6 = new Potenciacion(base, exponente);
		System.out.println("\n" + base + "^" + exponente + " = " + p6.getPotenciacion() + "\n");

		base = -5;
		exponente = -5;

		Potenciacion p7 = new Potenciacion(base, exponente);
		System.out.println("\n" + base + "^" + exponente + " = " + p7.getPotenciacion() + "\n");

		base = -5;
		exponente = -6;

		Potenciacion p8 = new Potenciacion(base, exponente);
		System.out.println("\n" + base + "^" + exponente + " = " + p8.getPotenciacion() + "\n");

	}

}