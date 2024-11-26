
package ligafutbol;


public class GestionarLiga {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Liga MiLiga = new Liga(null,null);
        
        
        

        int opcion = menu();
        while (opcion != 0) {
            switch (opcion) {
                case 1:
                    
                    break;
                case 2:
                    
                    break;
                case 3:

                    break;
                case 4:

                    break;
                case 5:
                    String nombreFichero = null;
                    nombreFichero = Entrada.leerCadena("Nombre del fichero: ");
                    MiLiga.cargaJornada(nombreFichero);


                case 6:
                 
                case 7:
                    
                case 8:
                    
            }
            Entrada.leerCadena("\nPulse INTRO para continuar.");
            opcion = menu();
        }
        System.out.println("Fin de la ejecucion de la aplicacion.");
    }

    /**
     * Metodo que muestra el menu
     *
     * @return la opcion elegida por el usuario
     */
    public static int menu() {
        int opcion;
        System.out.println("Gestión de LaLiga");
        System.out.println("-------------------------");
        System.out.println("1. Guardar los datos de la liga en un fichero binario.");
        System.out.println("2. Recuperar los datos de la liga de un fichero binario.");
        System.out.println("3. Mostrar clasificación:Mostrará los equipos ordenados por puntos");
        System.out.println("4. Cargar equipos desde un fichero de texto");
        System.out.println("5. Cargar jornada desde un fichero e texto");
        System.out.println("6. Procesar jornada");
        System.out.println("7. Ver los resultados de los partidos de la jornada actual");
        System.out.println("8. Reiniciar la liga:mantiene los equipos y los pone todos los datos a cero");
        System.out.println("0. Salir");
        opcion = Entrada.leerEntero("\nOpcion?: ");
        return opcion;
    }

    

}
