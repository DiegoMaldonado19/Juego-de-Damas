package src.ficha;
/**
 * Clase Ficha
 */
public class Ficha {
    /**
     * Atributos para la clase ficha, como su forma y color
     */
    private String forma;
    private boolean colorRojo = false;
    private boolean colorBlanco = false;

    /**
     * Constructor para crear fichas
     * @param colorRojo
     */
    public Ficha(boolean colorRojo){
        this.forma = "O";
        if(colorRojo==true){
            this.colorRojo=true;
        }
        else if(colorRojo==false){
            this.colorBlanco=true;
        }
    }

    /**
     * Metodo getter para obtener la forma de la ficha
     * @return
     */
    public String getForma(){
        return forma;
    }

    /**
     * Metodo getter para saber si la ficha es roja
     * @return
     */
    public boolean isRojo(){
        return colorRojo;
    }

    /**
     * Metodo getter para saber si la ficha es blanca
     * @return
     */
    public boolean isBlanca(){
        return colorBlanco;
    }

}
