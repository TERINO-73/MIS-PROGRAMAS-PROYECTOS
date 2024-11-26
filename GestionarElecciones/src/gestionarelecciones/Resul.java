/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionarelecciones;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author DAW_T
 */
public class Resul implements Comparable<Resul>,Serializable{
    private double numeroVotosPartido;
    private String siglasPartido;

    public Resul(double numeroVotosPartido, String siglasPartido) {
        this.numeroVotosPartido = numeroVotosPartido;
        this.siglasPartido = siglasPartido;
    }

    public double getNumeroVotosPartido() {
        return numeroVotosPartido;
    }

    public void setNumeroVotosPartido(double numeroVotosPartido) {
        this.numeroVotosPartido = numeroVotosPartido;
    }

    public String getSiglasPartido() {
        return siglasPartido;
    }

    public void setSiglasPartido(String siglasPartido) {
        this.siglasPartido = siglasPartido;
    }

    @Override
    public int hashCode() {
        int hash = 5;
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
        final Resul other = (Resul) obj;
        if (Double.doubleToLongBits(this.numeroVotosPartido) != Double.doubleToLongBits(other.numeroVotosPartido)) {
            return false;
        }
        return Objects.equals(this.siglasPartido, other.siglasPartido);
    }



    @Override
    public int compareTo(Resul o) {
        if (this.getNumeroVotosPartido() == o.getNumeroVotosPartido()) {
            return 0;
        } else if (this.getNumeroVotosPartido() < o.getNumeroVotosPartido()) {
            return 1;
        } else {
            return -1;
        }    
    
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Resul:");
        sb.append("").append(numeroVotosPartido);
        sb.append(",").append(siglasPartido);
        return sb.toString();
    }
    
    


    
    
    
}
