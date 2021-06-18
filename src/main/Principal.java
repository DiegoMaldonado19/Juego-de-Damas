package src.main;
import src.tablero.*;
public class Principal {
    public static void main(String[] args){
        Principal principal = new Principal();
    }

    public Principal(){
        mostrarTablero();
    }

    public void mostrarTablero(){
        Tablero mesaDeJuego = new Tablero();
        mesaDeJuego.llenarTablero();
        mesaDeJuego.imprimirTablero();
    }

    
}
