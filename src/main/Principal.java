package src.main;
import src.tablero.*;
public class Principal {
    public static void main(String[] args){
        Principal principal = new Principal();
    }

    public Principal(){
        Tablero t = new Tablero();
        t.llenarTablero();
        t.imprimirTablero();
    }

}
