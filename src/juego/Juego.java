package src.juego;
import src.usuario.*;
import src.main.*;
import src.tablero.*;
/**
 * Clase Juego
 */
public class Juego {
    int idJugadorPartida1=0, idJugadorPartida2=0;
    /**
     * Metodo para iniciar el juego, empezando por el juego de piedra, papel o tijera
     * @param tablaUsuarios , arreglo que contiene a todos los usuarios del sistema
     * @param mesaDeJuego , arreglo que contiene el tablero
     */
    public void piedraPapelTijeras(VectorUsuarios tablaUsuarios){
        boolean existeGanador = false;
        int idJugador1, idJugador2, aleatorio=0, aleatorio2=0;
        String armaJugador1="", armaJugador2="";

        tablaUsuarios.mostrarUsuario();
        idJugador1 = IngresoDatos.getEntero("Elige al jugador 1: ", true);
        idJugador2 = IngresoDatos.getEntero("Elige al jugador 2: ", true);

        do{
            aleatorio = (int)(Math.random()*3+1);
            aleatorio2 = (int)(Math.random()*3+1);
            if(aleatorio==3){
                armaJugador1 = "Piedra";
            }
            if(aleatorio==2){
                armaJugador1  = "Papel";
            }
            if(aleatorio==1){
                armaJugador1  = "Tijera";
            }
            if(aleatorio2==3){
                armaJugador2 = "Piedra";
            }
            if(aleatorio2==2){
                armaJugador2 = "Papel";
            }
            if(aleatorio2==1){
                armaJugador2 = "Tijera";
            }
            System.out.println("\n");
            System.out.println(tablaUsuarios.getUsuarios()[idJugador1-1].getNickname());
            System.out.println("Tiene "+armaJugador1);
            System.out.println("\n");
            System.out.println(tablaUsuarios.getUsuarios()[idJugador2-1].getNickname());
            System.out.println("Tiene "+armaJugador2);
            System.out.println("\n");
            if(armaJugador1.equals(armaJugador2)){
                System.out.println("\n");
                System.out.println("Empate...");
                existeGanador=false;
            }
            if(aleatorio==3 && aleatorio2==1){
                System.out.println("\n");
                System.out.println(tablaUsuarios.getUsuarios()[idJugador1-1].getNickname()+" jugará rojas");
                tablaUsuarios.getUsuarios()[idJugador1-1].setFichasRojas(true);
                tablaUsuarios.getUsuarios()[idJugador2-1].setFichasBlancas(true);
                existeGanador=true;
            }
            if(aleatorio==3 && aleatorio2==2){
                System.out.println("\n");
                System.out.println(tablaUsuarios.getUsuarios()[idJugador2-1].getNickname()+" jugará rojas");
                tablaUsuarios.getUsuarios()[idJugador2-1].setFichasRojas(true);
                tablaUsuarios.getUsuarios()[idJugador1-1].setFichasBlancas(true);
                existeGanador=true;
            }
            if(aleatorio==2 && aleatorio2==3){
                System.out.println("\n");
                System.out.println(tablaUsuarios.getUsuarios()[idJugador1-1].getNickname()+" jugará rojas");
                tablaUsuarios.getUsuarios()[idJugador1-1].setFichasRojas(true);
                tablaUsuarios.getUsuarios()[idJugador2-1].setFichasBlancas(true);
                existeGanador=true;
            }
            if(aleatorio==2 && aleatorio2==1){
                System.out.println("\n");
                System.out.println(tablaUsuarios.getUsuarios()[idJugador2-1].getNickname()+" jugará rojas");
                tablaUsuarios.getUsuarios()[idJugador2-1].setFichasRojas(true);
                tablaUsuarios.getUsuarios()[idJugador1-1].setFichasBlancas(true);
                existeGanador=true;
            }
            if(aleatorio==1 && aleatorio2==3){
                System.out.println("\n");
                System.out.println(tablaUsuarios.getUsuarios()[idJugador2-1].getNickname()+" jugará rojas");
                tablaUsuarios.getUsuarios()[idJugador2-1].setFichasRojas(true);
                tablaUsuarios.getUsuarios()[idJugador1-1].setFichasBlancas(true);
                existeGanador=true;
            }
            if(aleatorio==1 && aleatorio2==2){
                System.out.println("\n");
                System.out.println(tablaUsuarios.getUsuarios()[idJugador1-1].getNickname()+" jugará rojas");
                tablaUsuarios.getUsuarios()[idJugador1-1].setFichasRojas(true);
                tablaUsuarios.getUsuarios()[idJugador2-1].setFichasBlancas(true);
                existeGanador=true;
            }
        }
        while(existeGanador==false);
        System.out.println("\n\n");
        this.idJugadorPartida1 = idJugador1;
        this.idJugadorPartida2 = idJugador2;
        
    }

    /**
     * Metodo para imprimir la mesa de Juego
     * @param mesaDeJuego
     */
    public void tableroDeJuego(Tablero mesaDeJuego){
        System.out.println("\n");
        mesaDeJuego.llenarTablero(0, 3, 8);
        mesaDeJuego.llenarTablero(3, 5, 8);
        mesaDeJuego.llenarTablero(5, 8, 8);
        mesaDeJuego.imprimirTablero(0, 8, 8);
    }

    /**
     * Metodo para mostrar los tiros disponibles al usuario, dependiendo si juega fichas blancas o rojas
     * @param mesaDeJuego
     */
    public void mostrarTiroDisponible(Tablero mesaDeJuego, VectorUsuarios tablaUsuarios, int filaInicio, int filaFinal, boolean turnoJugador1){
        int restoI=0;
        int restoJ=0;
        if(turnoJugador1==true){
            for(int i=filaInicio; i<filaFinal; i++){
                for(int j=0; j<8; j++){
                    restoI = i%2;
                    restoJ = j%2;
                    if(restoI==0){
                        if(tablaUsuarios.getUsuarios()[this.idJugadorPartida1-1].tieneFichasRojas()==true){
                            if(restoJ==0){
                                if(mesaDeJuego.getCasillas()[i][j].isVacia()==true){
                                    if(j==7){
                                        System.out.println("Tiro Disponbile en la posicion ("+i+","+j+")"+" para la ficha: ("+(i-1)+","+(j-1)+")");
                                    }
                                    else{
                                        System.out.println("Tiro Disponbile en la posicion ("+i+","+j+")"+" para la ficha: ("+(i-1)+","+(j-1)+")"
                                    +" y la ficha: ("+(i-1)+","+(j+1)+")");
                                    }
                                }
                            }
                        }
                        else if(tablaUsuarios.getUsuarios()[this.idJugadorPartida2-1].tieneFichasRojas()==true){
                            if(restoJ==0){
                                if(mesaDeJuego.getCasillas()[i][j].isVacia()==true){
                                    if(j==7){
                                        System.out.println("Tiro Disponbile en la posicion ("+i+","+j+")"+" para la ficha: ("+(i-1)+","+(j-1)+")");
                                    }
                                    else{
                                        System.out.println("Tiro Disponbile en la posicion ("+i+","+j+")"+" para la ficha: ("+(i-1)+","+(j-1)+")"
                                    +" y la ficha: ("+(i-1)+","+(j+1)+")");
                                    }
                                }
                            }
                        }
                    }
                    else if(restoI!=0){
                        if(tablaUsuarios.getUsuarios()[this.idJugadorPartida1-1].tieneFichasRojas()==true){
                            if(restoJ!=0){
                                if(mesaDeJuego.getCasillas()[i][j].isVacia()==true){
                                    if(j==7){
                                        System.out.println("Tiro Disponbile en la posicion ("+i+","+j+")"+" para la ficha: ("+(i-1)+","+(j-1)+")");
                                    }
                                    else{
                                        System.out.println("Tiro Disponbile en la posicion ("+i+","+j+")"+" para la ficha: ("+(i-1)+","+(j-1)+")"
                                    +" y la ficha: ("+(i-1)+","+(j+1)+")");
                                    }
                                }
                            }
                        }
                        else if(tablaUsuarios.getUsuarios()[this.idJugadorPartida2-1].tieneFichasRojas()==true){
                            if(restoJ!=0){
                                if(mesaDeJuego.getCasillas()[i][j].isVacia()==true){
                                    if(j==7){
                                        System.out.println("Tiro Disponbile en la posicion ("+i+","+j+")"+" para la ficha: ("+(i-1)+","+(j-1)+")");
                                    }
                                    else{
                                        System.out.println("Tiro Disponbile en la posicion ("+i+","+j+")"+" para la ficha: ("+(i-1)+","+(j-1)+")"
                                    +" y la ficha: ("+(i-1)+","+(j+1)+")");
                                    }
                                }
                            }
                        }
                        
                    }  
                }
            }
        }
        else if(turnoJugador1==false){
            for(int i=filaFinal; i>filaInicio; i--){
                for(int j=0; j<8; j++){
                    restoI = i%2;
                    restoJ = j%2;
                    if(restoI==0){
                        if(tablaUsuarios.getUsuarios()[this.idJugadorPartida1-1].tieneFichasBlancas()==true){
                            if(restoJ==0){
                                if(mesaDeJuego.getCasillas()[i][j].isVacia()==true){
                                    if(j==0){
                                        System.out.println("Tiro Disponbile en la posicion ("+i+","+j+")"+" para la ficha: ("+(i+1)+","+(j+1)+")");
                                    }
                                    else{
                                        System.out.println("Tiro Disponbile en la posicion ("+i+","+j+")"+" para la ficha: ("+(i+1)+","+(j-1)+")"
                                    +" y la ficha: ("+(i+1)+","+(j+1)+")");
                                    }
                                }
                            }
                        }
                        else if(tablaUsuarios.getUsuarios()[this.idJugadorPartida2-1].tieneFichasBlancas()==true){
                            if(restoJ==0){
                                if(mesaDeJuego.getCasillas()[i][j].isVacia()==true){
                                    if(j==0){
                                        System.out.println("Tiro Disponbile en la posicion ("+i+","+j+")"+" para la ficha: ("+(i+1)+","+(j-1)+")");
                                    }
                                    else{
                                        System.out.println("Tiro Disponbile en la posicion ("+i+","+j+")"+" para la ficha: ("+(i+1)+","+(j-1)+")"
                                    +" y la ficha: ("+(i+1)+","+(j+1)+")");
                                    }
                                }
                            }
                        }
                    }
                    else if(restoJ!=0){
                        if(tablaUsuarios.getUsuarios()[this.idJugadorPartida1-1].tieneFichasBlancas()==true){
                            if(restoJ!=0){
                                if(mesaDeJuego.getCasillas()[i][j].isVacia()==true){
                                    if(j==0){
                                        System.out.println("Tiro Disponbile en la posicion ("+i+","+j+")"+" para la ficha: ("+(i+1)+","+(j-1)+")");
                                    }
                                    else{
                                        System.out.println("Tiro Disponbile en la posicion ("+i+","+j+")"+" para la ficha: ("+(i+1)+","+(j-1)+")"
                                    +" y la ficha: ("+(i+1)+","+(j+1)+")");
                                    }
                                }
                            }
                        }
                        else if(tablaUsuarios.getUsuarios()[this.idJugadorPartida2-1].tieneFichasBlancas()==true){
                            if(restoJ!=0){
                                if(mesaDeJuego.getCasillas()[i][j].isVacia()==true){
                                    if(j==0){
                                        System.out.println("Tiro Disponbile en la posicion ("+i+","+j+")"+" para la ficha: ("+(i+1)+","+(j-1)+")");
                                    }
                                    else{
                                        System.out.println("Tiro Disponbile en la posicion ("+i+","+j+")"+" para la ficha: ("+(i+1)+","+(j-1)+")"
                                    +" y la ficha: ("+(i+1)+","+(j+1)+")");
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    /**
     * Metodo para iniciar partida y continuar con el juego
     * @param mesaDeJuego
     * @param tablaUsuarios
     */
    public void inicioPartida(VectorUsuarios tablaUsuarios){
        System.out.println("\n\n");
        System.out.println("Partida Normal");
        System.out.println("-----------------------------");
        System.out.println(tablaUsuarios.getUsuarios()[this.idJugadorPartida1-1].getNickname()+" vs "+ 
        tablaUsuarios.getUsuarios()[this.idJugadorPartida2-1].getNickname());
        if(tablaUsuarios.getUsuarios()[idJugadorPartida1-1].tieneFichasRojas()==false){
            System.out.println("\n");
            System.out.println(tablaUsuarios.getUsuarios()[this.idJugadorPartida1-1].getNickname()+" jugará blancas");
        }
        if(tablaUsuarios.getUsuarios()[idJugadorPartida1-1].tieneFichasRojas()==true){
            System.out.println("\n");
            System.out.println(tablaUsuarios.getUsuarios()[this.idJugadorPartida1-1].getNickname()+" jugará rojas");
        }
        if(tablaUsuarios.getUsuarios()[idJugadorPartida2-1].tieneFichasRojas()==false){
            System.out.println("\n");
            System.out.println(tablaUsuarios.getUsuarios()[this.idJugadorPartida2-1].getNickname()+" jugará blancas");
        }
        if(tablaUsuarios.getUsuarios()[idJugadorPartida2-1].tieneFichasRojas()==true){
            System.out.println("\n");
            System.out.println(tablaUsuarios.getUsuarios()[this.idJugadorPartida2-1].getNickname()+" jugará rojas");
        }
    }

    /**
     * Metodo para partida normal
     * @param mesaDeJuego , tablero de juego
     * @param tablaUsuarios , vector que contiene a los usuarios
     */
    public void partidaNormal(Tablero mesaDeJuego, VectorUsuarios tablaUsuarios){
        int tiroXJugador1=0, tiroYJugador1=0;
        int fichaXJugador1=0, fichaYJugador1=0;
        int tiroXJugador2=0, tiroYJugador2=0;
        int fichaXJugador2=0, fichaYJugador2=0;
        inicioPartida(tablaUsuarios);
        tableroDeJuego(mesaDeJuego);
        System.out.println("\n\n");
        mostrarTiroDisponible(mesaDeJuego, tablaUsuarios, 3, 4, true);
        fichaXJugador1 = IngresoDatos.getEntero("Ingresa la coordenada en x de la ficha a mover, (x,y): ", true);
        fichaYJugador1 = IngresoDatos.getEntero("Ingresa la coordenada en y de la ficha a mover, (x,y): ", true);
        tiroXJugador1 = IngresoDatos.getEntero("Ingresa la coordenada en X del movimiento, (x,y): ", true);
        tiroYJugador1 = IngresoDatos.getEntero("Ingresa la coordenada en Y del movimiento, (x,y): ", true);
        System.out.println("\n\n");
        moverFicha(fichaXJugador1, fichaYJugador1, mesaDeJuego, tiroXJugador1, tiroYJugador1);
        mesaDeJuego.imprimirTablero(0, 8, 8);
        System.out.println("\n\n");
        mostrarTiroDisponible(mesaDeJuego, tablaUsuarios, 3, 4, false);
        fichaXJugador2 = IngresoDatos.getEntero("Ingresa la coordenada en x de la ficha a mover, (x,y): ", true);
        fichaYJugador2 = IngresoDatos.getEntero("Ingresa la coordenada en y de la ficha a mover, (x,y): ", true);
        tiroXJugador2 = IngresoDatos.getEntero("Ingresa la coordenada en X del movimiento, (x,y): ", true);
        tiroYJugador2 = IngresoDatos.getEntero("Ingresa la coordenada en Y del movimiento, (x,y): ", true);
        System.out.println("\n\n");
        moverFicha(fichaXJugador2, fichaYJugador2, mesaDeJuego, tiroXJugador2, tiroYJugador2);
        mesaDeJuego.imprimirTablero(0, 8, 8);
    }

    /**
     * Metodo para mover ficha
     * @param posx , posicion original de la ficha en x
     * @param posy , posicion original de la ficha en y
     * @param mesaDeJuego , tablero de juego
     * @param tiroX , posicion nueva para la ficha en x
     * @param tiroY , posiicon nueva para la ficha en y
     */
    public void moverFicha(int posx, int posy, Tablero mesaDeJuego, int tiroX, int tiroY){
        mesaDeJuego.getCasillas()[tiroX][tiroY].setFicha(mesaDeJuego.getCasillas()[posx][posy].getFicha());
        mesaDeJuego.getCasillas()[tiroX][tiroY].setVacia(false); 
        mesaDeJuego.getCasillas()[posx][posy].setVacia(true); 
    }
}
