/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionarinstituto;

import java.util.ArrayList;

/**
 *
 * @author jesus_dtd
 */
public class Instituto {

    private String codigo;
    private String nombre;
    private String direccion;
    private String ciudad;
    private ArrayList<Personal> plantilla;

    public Instituto(String codigo, String nombre, String direccion, String ciudad) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.direccion = direccion;
        this.ciudad = ciudad;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public ArrayList<Personal> getPlantilla() {
        return plantilla;
    }

    public void setPlantilla(ArrayList<Personal> plantilla) {
        this.plantilla = plantilla;
    }

    public Personal buscarEmpleado(String nrp) {

        for (Personal empleado : plantilla) {
            if (empleado.getNrp().equals(nrp)) {
                return empleado;
            }
        }
        return null;
    }

    public Personal buscarEmpleado(int telefono) {
        for (Personal empleado : plantilla) {
            if (empleado.getTelefono() == telefono) {
                return empleado;
            }
        }
        return null;
    }

    public Profesor director() {

        for (Personal empleado : plantilla) {
            if (empleado instanceof Profesor) {
                Profesor profesor = (Profesor) empleado;
                if ("Director".equalsIgnoreCase(profesor.getPuesto())) {
                        return profesor;
            }
            }
        }

        return null;
    }

    public void verDatos() {
        System.out.println("Código: " + codigo);
        System.out.println("Nombre: " + nombre);
        System.out.println("Dirección: " + direccion);
        System.out.println("Ciudad: " + ciudad);
    }

    public boolean altaEmpleado(Personal p) {
        return plantilla.add(p);
    }

    public boolean bajaEmpleado(Personal p) {
        return plantilla.remove(p);
    }

    public void verLaborales() {
        for (Personal empleado : plantilla) {
            if (empleado instanceof Laboral) {
                System.out.println(empleado);
            }
        }
    }

    public void verProfesores() {
        for (Personal empleado : plantilla) {
            if (empleado instanceof Profesor) {
                System.out.println(empleado);
            }
        }
    }

    public void verPersonal() {
        for (Personal empleado : plantilla) {
            System.out.println(empleado);
        }
    }

    public void guardarLaborales() {

        
    }

    public void guardarInterinos() {

    }

    public void guardarTitulares() {

    }

    public void leerLaborales() {

    }

    public void leerInterinos() {

    }

    public void leerTitulares() {

    }

    public void cargarEmpleados(String nombreArchivo) {

    }

    public Personal pedirDatosEmpleado() {

        return null;

    }

}
