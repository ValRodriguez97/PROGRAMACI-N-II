package co.edu.uniquindio.preparcial2.preparcial2.model;

import co.edu.uniquindio.preparcial2.preparcial2.model.builder.EmpleadoBuilder;

import java.util.ArrayList;
import java.util.List;

public class Empleado extends Persona{
    private List<Prestamo> listPrestamosAsociados;

    public Empleado(String nombre, String apellido, String cedula, String edad) {
        super(nombre, apellido, cedula, edad);
        this.listPrestamosAsociados = new ArrayList<>();
    }

    public static EmpleadoBuilder builder(){
        return new EmpleadoBuilder();
    }

    public List<Prestamo> getListPrestamosAsociados() {
        return listPrestamosAsociados;
    }

    public void setListPrestamosAsociados(List<Prestamo> listPrestamosAsociados) {
        this.listPrestamosAsociados = listPrestamosAsociados;
    }

    public void agregarPrestamo(Prestamo prestamo){
        this.listPrestamosAsociados.add(prestamo);
    }
}
