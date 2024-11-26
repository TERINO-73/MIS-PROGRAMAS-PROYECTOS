/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gestionarinstituto;

import java.util.ArrayList;

/**
 *
 * @author JMRivera
 */
public class ExamenJunio {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // TODO code application logic here
    Instituto instituto = new Instituto("41006900", "Velázquez", "Francisco Carrión Mejías 10", "Sevilla");
    inicio(instituto);
    int opcion = menu();
  }
  
  public static int menu(){
    int op;
    System.out.println("1.- Ver los datos del instituto.");
    System.out.println("2.- Dar de alta un empleado.");
    System.out.println("3.- Dar de baja un empleado.");
    System.out.println("4.- Ordenar empleados por distintos criterios.");
    System.out.println("5.- Ver los datos de un empleado.");
    System.out.println("6.- Modificar los datos de un empleado.");
    System.out.println("7.- Ver los datos de todos los empleados.");
    System.out.println("0.- Salir.");    
    op = Entrada.leerEntero("\nElija opción:");
    
    return op;
  }
  
  public static void inicio(Instituto inst){
    Personal p;
    Fecha f1, f2;
    f1 = new Fecha(1,1,1990);
    f2 = new Fecha(1,9,2021);
    p = new ProfesorInterino(false, "Informática", "Tutor", "1000", "Paco", f2, f1, 600222333);
    inst.altaEmpleado(p);
    p = new ProfesorInterino(false, "Informática", "", "2000", "Pepa", f2, f1, 600555666);
    inst.altaEmpleado(p);
    p = new ProfesorInterino(false, "Lengua", "", "3000", "Antonio", f2, f1, 600888999);
    inst.altaEmpleado(p);
    p = new ProfesorInterino(false, "Lengua", "Tutor", "4000", "Vicente", f2, f1, 600333111);
    inst.altaEmpleado(p);
    f1 = new Fecha(2,6,1965);
    f2 = new Fecha(1,9,2005);
    p = new ProfesorTitular(true, "Informática", "Tutor", "5000", "José María", f2, f1, 620555999);
    inst.altaEmpleado(p);
    f1 = new Fecha(10,8,1960);
    f2 = new Fecha(1,9,1999);
    p = new ProfesorTitular(true, "Matemáticas", "Director", "6000", "Pepe", f2, f1, 620777222);
    inst.altaEmpleado(p);
    f2 = new Fecha(1,9,2014);
    p = new ProfesorTitular(true, "Matemáticas", "Secretario", "7000", "Lourdes", f2, f1, 630222555);
    inst.altaEmpleado(p);
    f2 = new Fecha(1,9,2000);
    p = new ProfesorTitular(true, "Lengua", "Jefe de Departamento", "8000", "Emilio", f2, f1, 610555333);
    inst.altaEmpleado(p);
    f1 = new Fecha(10,8,1993);
    f2 = new Fecha(1,9,2019);
    p = new Laboral("Limpieza", "Mañana", "9000", "Alfredo", f2, f1, 680555999);
    inst.altaEmpleado(p);
    p = new Laboral("Ordenanza", "Mañana", "9100", "Baldomero", f2, f1, 680444000);
    inst.altaEmpleado(p);
    p = new Laboral("Ordenanza", "Tarde", "9200", "Fulgencio", f2, f1, 680777333);
    inst.altaEmpleado(p);
    p = new Laboral("Administrativo", "Mañana", "9300", "Carmen", f2, f1, 680333111);
    inst.altaEmpleado(p);
    
  }
  
  
}
