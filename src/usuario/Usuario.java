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
     * Metodo para mostrar informacion puntual del usuario
     * @return
     */
    public String mostrarInformacion(){
        return "Id: "+this.id+ " nombre del usuario: "+this.nombre;
    }

}