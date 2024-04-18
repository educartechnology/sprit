package paquetegrupal16;

//1.- Clase y sus atributos 
public class Capacitacion implements Asesoria {	 
	private int identificador;
	private int rutCliente;
	private String dia;
	private String hora;
	private String lugar;
	private String duracion;
	private int cantidaddeAsistentes;

//2.- metodo toString()
	@Override
	public String toString() {
		return "Capacitacion [identificador=" + identificador + ", rutCliente=" + rutCliente + ", dia=" + dia
				+ ", hora=" + hora + ", lugar=" + lugar + ", duracion=" + duracion + ", cantidaddeAsistentes="
				+ cantidaddeAsistentes + "]";
	}
// 3. constructor que no reciba parametros	
	public Capacitacion() {
	}
// 4. Un constructor que reciba todos los atributos de la clase como parámetros	
	Capacitacion(int identificador, int rutCliente, String dia, String hora, String lugar, String duracion, int cantidaddeAsistentes) {
		 this.identificador = identificador;
		 this.rutCliente = rutCliente;
		 this.dia = dia;
		 this.hora = hora;
		 this.lugar = lugar;
		 this.duracion = duracion;
		 this.cantidaddeAsistentes = cantidaddeAsistentes;
	}
// 5.- Metodos Mutadores
    public void setIdentificador(int identificador) {
    	this.identificador = identificador;    	
    }
    public void setRutCliente(int rutCliente) {
    	this.rutCliente = rutCliente;    	
    }
    public void setDia(String dia) {
    	this.dia = dia;    	
    }
    public void setHora(String hora) {
    	this.hora = hora;    	
    }
    public void setLugar(String lugar) {
    	this.lugar = lugar;    	
    }
    public void setDuracion(String duracion) {
    	this.duracion = duracion;    	
    }
    public void setCantidaddeAsistentes(int cantidaddeAsistentes) {
    	this.cantidaddeAsistentes = cantidaddeAsistentes;    	
    }
// 6.- Metodos Accesores   
    public int getIdentificador() {
    	return this.identificador;
    }
    public int getRutCliente() {
    	return this.rutCliente;
    }
    public String getLugar() {
    	return this.lugar;
    }
	public String getDia() {
		return dia;
	}
	public String getHora() {
		return hora;
	}
	public String getDuracion() {
		return duracion;
	}
	public int getCantidaddeAsistentes() {
		return cantidaddeAsistentes;
	}
// 7.- mostrar Detalle capacitacion
	 public void mostrarDetalle(String lugar, String hora, String dia, String duracion) {
		System.out.println(" la capacitacion sera en ");
		System.out.println(lugar);	
		System.out.println(" a las  ");
		System.out.println(hora);
		System.out.println(" del dia ");
		System.out.println(dia);
		System.out.println(" y durara ");
		System.out.println(duracion);
	 }	
// ......
	public void analizarUsuario() {
	    mostrarDetalle(lugar,hora,dia,duracion);
	}
}
