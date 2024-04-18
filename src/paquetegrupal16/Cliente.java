package paquetegrupal16;

public class Cliente extends Usuario {
	private String direccion;
	private String telefono;
	private int cantidaddeEmpleados;
	
	public Cliente (int rut, String nombre, String fechadeNacimiento, int run) {
		super(rut, nombre, fechadeNacimiento, run);
	}

	public Cliente(int rut, String nombre, String fechadeNacimiento, int run, String direccion, String telefono,
			int cantidaddeEmpleados) {
		super(rut, nombre, fechadeNacimiento, run);
		this.direccion = direccion;
		this.telefono = telefono;
		this.cantidaddeEmpleados = cantidaddeEmpleados;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public int getCantidaddeEmpleados() {
		return cantidaddeEmpleados;
	}

	public void setCantidaddeEmpleados(int cantidaddeEmpleados) {
		this.cantidaddeEmpleados = cantidaddeEmpleados;
	}
	@Override
    public void analizarUsuario() {
        super.analizarUsuario(); // Llama al método de la clase padre

        String mensaje = "\n\n\nCliente direccion=  " + direccion + ", \n\ntelefono=  " + telefono + ", \n\ncantidad de Empleados=  " + cantidaddeEmpleados;
        System.out.println(mensaje);
	}
}