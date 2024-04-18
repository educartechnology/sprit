package paquetegrupal16;

import java.util.ArrayList;
import java.util.List;

public class Listado {
	private List<Asesoria> listaUsuarios;
	private List<Asesoria> listaCapacitaciones;

	// Constructor
	public Listado() {
		this.listaUsuarios = new ArrayList<>();
		this.listaCapacitaciones = new ArrayList<>(); 
	}

	// Método para agregar un elemento al listado
	public void agregarUsuario(Asesoria usuario) {
		listaUsuarios.add(usuario);
	}
	public void agregarCapacitacion(Asesoria capacitacion) {
		listaUsuarios.add(capacitacion);
	}

	// Método para llamar al método analizarUsuario() de todas las instancias
	// registradas en el listado
	public void analizarTodosUsuarios() {
		for (Asesoria usuario : listaUsuarios) {
			usuario.analizarUsuario();
		}
	}
	public void analizarTodasCapacitaciones() {
		for (Asesoria capacitacion : listaCapacitaciones) {
				capacitacion.analizarUsuario();
			}
	}
}
