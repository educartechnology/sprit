package paquetegrupal16;

public class Usuario implements Asesoria {
	private int rut;
	private String nombre;
	private String fechadeNacimiento;
	private int run;

	public Usuario(int rut, String nombre, String fechadeNacimiento, int run) {
		super();
		this.rut = rut;
		this.nombre = nombre;
		this.fechadeNacimiento = fechadeNacimiento;
		this.run = run;
	}

	public int getRut() {
		return rut;
	}

	public void setRut(int rut) {
		this.rut = rut;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getFechadeNacimiento() {
		return fechadeNacimiento;
	}

	public void setFechadeNacimiento(String fechadeNacimiento) {
		this.fechadeNacimiento = fechadeNacimiento;
	}

	public int getRun() {
		return run;
	}

	public void setRun(int run) {
		this.run = run;
	}

	@Override
	public void analizarUsuario() {
	String mensaje = "\n\n\nrut=  " + rut + ", \n\nnombre=  " + nombre + ", \n\nfechadeNacimiento=  " + fechadeNacimiento + ", \n\nrun=  "
				+ run;
		System.out.println(mensaje);
	}
	
	
	
	
	
}
