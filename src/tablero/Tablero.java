package src.tablero;

import src.ficha.Ficha;
public class Tablero {
    private Casilla[][] casillas = new Casilla[8][8];
    private Color color = new Color();

    public void llenarTablero(int inicio, int fila, int columna){
        int restoI=0;
        int restoJ=0;
        if(fila==3){
            iteracionAsignacion(inicio, fila, columna, true, restoI, restoJ);
        }
        else if(fila==8){
            iteracionAsignacion(inicio, fila, columna, false, restoI, restoJ);
        } 
        else if(fila==5){
            for(int i=inicio; i<fila; i++){
                restoI = i%2;
                for(int j=0; j<8; j++){
                    restoJ = j%2;
                    if(restoI==0){
                        if(restoJ==0){
                            casillas[i][j] = new Casilla(true, false);
                        }
                        else if(restoJ!=0){
                            casillas[i][j] = new Casilla(true, true);
                        }
                    }
                    else if(restoI!=0){
                        if(restoJ==0){
                            casillas[i][j] = new Casilla(true, true);
                        }
                        else if(restoJ!=0){
                            casillas[i][j] = new Casilla(true, false);
                        }
                    }
                }
            }
        }
    }

    public void iteracionAsignacion(int inicio, int fila, int columna, boolean ficha, int restoI, int restoJ){
        for(int i=inicio; i<fila; i++){
            restoI = i%2;
            for(int j=0; j<8; j++){
                restoJ = j%2;
                if(restoI==0){
                    if(restoJ==0){
                        casillas[i][j] = new Casilla(new Ficha(ficha), false);
                    }
                    else if(restoJ!=0){
                        casillas[i][j] = new Casilla(true);
                    }
                }
                else if(restoI!=0){
                    if(restoJ==0){
                        casillas[i][j] = new Casilla(true);
                    }
                    else if(restoJ!=0){
                        casillas[i][j] = new Casilla(new Ficha(ficha), false);
                    }
                }
            }
        }
    }

    public void imprimirTablero(int inicio, int fila, int columna){
        for(int i=inicio; i<fila; i++){
            for(int j=0; j<columna; j++){
                if(this.casillas[i][j].getFicha()!=null && this.casillas[i][j].getFicha().isRojo()==true){
                    if(j==(columna-1)){
                        System.out.println(color.getRojo()+casillas[i][j]+color.getResetColor());
                    }
                    else{
                        System.out.print(color.getRojo()+casillas[i][j]+color.getResetColor()+" ");
                    }
                }
                else if(this.casillas[i][j].getFicha()!=null && this.casillas[i][j].getFicha().isBlanca()==true){
                    if(j==(columna-1)){
                        System.out.println(this.casillas[i][j]);
                    }
                    else{
                        System.out.print(this.casillas[i][j]+" ");
                    }
                }
                else{
                    if(j==(columna-1)){
                        System.out.println(this.casillas[i][j]);
                    }
                    else{
                        System.out.print(this.casillas[i][j]+" ");
                    }
                }
            }
        }    
    }
}
