/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionarelecciones;

import java.io.Serializable;

/**
 *
 * @author DAW_T
 */
public class Candidato implements Serializable {

    private String nombre;
    private Fecha fechaNac;
    private String siglasPartido;
    private String ciudad;

    public Candidato(String nombre, Fecha fechaNac, String siglasPartido, String ciudad) {
        this.nombre = nombre;
        this.fechaNac = fechaNac;
        this.siglasPartido = siglasPartido;
        this.ciudad = ciudad;
    }

    public Fecha getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(Fecha fechaNac) {
        this.fechaNac = fechaNac;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSiglasPartido() {
        return siglasPartido;
    }

    public void setSiglasPartido(String siglasPartido) {
        this.siglasPartido = siglasPartido;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Candidato:");
        sb.append("").append(nombre);
        sb.append(",").append(fechaNac);
        sb.append(",").append(siglasPartido);
        sb.append(",").append(ciudad);
        return sb.toString();
    }



}
