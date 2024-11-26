/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionarelecciones;

import java.io.BufferedReader;
import java.io.EOFException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

/**
 *
 * @author DAW_T
 */
public class Partido implements Serializable{

    private String siglas;
    private String nombre;
    private int votos;
    private int escañosConseguidos;
    private ArrayList<Candidato> candidatos;

    public Partido(String siglas, String nombre, int votos, int escañosConseguidos) {
        this.siglas = siglas;
        this.nombre = nombre;
        this.votos = votos;
        this.escañosConseguidos = escañosConseguidos;
        this.candidatos = new ArrayList<>();

    }

    public String getSiglas() {
        return siglas;
    }

    public void setSiglas(String siglas) {
        this.siglas = siglas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getVotos() {
        return votos;
    }

    public void setVotos(int votos) {
        this.votos = votos;
    }

    public ArrayList<Candidato> getCandidatos() {
        return candidatos;
    }

    public void setCandidatos(ArrayList<Candidato> candidatos) {
        this.candidatos = candidatos;
    }

    public int getEscañosConseguidos() {
        return escañosConseguidos;
    }

    public void setEscañosConseguidos(int escañosConseguidos) {
        this.escañosConseguidos = escañosConseguidos;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Partido:");
        sb.append("").append(siglas);
        sb.append(",").append(nombre);
        sb.append(",").append(votos);
        sb.append(",").append(escañosConseguidos);
        return sb.toString();
    }

    public void cargarCandidatos(String nombreFichero) {
        try {
            FileReader fichero = new FileReader(nombreFichero);
            BufferedReader entrada = new BufferedReader(fichero);
            Candidato c;
            String linea = entrada.readLine(); // lectura de una linea del fichero

            while (linea != null) {
                Scanner l = new Scanner(linea).useDelimiter(";");
                String nombre = l.next();
                String f1 = l.next();
                // Creo el objeto Scanner separando la fecha en dia, mes y año
                Scanner fecha1 = new Scanner(f1).useDelimiter("/");
                Fecha fecha = new Fecha(fecha1.nextInt(), fecha1.nextInt(), fecha1.nextInt());
                String siglas = l.next();

                String ciudad = l.next();

                c = new Candidato(nombre, fecha, siglas,ciudad);

                candidatos.add(c);

                linea = entrada.readLine(); // lectura de una linea del fichero

            }
            fichero.close();
        } catch (EOFException e) {
            // Se ha llegado al final del fichero
            System.out.println("Cargados todos los objetos del fichero" + nombreFichero);
        } catch (IOException e) {
            System.out.println("Error leyendo en el fichero:" + nombreFichero);
        }

    }

    public float porcentaje(int totalVotos) {

        float votosPartido = getVotos();
        return (votosPartido / totalVotos) * 100;

    }
    
    public void verCandidatos(){
    
    for(Candidato c: candidatos){
    
        System.out.println(c.toString());
    }
    }

    @Override
    public int hashCode() {
        int hash = 7;
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
        final Partido other = (Partido) obj;
        if (this.votos != other.votos) {
            return false;
        }
        if (this.escañosConseguidos != other.escañosConseguidos) {
            return false;
        }
        if (!Objects.equals(this.siglas, other.siglas)) {
            return false;
        }
        return Objects.equals(this.nombre, other.nombre);
    }
    
    
    


}
