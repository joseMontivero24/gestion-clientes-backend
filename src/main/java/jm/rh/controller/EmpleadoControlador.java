package jm.rh.controller;

import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jm.rh.modelo.Empleado;
import jm.rh.service.IEmpleadoServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("rh-app")
@CrossOrigin(value = "http://localhost:5173")
public class EmpleadoControlador {

    private static final Logger logger = LoggerFactory.getLogger(EmpleadoControlador.class);

    @Autowired
    private IEmpleadoServicio empleadoServicio;

    // http://localhost:8080/rh-app/empleados

    @GetMapping("/empleados") // Busqueda de empleados
    public List<Empleado> obtenerEmpleados(){
        var empleados = empleadoServicio.listarEmpleado();
        empleados.forEach((empleado -> logger.info(empleado.toString())));
        return empleados;
    }
    @PostMapping("/empleados")  // insertar o agregar
    public Empleado agregarEmpleado(@RequestBody Empleado empleado){
        logger.info("Empleado a agregar: " + empleado);
        return empleadoServicio.guardarEmpleado(empleado);
    }
}
