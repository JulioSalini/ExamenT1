package org.cibertec.pe.listado;



import java.util.List;
import java.util.Optional;

import org.cibertec.pe.InterfaceListado.ITrabajadorListado;
import org.cibertec.pe.interfaces.ITrabajador;
import org.cibertec.pe.model.Trabajador;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TrabajadorListado implements ITrabajadorListado {
	@Autowired
	private ITrabajador data;

	@Override
	public List<Trabajador> Listado() {
		return (List<Trabajador>)data.findAll();
	}

	@Override
	public Optional<Trabajador> ver(String id_empleado) {
		
		return data.findById(id_empleado);
	}

	@Override
	public int grabar(Trabajador t) {
		int res = 0;
		Trabajador ObjT = data.save(t);
		if(!ObjT.equals(null))res=1;
		return 0;
	}

	@Override
	public void suprimir(String id_empleado) {
		// TODO Auto-generated method stub
		
	}

}
