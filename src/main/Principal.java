package src.main;
import src.tablero.*;
import src.usuario.VectorUsuarios;
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
     * Instanciamos un objeto de la clase vector usuarios y uno de la clase tablero
     */
    VectorUsuarios tablaUsuarios = new VectorUsuarios();

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
         * Mensaje de bienvenida
         */
        System.out.println("Bienvenido al juego de Damas");
        System.out.println("\n\n");

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
                    jugar();
                break;
    
                case 4:
                    tablaUsuarios.mostrarPuntuaciones();
                break;
    
                case 5:
                    System.out.println("\n");
                    System.out.println("Estás saliendo...");
                break;
    
                default:
                    System.out.println("\n");
                    System.out.println("Ingresa una opcion valida");
                break;
            }
        }while(opcion!=5);
       
    }
    /**
     * Metodo mostrar tablero el cual imprime en pantalla el tablero e inicia el juego
     */
    public void jugar(){
        Tablero mesaDeJuego = new Tablero();
        mesaDeJuego.llenarTablero(0, 3, 8);
        mesaDeJuego.llenarTablero(3, 5, 8);
        mesaDeJuego.llenarTablero(5, 8, 8);
        mesaDeJuego.imprimirTablero(0, 8, 8);
    }

}
