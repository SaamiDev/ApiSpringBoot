package com.proyectospring.Services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyectospring.Models.EmpleadoModel;
import com.proyectospring.Repositories.IEmpleadosRepository;

@Service
public class EmpleadosService {
    
    @Autowired
    IEmpleadosRepository EmpleadoRepository;

    public ArrayList<EmpleadoModel> getEmpleados() {
        return (ArrayList<EmpleadoModel>) EmpleadoRepository.findAll();
    }

    public EmpleadoModel saveEmpleado(EmpleadoModel empleado) {
            return EmpleadoRepository.save(empleado);
    }

    public EmpleadoModel getOne(Long idEmpleado) {
        return EmpleadoRepository.
    }

}
