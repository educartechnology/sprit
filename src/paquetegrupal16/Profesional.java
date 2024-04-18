package paquetegrupal16;

public class Profesional extends Usuario {
		private String titulo;
		private String fechadeIngreso;
		

		public Profesional(int rut, String nombre, String fechadeNacimiento, int run, String titulo,String fechadeIngreso) {
			super(rut, nombre, fechadeNacimiento, run);
			this.titulo = titulo;
			this.fechadeIngreso = fechadeIngreso;
		}

		public String getTitulo() {
			return titulo;
		}

		public void setTitulo(String titulo) {
			this.titulo = titulo;
		}

		public String getFechadeIngreso() {
			return fechadeIngreso;
		}

		public void setFechadeIngreso(String fechadeIngreso) {
			this.fechadeIngreso = fechadeIngreso;
		}

		@Override
	    public void analizarUsuario() {
	        super.analizarUsuario(); // Llama al método de la clase padre
			String mensaje = "Profesional titulo=" + titulo + ", fechadeIngreso=" + fechadeIngreso ;
			System.out.println(mensaje);
	    }
}
