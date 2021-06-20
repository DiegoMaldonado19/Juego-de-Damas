package src.juego;
import src.usuario.*;
import src.main.*;
import src.tablero.*;
/**
 * Clase Juego
 */
public class Juego {
    /**
     * Metodo para iniciar el juego, empezando por el juego de piedra, papel o tijera
     * @param tablaUsuarios , arreglo que contiene a todos los usuarios del sistema
     * @param mesaDeJuego , arreglo que contiene el tablero
     */
    public void inicioJuego(VectorUsuarios tablaUsuarios, Tablero mesaDeJuego){
        boolean existeGanador = false;
        int idJugador1, idJugador2, aleatorio, aleatorio2;
        String armaJugador1="", armaJugador2="";

        tablaUsuarios.mostrarUsuario();
        idJugador1 = IngresoDatos.getEntero("Elige al jugador 1: ", true);
        idJugador2 = IngresoDatos.getEntero("Elige al jugador 2: ", true);

        do{
            aleatorio = (int)(Math.random()*3+1);
            aleatorio2 = (int)(Math.random()*3+1);
            if(aleatorio==3){
                armaJugador1 = "Piedra";
            }
            if(aleatorio==2){
                armaJugador1  = "Papel";
            }
            if(aleatorio==1){
                armaJugador1  = "Tijera";
            }
            if(aleatorio2==3){
                armaJugador2 = "Piedra";
            }
            if(aleatorio2==2){
                armaJugador2 = "Papel";
            }
            if(aleatorio2==1){
                armaJugador2 = "Tijera";
            }
            System.out.println(tablaUsuarios.getUsuarios()[idJugador1-1].getNickname());
            System.out.println("Tiene "+armaJugador1);
            System.out.println("\n");
            System.out.println(tablaUsuarios.getUsuarios()[idJugador2-1].getNickname());
            System.out.println("Tiene "+armaJugador2);
            System.out.println("\n");
            if(armaJugador1.equals(armaJugador2)){
                System.out.println("\n");
                System.out.println("Empate...");
                existeGanador=false;
            }
            if(aleatorio==3 && aleatorio2==1){
                System.out.println("\n");
                System.out.println(tablaUsuarios.getUsuarios()[idJugador1-1].getNickname()+" jugará rojas");
                tablaUsuarios.getUsuarios()[idJugador1-1].setFichasRojas(true);
                existeGanador=true;
            }
            if(aleatorio==3 && aleatorio2==2){
                System.out.println("\n");
                System.out.println(tablaUsuarios.getUsuarios()[idJugador2-1].getNickname()+" jugará rojas");
                tablaUsuarios.getUsuarios()[idJugador2-1].setFichasRojas(true);
                existeGanador=true;
            }
            if(aleatorio==2 && aleatorio2==3){
                System.out.println("\n");
                System.out.println(tablaUsuarios.getUsuarios()[idJugador1-1].getNickname()+" jugará rojas");
                tablaUsuarios.getUsuarios()[idJugador1-1].setFichasRojas(true);
                existeGanador=true;
            }
            if(aleatorio==2 && aleatorio2==1){
                System.out.println("\n");
                System.out.println(tablaUsuarios.getUsuarios()[idJugador2-1].getNickname()+" jugará rojas");
                tablaUsuarios.getUsuarios()[idJugador2-1].setFichasRojas(true);
                existeGanador=true;
            }
            if(aleatorio==1 && aleatorio2==3){
                System.out.println("\n");
                System.out.println(tablaUsuarios.getUsuarios()[idJugador2-1].getNickname()+" jugará rojas");
                tablaUsuarios.getUsuarios()[idJugador2-1].setFichasRojas(true);
                existeGanador=true;
            }
            if(aleatorio==1 && aleatorio2==2){
                System.out.println("\n");
                System.out.println(tablaUsuarios.getUsuarios()[idJugador1-1].getNickname()+" jugará rojas");
                tablaUsuarios.getUsuarios()[idJugador1-1].setFichasRojas(true);
                existeGanador=true;
            }
        }
        while(existeGanador==false);
        System.out.println("\n\n");
        mesaDeJuego.llenarTablero(0, 3, 8);
        mesaDeJuego.llenarTablero(3, 5, 8);
        mesaDeJuego.llenarTablero(5, 8, 8);
        mesaDeJuego.imprimirTablero(0, 8, 8);
    }
}
