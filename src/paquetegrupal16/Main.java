package paquetegrupal16;

import java.util.Random;
import java.util.Scanner;

/*
String[] Rapellidos = {"perez gonzales", "hernandez perez", "escudero jimenez", "ojeda garcilazo", "parada arraiz", "molina barrientos", "escobar zambrano"};
*/
/*
    ************* datos para la Clase Usuario 
 */
public class Main {
	// captura nombre valida que ingrese un dato
	public static String captNombre() {
		String[] nombres = { "Juan jose", "ana María", "Pedro manuel", "Ana eloisa", "jesus maria", "carlos jose",
				"zandra josefina" };
		Random rand = new Random();
		boolean valido = true;
		String nombre = "";
		while (valido) {
			Scanner leer = new Scanner(System.in);
			System.out.println("ingrese el valor de nombre");
			nombre = nombres[rand.nextInt(nombres.length)];
			// nombre = leer.nextLine();
			if (nombre.length() > 4) {
				valido = false;
			}
		}
		return nombre;
	}

	public static String captDiaL() {
		String[] dias = { "Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "sabado" };
		Random rand = new Random();
		boolean valido = true;
		String diaL = "";
		while (valido) {
			Scanner leer = new Scanner(System.in);
			System.out.println("ingrese el Dia de lunes a Sabado");
			diaL = dias[rand.nextInt(dias.length)];
			// nombre = leer.nextLine();
			if (diaL.length() > 4) {
				valido = false;
			}
		}
		return diaL;
	}

	// captura dia valido
	public static int captDia(String msg) {
		Scanner leer = new Scanner(System.in);
		Random rand = new Random();
		int diaNac = 1;
		boolean valido = true;
		while (valido) {
			int limiteInferior = 1;
			int limiteSuperior = 30;
			System.out.println(msg);
			diaNac = rand.nextInt(limiteSuperior - limiteInferior + 1) + limiteInferior;
			// diaNac = leer.nextInt();
			if (diaNac >= 1 && diaNac <= 31) {
				valido = false;
			}
		}
		return diaNac;
	}

	// captura un mes valido
	public static int captMes(String msg) {
		Random rand = new Random();
		int mesNac = 1;
		boolean valido = true;
		while (valido) {
			int limiteInferior = 1;
			int limiteSuperior = 12;
			System.out.println(msg);
			mesNac = rand.nextInt(limiteSuperior - limiteInferior + 1) + limiteInferior;
			// mesNac = leer.nextInt();
			if (mesNac >= 1 && mesNac <= 12) {
				valido = false;
			}
		}
		return mesNac;
	}

	// captura un año valido
	public static int captAno(String msg) {
		Random rand = new Random();
		int anoNac = 1930;
		boolean valido = true;
		while (valido) {
			int limiteInferior = 1930;
			int limiteSuperior = 2006;
			System.out.println(msg);
			anoNac = rand.nextInt(limiteSuperior - limiteInferior + 1) + limiteInferior;
			// anoNac = leer.nextInt();
			if (anoNac > 1930 && anoNac < 2006) {
				valido = false;
			}
		}
		return anoNac;
	}

	public static String captFechaNac() {
		int diaNac = captDia("dia de nacimiento");
		int mesNac = captMes("mes de nacimiento");
		int anoNac = captAno("año de Nacimiento");
		String sDiaNac = Integer.toString(diaNac);
		String sMesNac = Integer.toString(mesNac);
		String sAnoNac = Integer.toString(anoNac);
		String fechaNac = sDiaNac + "-" + sMesNac + "-" + sAnoNac;
		return fechaNac;
	}

	// captura rut valida que ingresen datos
	public static int captRut() {
		Random rand = new Random();
		int rut = 0;
		Scanner leer = new Scanner(System.in);
		try {
			System.out.println("ingrese el rut");
			// rut = leer.nextInt();
			rut = rand.nextInt(900000);
		} catch (NumberFormatException e) {
			System.out.println("Error: Por favor ingrese solo números enteros."); // Captura la excepción si la entrada
																					// no es un entero
		}
		String srut = Integer.toString(rut);
		return rut;
	}

	public static int captRun() {
		Random rand = new Random();
		int run = 1700000;
		Scanner leer = new Scanner(System.in);
		try {
			System.out.println("ingrese el run");
			// run = leer.nextInt();
			run = rand.nextInt(900000);
		} catch (NumberFormatException e) {
			System.out.println("Error: Por favor ingrese solo números enteros."); // Captura la excepción si la entrada
																					// no es un entero
		}
		String srun = Integer.toString(run);
		return run;
	}

	/** ********** Datos para la Clase Cliente */
	// captura direccion valida que se introduscan datos
	public static String captDireccion(String msg) {
		String[] direcciones = { "av miranda con av 23 222 ", "av pedro alcaraz 23111", "av manuel simon trujillo ",
				"av ambrossio plaza 727272", "av julio calcaño 22222 ", "av pedro torres 838838",
				"av jose san marti 88e8883" };
		Random rand = new Random();
		boolean valido = true;
		String direccion = "";
		while (valido) {
			Scanner leer = new Scanner(System.in);
			System.out.println(msg);
			direccion = direcciones[rand.nextInt(direcciones.length)];
			// direccion = leer.nextLine();
			if (direccion.length() > 15) {
				valido = false;
			}
		}
		return direccion;
	}

	// captura telefono valida que se ingresen al menos 9 caracteres
	public static String captTelefono() {
		Random rand = new Random();
		boolean valido = true;
		String telefono = "";
		while (valido) {
			Scanner leer = new Scanner(System.in);
			System.out.println("ingrese el telefono  *");
			telefono = "569"; // Prefijo común
			for (int i = 0; i < 8; i++) {
				telefono += rand.nextInt(10); // Agrega dígitos aleatorios
			}
			// telefono = leer.nextLine();
			if (telefono.length() >= 9) {
				valido = false;
			}
		}
		return telefono;
	}

	public static int captCantidad(String msg) {
		Random rand = new Random();
		int numEmpleados;
		Scanner leer = new Scanner(System.in);
		System.out.println(msg);
		int limiteInferior = 1;
		int limiteSuperior = 12;
		numEmpleados = rand.nextInt(limiteSuperior - limiteInferior + 1) + limiteInferior;
		// numEmpleados = leer.nextInt();
		String sNumEmpleados = Integer.toString(numEmpleados);
		return numEmpleados;
	}

	/* * ************** Datos para la Clase Profesional */
	public static String captTitulo() {
		String[] titulos = { "ingeniero de prevencion", "especialista en enfermeria", "tecnico en prevencion",
				"rescatista de altura", "paramedico iV" };
		Random rand = new Random();
		Scanner leer = new Scanner(System.in);
		System.out.println("ingrese el titulo obtenido ");
		String titulo = titulos[rand.nextInt(titulos.length)];
		// String titulo = leer.nextLine();
		return titulo;
	}

	// captura fecha de ingreso
	public static String captFechadeIngreso() {
		int diaIngreso = captDia("dia de Ingreso");
		int mesIngreso = captMes("mes de Ingreso");
		int anoIngreso = captAno("año de Igreso ENTRE 1990 Y 2024");
		String sDiaIngreso = Integer.toString(diaIngreso);
		String sMesIngreso = Integer.toString(mesIngreso);
		String sAnoIngreso = Integer.toString(anoIngreso);
		String fechaIngreso = sDiaIngreso + "-" + sMesIngreso + "-" + sAnoIngreso;
		return fechaIngreso;
	}

	/* * ************** datos para la clase Administrativo */
	// captura la funcion que realiza el usuario
	public static String captArea() {
		String[] areas = { "bodega almacen", "contaduria administracion", "computacion procesamiento",
				"seguridad control de acceso" };
		Random rand = new Random();
		boolean valido = true;
		String area = "";
		while (valido) {
			Scanner leer = new Scanner(System.in);
			System.out.println("ingrese la Area de trabajo ");
			area = areas[rand.nextInt(areas.length)];
			// area = leer.nextLine();
			if (area.length() > 3) {
				valido = false;
			}
		}
		return area;
	}

	public static String captExperienciaPrevia() {
		String[] experiencias = { "24 años de experiencia", "20 años de experiencia", "4 años de experiencia",
				"2 años de experiencia" };
		Random rand = new Random();
		boolean valido = true;
		String experienciaPrevia = "";
		while (valido) {
			Scanner leer = new Scanner(System.in);
			System.out.println("ingrese la experiencia Previa ");
			experienciaPrevia = experiencias[rand.nextInt(experiencias.length)];
			// experienciaPrevia = leer.nextLine();
			if (experienciaPrevia.length() > 7) {
				valido = false;
			}
		}
		return experienciaPrevia;
	}

	public static String captDuracion() {
		String[] duraciones = { "1 hora", "2 horas ", "3 horas ", "4 horasa" };
		Random rand = new Random();
		boolean valido = true;
		String duracion = "";
		
		while (valido) {
			Scanner leer = new Scanner(System.in);
			System.out.println("ingrese cuanto va a durar la capacitacion");
			duracion = duraciones[rand.nextInt(duraciones.length)];
			// duracion = leer.nextLine();
			if (duracion.length() > 4) {
				valido = false;
			}
		}
		return duracion;
	}

	public static String captHora() {
		return "08:30";
	}

	public static Listado captCliente(Listado listado) {
		Scanner leer = new Scanner(System.in);
		String nombre;
		String fechadeNacimiento;
		int rut;
		int run;
		String direccion;
		String telefono;
		int cantidaddeEmpleados;
		nombre = captNombre();
		fechadeNacimiento = captFechaNac();
		run = captRun();
		rut = captRut();
		direccion = captDireccion("Direccion del Cliente");
		telefono = captTelefono();
		cantidaddeEmpleados = captCantidad("cantidad de empleados 1 al 100");
		Cliente cliente1 = new Cliente(rut, nombre, fechadeNacimiento, run, direccion, telefono,
				cantidaddeEmpleados);
		listado.agregarUsuario(cliente1);
		return listado;
	}

	public static Listado captAdministrativo(Listado listado) {
		Scanner leer = new Scanner(System.in);
		String nombre;
		String fechadeNacimiento;
		int rut;
		int run;
		String area;
		String experienciaPrevia;
		nombre = captNombre();
		fechadeNacimiento = captFechaNac();
		run = captRun();
		rut = captRut();
		area = captArea();
		experienciaPrevia = captExperienciaPrevia();
		Administrativo admin1 = new Administrativo(rut, nombre, fechadeNacimiento, run, area, experienciaPrevia);
		listado.agregarUsuario(admin1);
		return listado;
	}

	public static Listado captProfesional(Listado listado) {
		Scanner leer = new Scanner(System.in);
		String nombre;
		String fechadeNacimiento;
		int rut;
		int run;
		nombre = captNombre();
		fechadeNacimiento = captFechaNac();
		run = captRun();
		rut = captRut();
		String titulo;
		String fechadeIngreso;
		titulo = captTitulo();
		fechadeIngreso = captFechadeIngreso();
		Profesional prf1 = new Profesional(rut, nombre, fechadeNacimiento, run, titulo, fechadeIngreso);
		listado.agregarUsuario(prf1);
		return listado;
	}

	public static Listado captCapacitacion(Listado listado) {
		Scanner leer = new Scanner(System.in);
		int identificador;
		int rutCliente;
		String hora;
		String dia;
		String lugar;
		String duracion;
		int cantidaddeAsistentes;
		identificador = captCantidad("numero del curso "); // captIdentificador();
		rutCliente = captRut(); // buscaRutCliente();
		dia = captDiaL();
		hora = captHora(); // captHora();
		lugar = captDireccion("Direccion de la capacitacion");
		duracion = captDuracion();
		cantidaddeAsistentes = captCantidad("cantidad de asistentes al curso ");
		Capacitacion curso1 = new Capacitacion(identificador, rutCliente, dia, hora, lugar, duracion,
				cantidaddeAsistentes);
		listado.agregarCapacitacion(curso1);
		return listado;
	}

	public static void main(String[] args) {
		Listado listado = new Listado();
		int kontador = 1;
		Scanner scanner = new Scanner(System.in);
		int opcion;
		String cliente;
		String administrativo;
		String profesional;
		String capacitacion;
		do {
			System.out.println("1. Almacenar cliente");
			System.out.println("2. Almacenar profesional");
			System.out.println("3. Almacenar administrativo");
			System.out.println("4. Almacenar capacitación");
			System.out.println("5. Eliminar usuario");
			System.out.println("6. Listar usuarios");
			System.out.println("7. Listar usuarios por tipo");
			System.out.println("8. Listar capacitaciones");
			System.out.println("9. Salir");
			System.out.print("Seleccione una opción: ");
			opcion = scanner.nextInt();
			switch (opcion) {
				case 1:
					captCliente(listado);
					break;
				case 2:
					captProfesional(listado);
					break;
				case 3:
					captAdministrativo(listado);
					break;
				case 4:
					// eliminaUsuario(listado)// eliminarUsuario(usuarioRut);
					break;
				case 5:
					listado.analizarTodosUsuarios();
					break;
				case 6:
					
					// listarUsuarioT(tipo); 
					break;
				case 7:
					captCapacitacion(listado);
					break;
				case 8:
					// listarCapacitaciones();
					// Lógica para listar capacitaciones
					break;
				case 9:
					System.out.println("Saliendo del programa...chao!!");
					break;
				default:
					System.out.println("Opción no válida. Inténtelo de nuevo.");
			}
		} while (opcion != 9);
		scanner.close();
	}
}