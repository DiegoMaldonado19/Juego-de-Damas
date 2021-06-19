package src.tablero;
import src.ficha.Ficha;
public class Casilla {
    private Ficha ficha;
    private boolean vacia;
    private boolean casillaBlanca;

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

    public Casilla(boolean vacia){
        this.vacia = vacia;
        this.casillaBlanca = true;
    }

    public Casilla(boolean vacia, boolean casillaBlanca){
        this.vacia = vacia;
        this.casillaBlanca = casillaBlanca;
    }

    public boolean isVacia(){
        return vacia;
    }

    public Ficha getFicha(){
        return ficha;
    }

    @Override
    public String toString() {
        if(vacia == true){
            if(casillaBlanca==true){
                return "■";
            }
            else if(casillaBlanca==false){
                return " ";
            }   
            
        }
        else if(vacia==false){
            return this.ficha.getForma();
        }
        return "";
    }
}
