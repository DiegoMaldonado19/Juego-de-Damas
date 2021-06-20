package src.tablero;
import src.ficha.Ficha;
/**
 * Clase Tablero
 */
public class Tablero {
    /**
     * Areglo de casillas para poder construir el tablero
     * E instanciamos un objeto de la clase color para pintar nuestras fichas
     */
    private Casilla[][] casillas = new Casilla[8][8];
    private Color color = new Color();

    /**
     * Metodo para llenar nuestra matriz de casillas con fichas 
     * @param inicio , indicamos el inicio de las iteraciones
     * @param fila , indicamos hasta que fila se efectuaran las iteraciones
     * @param columna , indicamos hasta que columna se efectuaran las iteraciones
     */
    public void llenarTablero(int inicio, int fila, int columna){
        /**
         * Variables enteras para saber si nos encontramos ante una fila par o impar
         */
        int restoI=0;
        int restoJ=0;

        /**
         * Llamamos al metodo asinacion fichas rojas a la matriz de casillas
         */
        if(fila==3){
            asignacionFichas(inicio, fila, columna, true, restoI, restoJ);
        }
        /**
         * Efectuamos una iteracion para asignar los espacios del medio del tablero
         */
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
        /**
         * Llamamos al metodo asignacion fichas para asignar las fichas blancas al sistema
         */
        else if(fila==8){
            asignacionFichas(inicio, fila, columna, false, restoI, restoJ);
        } 
    }

    /**
     * Metodo asignacion fichas
     * @param inicio , indicamos el inicio de la iteracion
     * @param fila , indicamos la fila hasta donde queremos iterar
     * @param columna , indicamos la columna hasta donde llegara la iteracion
     * @param ficha , indicamos si la ficha será roja o blanca
     * @param restoI , indicamos el resto de cada fila
     * @param restoJ , indicamos el resto de cada columna
     */
    public void asignacionFichas(int inicio, int fila, int columna, boolean ficha, int restoI, int restoJ){
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

    /**
     * Metodo para imprimir el tablero de juego con todas las fichas en la matriz de casillas
     * @param inicio , indicamos el inicio de la iteracion
     * @param fila , indicamos hasta que fila realizaremos la iteracion
     * @param columna , indicamos hasta que columna realizaremos la iteracion
     */
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
