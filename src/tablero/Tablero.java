package src.tablero;

public class Tablero {
    private char fichaBlanca = 'O';
    private char fichaNegra = 'Ø';
    private char cuadradoBlanco = '═';  
    private char[][] matrizTablero = new char[8][8];

    public void llenarTablero(){
        int restoI=0;
        int restoJ=0;
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
