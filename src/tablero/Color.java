package src.tablero;
/**
 * Clase color, para poder generar objetos de tipo color y pintar texto en consola
 */
public class Color {
    /**
     * Colores
     */
    private String magenta = "\033[35m";
    private String rojo = "\033[31m";
    private String cyan = "\033[36m";
    private String azul = "\033[34m";
    private String amarillo = "\033[33m";
    private String blanco = "\033[37m";
    private String verde = "\033[32m";
    private String resetColor = "\u001B[0m";
    
    /**
     * Getters para cada color
     * @return
     */
    public String getMagenta(){
        return magenta;
    }

    public String  getRojo(){
        return rojo;
    }

    public String  getCyan(){
        return cyan;
    }

    public String  getAzul(){
        return azul;
    }

    public String  getAmarillo(){
        return amarillo;
    }

    public String  getBlanco(){
        return blanco;
    }

    public String  getVerde(){
        return verde;
    }

    public String  getResetColor(){
        return resetColor;
    }
}
