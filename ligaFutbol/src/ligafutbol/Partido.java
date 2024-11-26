
package ligafutbol;


public class Partido {
    private String nombreLocal;
    private int golesLocal;
    private String nombreVisitante;
    private int golesVistitante;

    public Partido(String nombreLocal, int golesLocal, String nombreVisitante, int golesVistitante) {
        this.nombreLocal = nombreLocal;
        this.golesLocal = golesLocal;
        this.nombreVisitante = nombreVisitante;
        this.golesVistitante = golesVistitante;
    }

    Partido() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String getNombreLocal() {
        return nombreLocal;
    }

    public int getGolesLocal() {
        return golesLocal;
    }

    public String getNombreVisitante() {
        return nombreVisitante;
    }

    public int getGolesVistitante() {
        return golesVistitante;
    }

    @Override
    public String toString() {
        return ""+ nombreLocal + ";" + golesLocal + ";" + nombreVisitante + ";" + golesVistitante +"" ;
    }
    
    public boolean ganaLocal(){
        return true;
    }
    
    public boolean ganaVisitante(){
        return true;
    }
    
    
    
    
    
    
    
}
