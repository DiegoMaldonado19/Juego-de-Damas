package src.ficha;

public class Ficha {
    
    private String forma;
    private boolean colorRojo = false;
    private boolean colorBlanco = false;

    public Ficha(boolean colorRojo){
        this.forma = "O";
        if(colorRojo==true){
            this.colorRojo=true;
        }
        else if(colorRojo==false){
            this.colorBlanco=true;
        }
    }

    public String getForma(){
        return forma;
    }

    public boolean isRojo(){
        return colorRojo;
    }

    public boolean isBlanca(){
        return colorBlanco;
    }

}
