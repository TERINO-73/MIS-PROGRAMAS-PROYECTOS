
package ligafutbol;

import java.util.Objects;


public class Equipo implements Comparable<Equipo>{
 
    
    private String nombre;
    private int partidosGanados;
    private int partidosEmpatados;
    private int partidosPerdidos;
    private int golesAFavor;
    private int golesEnContra;

    public Equipo(String nombre, int partidosGanados, int partidosEmpatados, int partidosPerdidos, int golesAFavor, int golesEnContra) {
        this.nombre = nombre;
        this.partidosGanados = 0;
        this.partidosEmpatados = 0;
        this.partidosPerdidos = 0;
        this.golesAFavor = 0;
        this.golesEnContra = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPartidosGanados() {
        return partidosGanados;
    }

    public void setPartidosGanados(int partidosGanados) {
        this.partidosGanados = partidosGanados;
    }

    public int getPartidosEmpatados() {
        return partidosEmpatados;
    }

    public void setPartidosEmpatados(int partidosEmpatados) {
        this.partidosEmpatados = partidosEmpatados;
    }

    public int getPartidosPerdidos() {
        return partidosPerdidos;
    }

    public void setPartidosPerdidos(int partidosPerdidos) {
        this.partidosPerdidos = partidosPerdidos;
    }

    public int getGolesAFavor() {
        return golesAFavor;
    }

    public void setGolesAFavor(int golesAFavor) {
        this.golesAFavor = golesAFavor;
    }

    public int getGolesEnContra() {
        return golesEnContra;
    }

    public void setGolesEnContra(int golesEnContra) {
        this.golesEnContra = golesEnContra;
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
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Equipo other = (Equipo) obj;
        return Objects.equals(this.nombre, other.nombre);
    }




    
    public int puntos (){
        return partidosGanados * 3 + partidosEmpatados;
    }
    
    public int partidosJugados(){
        return partidosEmpatados + partidosGanados + partidosPerdidos;
    }

    public int diferenciaDeGoles(){
        
        return golesAFavor - golesEnContra;
    }
    public void reset(){
        partidosGanados = 0;
        partidosEmpatados = 0;
        partidosPerdidos = 0;
        golesAFavor = 0;
        golesEnContra = 0;      
    }

    @Override
    public String toString() {
        return   nombre + "/t"+this.puntos()+"/t" +this.partidosJugados()+  "/t"+ partidosGanados + "/t" + partidosEmpatados + "/t" + partidosPerdidos + "/t" + golesAFavor + "/t" + golesEnContra + "/t" +this.diferenciaDeGoles()+""    ;
    }

    @Override
    public int compareTo(Equipo otro) {
        if(this.puntos() == otro.puntos()) {
            return 0;
        } else if (this.puntos() < otro.puntos()) {
            return 1;
        }else{
            return -1;
        }
    }

    









}
