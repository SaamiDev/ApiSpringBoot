package com.proyectospring.Controllers;

import org.springframework.web.bind.annotation.RestController;

import com.mysql.cj.x.protobuf.MysqlxDatatypes.Array;
import com.proyectospring.Models.EmpleadoModel;
import com.proyectospring.Services.EmpleadosService;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;



@RestController
@RequestMapping("/empleados")
public class EmpleadosController {
 
    @Autowired 
    private EmpleadosService EmpleadosService;
    //@GetMapping("/getempleados")


    public ArrayList<EmpleadoModel> getEmpleados() {
        return this.EmpleadosService.getEmpleados();
    }

    public EmpleadoModel saveEmpleado(EmpleadoModel empleado) {
        return this.EmpleadosService.saveEmpleado(empleado);
    }
    
}
