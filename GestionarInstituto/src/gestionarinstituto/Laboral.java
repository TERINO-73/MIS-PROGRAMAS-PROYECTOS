/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionarinstituto;

/**
 *
 * @author jesus_dtd
 */
public class Laboral extends Personal {
    
    private String categoria;
    private String turno;

    public Laboral(String categoria,String turno,String nrp, String nombre, Fecha fechaIngreso, Fecha fechaNacimiento, int telefono) {
        super(nrp, nombre, fechaIngreso, fechaNacimiento, telefono);
        this.categoria = categoria;
        this.turno = turno;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }
    
    @Override
    public double salario(){
        return 1000;
    }
    
    @Override
    public double complemento() {
        if (categoria == "Administrativo"){
            return salario() + 300;
        }else if (categoria =="Ordenanza") {
            return salario() + 200;
        }else if(categoria == "Limpieza"){
            return salario() + 100;
        }
        return 0;
    }
    
    public void verDatos(){
        System.out.println(categoria+" ");
        System.out.println(" "+turno+" ");
        super.verDatos();
    }

    
}
