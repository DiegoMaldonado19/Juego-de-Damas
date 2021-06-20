package src.usuario;
/**
 * Clase que contiene los atributos del usuario
 */
public class Usuario{
    /**
     * Variables privadas donde guardamos los atributos que deberia tener un usuario
     */
    private int id;
    private String nombre;
    private String nickname;
    private int puntuacion;
    private int partidasGanadas;
    private int partidasPerdidas;
    private boolean tieneFichasRojas;
    private boolean tieneFichasBlancas;

    /**
     * Constructor por defecto, el cual pide como parametros un id y un nombre
     * @param id , parametro que le asigna un id a nuestro usuario
     * @param nombre , parametro que le asigna un nombre a nuestro usuario
     */
    public Usuario(int id, String nombre, String nickname){
        this.id = id;
        this.nombre = nombre;
        this.nickname = nickname;
        this.puntuacion = 0;
        this.partidasGanadas = 0;
        this.partidasPerdidas = 0;
        this.tieneFichasBlancas = false;
        this.tieneFichasRojas = false;
    }

    /**
     * Metodo que settea la puntuacion del usuario
     * @param puntuacion
     */
    public void setPuntuacion(int puntuacion){
        this.puntuacion = puntuacion;
    }

    /**
     * Metodo que retorna la puntuacion del usuario
     * @return
     */
    public int getPuntuacion(){
        return puntuacion;
    }

    /**
     * Metodo que settea la cantidad de partidas ganadas
     * @param partidasGanadas
     */
    public void setPartidasGanadas(int partidasGanadas){
        this.partidasGanadas = partidasGanadas;
    }

    /**
     * Metodo que retorna la cantidad de partidas ganadas por un usuario
     * @return
     */
    public int getPartidasGanadas(){
        return partidasGanadas;
    }
    
    /**
     * Metodo que settea la cantidad de partidas perdidas por un usuario
     * @param partidasPerdidas
     */
    public void setPartidasPerdidas(int partidasPerdidas){
        this.partidasPerdidas = partidasPerdidas;
    }

    /**
     * Metodo que retorna la cantidad de partidas perdidas
     * @return
     */
    public int getPartidasPerdidas(){
        return partidasPerdidas;
    }

    /**
     * Metodo para obtener el nombre del usuario
     * @return
     */
    public String getNombre(){
        return nombre;
    }

    /**
     * Metodo para obtener el id del usuario
     * @return
     */
    public int getId(){
        return id;
    }

    /**
     * Metodo que retorna el nickname del usuario
     * @return
     */
    public String getNickname(){
        return nickname;
    }

    /**
     * Metodo getter para saber si le tocaron las fichas rojas al jugador
     * @return
     */
    public boolean tieneFichasRojas(){
        return tieneFichasRojas;
    }

    /**
     * Metodo getter para saber si le tocaron las fichas blancas al jugador
     * @return
     */
    public boolean tieneFichasBlancas(){
        return tieneFichasBlancas;
    }

    /**
     * Metodo setter para asignar un tipo de ficha al usuario
     * @param fichasRojas
     */
    public void setFichasRojas(boolean fichasRojas){
        this.tieneFichasRojas = fichasRojas;
    }
    
    /**
     * Metodo setter para asignar un tipo de ficha al usuario
     * @param fichasBlancas
     */
    public void setFichasBlancas(boolean fichasBlancas){
        this.tieneFichasBlancas = fichasBlancas;
    }

    /**
     * Metodo para mostrar informacion puntual del usuario
     * @return
     */
    public String mostrarInformacion(){
        return "Id: "+this.id+ ", nombre del usuario: "+this.nombre+", nickname: "+this.nickname;
    }

}