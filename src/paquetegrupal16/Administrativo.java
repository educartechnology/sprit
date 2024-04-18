package paquetegrupal16;

public class Administrativo extends Usuario {
	private String area;
	private String experienciaPrevia;
	
	public Administrativo(int rut, String nombre, String fechadeNacimiento, int run, String area, 	String experienciaPrevia) {
		super(rut, nombre, fechadeNacimiento, run);
		this.area = area;
		this.experienciaPrevia = experienciaPrevia;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getExperienciaPrevia() {
		return experienciaPrevia;
	}

	public void setExperienciaPrevia(String experienciaPrevia) {
		this.experienciaPrevia = experienciaPrevia;
	}

	@Override
    public void analizarUsuario() {
        super.analizarUsuario(); // Llama al método de la clase padre
		String mensaje = "Administrativo area=" + area + ", experienciaPrevia=" + experienciaPrevia + ", toString()=" + super.toString() ;
		System.out.println(mensaje);
	}
}
