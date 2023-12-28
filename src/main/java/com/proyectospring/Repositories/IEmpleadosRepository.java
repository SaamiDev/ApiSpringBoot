package com.proyectospring.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.proyectospring.Models.EmpleadoModel;

@Repository // Clase que permite hacer querys a BBDD
public interface IEmpleadosRepository extends JpaRepository<EmpleadoModel, Long>{
    
    
}
