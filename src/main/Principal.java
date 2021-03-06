package src.main;
import src.tablero.*;
import src.usuario.VectorUsuarios;
import src.juego.Juego;
/**
 * Clase Principal, la cual se encarga de todas las llamadas
 */
public class Principal {
    public static void main(String[] args){
        /**
         * Instanciamos un objeto de clase para evitar problemas con el ambito estatico
         */
        Principal principal = new Principal();
    }

    /**
     * Instanciamos un objeto de la clase vector usuarios y uno de la clase tablero, tambien uno de la clase juego
     */
    VectorUsuarios tablaUsuarios = new VectorUsuarios();
    Tablero mesaDeJuego = new Tablero();
    Juego juego = new Juego();

    /**
     * Constructor por defecto de la clase principal
     */
    public Principal(){
       menuPrincipal();
    }

    /**
     * Metodo menu principal, el cual hace todos los llamados a las demas clases
     */
    public void menuPrincipal(){
        /**
         * Variable entera para almacenar la opcion del usuario
         */
        int opcion=0;
        /**
         * Ciclo do para repetir el menu principal hasta que el usuario desee salir
         */
        do{
            System.out.println("\n\n");
            System.out.println("Menu Principal");
            System.out.println("--------------------------------");
            System.out.println("1) Ingresar Usuario");
            System.out.println("2) Mostrar Usuarios");
            System.out.println("3) Jugar");
            System.out.println("4) Estadisticas");
            System.out.println("5) Salir");
            opcion = IngresoDatos.getEntero("Ingresa una opcion", true);
            switch(opcion){
                case 1:
                    tablaUsuarios.agregarUsuario();
                break;
    
                case 2:
                    tablaUsuarios.mostrarUsuario();
                break;
    
                case 3:
                    jugar(tablaUsuarios);
                break;
    
                case 4:
                    menuEstadisticas();
                break;
    
                case 5:
                    System.out.println("\n");
                    System.out.println("Est??s saliendo...");
                break;
    
                default:
                    System.out.println("\n");
                    System.out.println("Ingresa una opcion valida");
                break;
            }
        }while(opcion!=5);
       
    }

    /**
     * Menu para mostrar el menu de estadisticas
     */
    public void menuEstadisticas(){
        int opcion=0;

        do{
            System.out.println("\n\n");
            System.out.println("Menu de estadisticas");
            System.out.println("------------------------------------");
            System.out.println("1) Mostrar Podio");
            System.out.println("2) Salir");
            opcion = IngresoDatos.getEntero("Elige una opcion", true);
            switch(opcion){
                case 1:
                    tablaUsuarios.asignarOrdenarPodio();
                    tablaUsuarios.mostrarPodio();
                break;

                case 2:
                    System.out.println("\n");
                    System.out.println("Estas saliendo del menu de estadisticas...");
                break;

                default:
                    System.out.println("\n");
                    System.out.println("Ingresa una opcion correcta");
                break;
            }
        }while(opcion!=2);
    }

    /**
     * Metodo para iniciar el juego
     */
    public void jugar(VectorUsuarios tablaUsuarios){
        juego.piedraPapelTijeras(tablaUsuarios);
        juego.partidaNormal(mesaDeJuego, tablaUsuarios);
    }

}
