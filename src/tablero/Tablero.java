package src.tablero;
/**
 * Clase tablero, la cual sirve para generar el tablero en consola
 */
public class Tablero {
    /**
     * Atributos de la clase donde tenemos las fichas y la matriz de tablero
     */
    private char fichaBlanca = 'O';
    private char fichaNegra = 'O';
    private char cuadradoBlanco = '=';  
    private char[][] matrizTablero = new char[8][8];
    private Color color = new Color();

    /**
     * Metodo para llenar de datos la matriz del tablero
     */
    public void llenarTablero(){
        /**
         * Variables para almacenar el resto de las iteraciones, asi sabemos si son pares o impares
         */
        int restoI=0;
        int restoJ=0;

        /**
         * Ciclo para imprimir las primeras fichas en el tablero
         */
        for(int i =0; i<3; i++){
           restoI = i%2;
           for(int j=0; j<8; j++){ 
                restoJ = j%2;
                if(restoI==0){
                    if(restoJ==0){
                        this.matrizTablero[i][j] = this.cuadradoBlanco;
                    }
                    else if(restoJ!=0){
                        this.matrizTablero[i][j] = this.fichaBlanca;
                    }
                }
                else if(restoI!=0){
                    if(restoJ==0){
                        this.matrizTablero[i][j] = this.fichaBlanca;
                    }
                    else if(restoJ!=0){
                        this.matrizTablero[i][j] = this.cuadradoBlanco;
                    }
                }
            }
        }
        /**
         * Ciclo para imprimir espacios en blanco entre las fichas
         */
        for(int i=3; i<5; i++){
            restoI = i%2;
            for(int j=0; j<8; j++){
                restoJ = j%2;
                if(restoI==0){
                    if(restoJ==0){
                        this.matrizTablero[i][j] = this.cuadradoBlanco;
                    }
                    else if(restoJ!=0){
                        this.matrizTablero[i][j] = ' ';
                    }
                }
                else if(restoI!=0){
                    if(restoJ==0){
                        this.matrizTablero[i][j] = ' ';
                    }
                    else if(restoJ!=0){
                        this.matrizTablero[i][j] = this.cuadradoBlanco;
                    }
                }
            }
        }
        /**
         * Ciclo para imprimir en consola las fichas negras
         */
        for(int i=5; i<8; i++){
            restoI = i%2;
            for(int j=0; j<8; j++){ 
                restoJ = j%2;
                if(restoI==0){
                    if(restoJ==0){
                        this.matrizTablero[i][j] = this.cuadradoBlanco;
                    }
                    else if(restoJ!=0){
                        this.matrizTablero[i][j] = this.fichaNegra;
                    }
                }
                else if(restoI!=0){
                    if(restoJ==0){
                        this.matrizTablero[i][j] = this.fichaNegra;
                    }
                    else if(restoJ!=0){
                        this.matrizTablero[i][j] = this.cuadradoBlanco;
                    }
             }
            }
        }
    }

    /**
     * Metodo para imprimir tablero sin color
     * @param inicio
     * @param x
     * @param y
     */
    public void imprimirTablero(int inicio, int x, int y){
        for(int i=inicio; i<x; i++){
            for(int j=0; j<y; j++){
                if(j==(y-1)){
                    System.out.println(this.matrizTablero[i][j]);
                }
                else{
                    System.out.print(this.matrizTablero[i][j]+" ");
                }
            }
        }  
    }

    /**
     * Metodo para imprimir tablero con colores, el cual designa un color especifico a las damas
     * @param inicio
     * @param x
     * @param y
     */
    public void imprimirTableroColor(int inicio, int x, int y){
        int restoI=0;
        int restoJ=0;
        for(int i=inicio; i<x; i++){
            restoI = i%2;
            for(int j=0; j<y; j++){ 
                restoJ = j%2;
                if(j==(y-1)){
                    if(restoI==0){
                        if(restoJ==0){
                            System.out.println(color.getBlanco()+matrizTablero[i][j]+color.getResetColor());
                        }
                        else if(restoJ!=0){
                            System.out.println(color.getRojo()+matrizTablero[i][j]+color.getResetColor());
                        }
                    }
                    else if(restoI!=0){
                        if(restoJ==0){
                           System.out.println(color.getRojo()+matrizTablero[i][j]+color.getResetColor());
                        }
                        else if(restoJ!=0){
                            System.out.println(color.getBlanco()+matrizTablero[i][j]+color.getResetColor());
                        }
                    }
                }
                else{
                    if(restoI==0){
                        if(restoJ==0){
                            System.out.print(color.getBlanco()+matrizTablero[i][j]+color.getResetColor()+" ");
                        }
                        else if(restoJ!=0){
                            System.out.print(color.getRojo()+matrizTablero[i][j]+color.getResetColor()+" ");
                        }
                    }
                    else if(restoI!=0){
                        if(restoJ==0){
                            System.out.print(color.getRojo()+matrizTablero[i][j]+color.getResetColor()+" ");
                        }
                        else if(restoJ!=0){
                        System.out.print(color.getBlanco()+matrizTablero[i][j]+color.getResetColor()+" ");
                        }
                    }
                }
            }
        }
    }     
}
