package src.tablero;
/**
 * Clase tablero, la cual sirve para generar el tablero en consola
 */
public class Tablero {
    /**
     * Atributos de la clase donde tenemos las fichas y la matriz de tablero
     */
    private char fichaBlanca = 'O';
    private char fichaNegra = 'Ø';
    private char cuadradoBlanco = '═';  
    private char[][] matrizTablero = new char[8][8];

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
     * Metodo para imprimir el arreglo de tablero
     */
    public void imprimirTablero(){
        for(int i=0; i<8; i++){
            for(int j=0; j<8; j++){
                if(j==(7)){
                    System.out.println(this.matrizTablero[i][j]);
                }
                else{
                    System.out.print(this.matrizTablero[i][j]+" ");
                }
            }
        }
    }
}
