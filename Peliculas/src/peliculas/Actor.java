/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package peliculas;

import java.util.Objects;

/**
 *
 * @author jesus_dtd
 */
public class Actor {
    private String nombre;
    private String nacionalidad;
    private Fecha fechaNacimiento;
    private String rol;

    public Actor(String nombre, String nacionalidad, Fecha fechaNacimiento, String rol) {
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
        this.fechaNacimiento = fechaNacimiento;
        this.rol = rol;
    }
    
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public Fecha getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Fecha fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Actor:");
        sb.append("").append(nombre);
        sb.append(",").append(nacionalidad);
        sb.append(",").append(fechaNacimiento);
        sb.append(",").append(rol);
        return sb.toString();
    }
    
    public void verActor(){
    
        System.out.println(toString());
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + Objects.hashCode(this.rol);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        final Actor other = (Actor) obj;
        return Objects.equals(this.rol, other.rol);
    }
    
    
    
}
