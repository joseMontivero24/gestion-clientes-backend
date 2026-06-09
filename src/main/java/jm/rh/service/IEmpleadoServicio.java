package jm.rh.service;

import jm.rh.modelo.Empleado;

import java.util.List;

public interface IEmpleadoServicio {
    //Metodos
    // Para listar todos los empleados
    public List<Empleado> listarEmpleado();

    //  Buscar por ID
    public Empleado buscarEmpleadoPorId(Integer idEmpleado);

    // Para insertar o actualizar
    public Empleado guardarEmpleado(Empleado empleado);

    // Elimirar empleado
    public void elimiarEmpleado(Empleado empleado);

}
