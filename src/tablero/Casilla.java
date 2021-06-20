package src.tablero;
import src.ficha.Ficha;
/**
 * Clase Casilla
 */
public class Casilla {
    /**
     * Atributos de la clase casilla, debe tener una ficha y variables booleanas
     * Para saber si está vacia o es una casillaBlanca
     */
    private Ficha ficha;
    private boolean vacia;
    private boolean casillaBlanca;

    /**
     * Constructor por defecto para crear una casilla con una ficha dentro
     * @param ficha
     * @param vacia
     */
    public Casilla(Ficha ficha, boolean vacia){
        if(vacia == false){
            this.ficha = ficha;
            this.vacia = false;
            this.casillaBlanca = false;
        }
        else if(vacia == true){
            this.vacia = true;
            this.casillaBlanca = false;
        }
    }

    /**
     * Constructor que recibe como unico parametro si esta vacia la casilla y deja nulo el atributo de ficha
     * @param vacia
     */
    public Casilla(boolean vacia){
        this.vacia = vacia;
        this.casillaBlanca = true;
    }

    /**
     * Constructor que deja como nulo el atributo de ficha y asigna un valor booleano para la casilla blanca
     * @param vacia
     * @param casillaBlanca
     */
    public Casilla(boolean vacia, boolean casillaBlanca){
        this.vacia = vacia;
        this.casillaBlanca = casillaBlanca;
    }

    /**
     * Metodo getter para saber si está vacia la casilla
     * @return
     */
    public boolean isVacia(){
        return vacia;
    }

    /**
     * Metodo getter para obtener la ficha en una determinadad casilla
     * @return
     */
    public Ficha getFicha(){
        return ficha;
    }

    /**
     * Metodo setter para asignar una ficha a una determinada casilla
     * @param ficha
     */
    public void setFicha(Ficha ficha){
        this.ficha = ficha;
    }

    /**
     * Metodo para poder imprimir en consola la forma de nuestro tablero
     */
    @Override
    public String toString() {
        /**
         * Si la casilla esta vacia, y si la casilla es blanca retorna un caracter a su posicion, si no, retorna un espacio en blanco
         */
        if(vacia == true){
            if(casillaBlanca==true){
                return "■";
            }
            else if(casillaBlanca==false){
                return " ";
            }   
            
        }
        /**
         * Si la casilla no esta vacia retorna la forma de la ficha
         */
        else if(vacia==false){
            return this.ficha.getForma();
        }
        return "";
    }
}
