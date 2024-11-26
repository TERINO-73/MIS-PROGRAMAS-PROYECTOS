
package ligafutbol;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;


public class Liga {
    
    
        private ArrayList<Partido> partidos;
        private ArrayList<Equipo> equipos;

    public Liga(ArrayList<Partido> partidos, ArrayList<Equipo> equipos) {
        this.partidos = partidos;
        this.equipos = equipos;
    }

    Liga() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }



    public void verEquipos(){
        
        System.out.println("Nombre  PG  PE  PP  GF  GC  GD");
        for (Equipo equipo : equipos) {
            if (equipos != null) {
                equipo.toString();
            }
            
        }
    }
    
    public void verPartidos(){
        for (Partido partido : partidos) {
            if (partidos != null) {
                partido.toString();
            }
            
        }
    }
    
    public void cargaEquipos(){
    
   }


    
    public void cargaJornada(String nombreFichero){
                try {
            Partido partidoo = null;
            
            FileReader fichero = new FileReader(nombreFichero);
            BufferedReader br = new BufferedReader(fichero);
            String linea = br.readLine(); // lectura de una línea del fichero
            while (linea != null) {
               Scanner lee = new Scanner(linea).useDelimiter(";");
               String nombreLocal = lee.next();
               int golesLocal = lee.nextInt(); 
               String nombreVisitante = lee.next();
               int golesVisitante = lee.nextInt();
               partidoo = new Partido(nombreLocal, golesLocal, nombreVisitante, golesVisitante);
               partidos.add(partidoo);
               linea = br.readLine();
               
    
            }
            
            br.close();
        } catch (Exception e) {
            System.out.println("Error en el formato del fichero.");
        }
   }
    public void gestionarPartido(){
        
   }
    }
    

