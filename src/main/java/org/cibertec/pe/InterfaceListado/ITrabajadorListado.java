package org.cibertec.pe.InterfaceListado;

import java.util.List;
import java.util.Optional;

import org.cibertec.pe.model.Trabajador;

public interface ITrabajadorListado {
	public List<Trabajador> Listado();
	public Optional<Trabajador> ver(String id_empleado);
	public int grabar(Trabajador t);
	public void suprimir(String id_empleado);
}
