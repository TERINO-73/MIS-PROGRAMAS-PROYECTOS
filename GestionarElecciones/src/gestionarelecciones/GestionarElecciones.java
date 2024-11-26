/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gestionarelecciones;

/**
 *
 * @author jesus_dtd
 */
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 *
 * @author JMRivera
 */
public class GestionarElecciones implements Serializable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Elecciones eleccion;
        //eleccion = new Elecciones(5);
        eleccion = leerEleccionesDeFichero();

        String pedir;
        int pedirint;
        Partido p;

        int op, opcion = menu();
        while (opcion != 0) {
            switch (opcion) {
                case 1:
                    eleccion.verPartidos();
                    break;
                case 2:
                    pedir = Entrada.leerCadena("Introduzca el nombre del archivo que desea leer");
                    eleccion.cargarPartidos(pedir);
                    break;
                case 3:
                    pedir = Entrada.leerCadena("Introduzca las siglas del partido que quiere ver");
                    eleccion.verPartido(pedir);
                    break;
                case 4:
                    pedir = Entrada.leerCadena("Introduzca las siglas del partido donde se quiere meter los candidatos");
                    p = eleccion.buscarPartido(pedir);
                    pedir = Entrada.leerCadena("Introduzca el nombre del archivo que desea leer");
                    p.cargarCandidatos(pedir);
                    break;
                case 5:
                    eleccion.leyDhont();
                    break;
                case 6:
                    eleccion.verResultado();
                    break;
                case 7:
                    pedirint = Entrada.leerEntero("Introduzca cuantos escaños quiere que haya en las elecciones");
                    eleccion.setEscaños(pedirint);
                    break;
                case 8:
                    pedir = Entrada.leerCadena("Introduzca las siglas del partido donde se quiere meter los candidatos");
                    p = eleccion.buscarPartido(pedir);
                    p.verCandidatos();
                    break;
                case 9:
                    eleccion.verResul();
                default:
                    break;

            }
            opcion = menu();
        }
        guardarEleccionesEnFichero(eleccion);

    }

    public static int menu() {
        int op;
        System.out.println("\nMenu:\n");
        System.out.println("1.- Listar Partidos");
        System.out.println("2.- Cargar partidos desde fichero");
        System.out.println("3.- Ver los datos de un partido");
        System.out.println("4.- Cargar los candidatos de un partido desde un archivo de texto");
        System.out.println("5.- Calcular el resultado de las elecciones");
        System.out.println("6.- Mostar el resultado de las elecciones");
        System.out.println("7.- Cambiar numero de candidatos con los que quiero que se calcule");
        System.out.println("8.- Mostar los candidatos de un partido");
        System.out.println("9.- Mostar resul");
        System.out.println("0.- Salir.");
        op = Entrada.leerEntero("\nElija opción:");

        return op;
    }

    public static void guardarEleccionesEnFichero(Elecciones eleccion) {
        try {
            FileOutputStream fichero = new FileOutputStream("Elecciones.dat");
            ObjectOutputStream salida = new ObjectOutputStream(fichero);
            salida.writeObject(eleccion);
            fichero.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static Elecciones leerEleccionesDeFichero() {
        Elecciones eleccion = null;
        try {
            FileInputStream fichero = new FileInputStream("Elecciones.dat");
            ObjectInputStream entrada = new ObjectInputStream(fichero);
            eleccion = (Elecciones) entrada.readObject();
            fichero.close();
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException | ClassNotFoundException e) {
            //
        }
        return eleccion;
    }

}
