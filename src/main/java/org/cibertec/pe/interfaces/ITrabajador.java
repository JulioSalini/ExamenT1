package org.cibertec.pe.interfaces;

import org.cibertec.pe.model.Trabajador;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ITrabajador extends JpaRepository<Trabajador, String>{

}
