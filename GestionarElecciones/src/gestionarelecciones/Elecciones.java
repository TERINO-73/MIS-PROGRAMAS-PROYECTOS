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
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author DAW_T
 */
public class Elecciones implements Serializable{

    private int escaños;
    private ArrayList<Partido> partidos;
    private ArrayList<Candidato> resultado;
    private ArrayList<Resul> resul;

    public Elecciones(int escaños) {
        this.escaños = escaños;
        this.partidos = new ArrayList<>();
        this.resultado = new ArrayList<>();
        this.resul = new ArrayList<>();
    }

    public int getEscaños() {
        return escaños;
    }

    public void setEscaños(int escaños) {
        this.escaños = escaños;
    }

    public ArrayList<Partido> getPartidos() {
        return partidos;
    }

    public void setPartidos(ArrayList<Partido> partidos) {
        this.partidos = partidos;
    }

    public ArrayList<Candidato> getResultado() {
        return resultado;
    }

    public void setResultado(ArrayList<Candidato> resultado) {
        this.resultado = resultado;
    }

    public ArrayList<Resul> getEscañosp() {
        return resul;
    }

    public void setEscañosp(ArrayList<Resul> escañosp) {
        this.resul = escañosp;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Elecciones:");
        sb.append("").append(escaños);
        sb.append(",").append(partidos);
        sb.append(",").append(resultado);
        sb.append(",").append(resul);
        return sb.toString();
    }

    public void leyDhont() {

        resul.clear();
        resultado.clear();
        for (Partido p : partidos) {
            int i = this.escaños;
            double votosDivididos;
            String siglasPartido;
            float porcentajePartido = p.porcentaje(nTotalVotos());
            if( porcentajePartido >= 5.0){
                do {
                    votosDivididos = p.getVotos() / i;
                    siglasPartido = p.getSiglas();
                    Resul r = new Resul(votosDivididos, siglasPartido);
                    resul.add(r);
                    i--;
                } while (i != 0);
            }
        }

        Collections.sort(resul);
        int i = 0;
        int o = 0;
        int escaños;
        Resul r;

        for (Partido p : partidos) {
            i = 0;
            o = 0;
            escaños = p.getEscañosConseguidos();
            do{
                r = resul.get(o);
                if (r.getSiglasPartido().equals(p.getSiglas())) {
                    Candidato e = p.getCandidatos().get(i);
                    escaños++;
                    i++;
                    resultado.add(e);
                }
                o++;
            }while (o != getEscaños());
            p.setEscañosConseguidos(escaños);

        }

    }

    public int nTotalVotos() {

        int nvotos = 0;

        for (Partido p : partidos) {
            nvotos = nvotos + p.getVotos();
        }
        return nvotos;
    }

    public void cargarPartidos(String nombreFichero) {

        try {
            FileReader fichero = new FileReader(nombreFichero);
            BufferedReader entrada = new BufferedReader(fichero);
            Partido p;
            String linea = entrada.readLine(); // lectura de una linea del fichero

            while (linea != null) {
                Scanner l = new Scanner(linea).useDelimiter(";");
                String siglas = l.next();
                String nombre = l.next();
                int votos = l.nextInt();
                int escañosConseguidos = l.nextInt();
                p = new Partido(siglas, nombre, votos, escañosConseguidos);

                partidos.add(p);

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

    public void verPartidos() {

        for (Partido p : partidos) {

            System.out.println(p.toString());
        }
    }

    public void verPartido(String sigla) {

        for (Partido p : partidos) {

            if (p.getSiglas().equals(sigla)) {
                System.out.println(p.toString());
            }
        }
    }

    public void verResultado() {

        for (Candidato c : resultado) {

            System.out.println(c.toString());
        }
    }

    public Partido buscarPartido(String sigla) {
        for (Partido p : partidos) {

            if (p.getSiglas().equals(sigla)) {
                return p;
            }
        }
        return null;
    }
    
    public void verResul(){
    
        for(Resul r: resul){
        
            System.out.println(r.toString());
        }
    }

}
