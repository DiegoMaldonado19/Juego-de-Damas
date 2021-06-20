package src.usuario;
import src.main.IngresoDatos;
/**
 * Clase que maneja al vector de usuarios
 */
public class VectorUsuarios {

    /**
     * Arreglo de usuarios, donde almacenaremos todos los objetos de tipo usuarios
     */
    private Usuario[] usuarios = new Usuario[50];
    private int siguienteCodigo;
    private Usuario[] podio = new Usuario[50];

    /**
     * Constructor para el vector de usuarios
     */
    public VectorUsuarios(){
        inicializarUsuarios();
        siguienteCodigo=6;
    }

    /**
     * Metodo para agregar un usuario al sistema
     * @param nombre , parametro que almacena el nombre del usuario
     * @param nickname , parametro que recibe el nickname del usuario
     */
    public void agregarUsuario(String nombre, String nickname){
        if(siguienteCodigo>50){
            System.out.println("Limite de usuarios alcanzado");
        }
        else{
            usuarios[siguienteCodigo-1] = new Usuario(siguienteCodigo, nombre, nickname);
        }
        siguienteCodigo++;
    }


    /**
     * Metodo para agregar un usuario al sistema
     */
    public void agregarUsuario(){
        String nombre = IngresoDatos.getTexto("Ingrese el nombre del usuario: ");
        String nickname = IngresoDatos.getTexto("Ingrese su nickname: ");
        agregarUsuario(nombre, nickname);
    }

    /**
     * Metodo para inicializar los usuarios por defecto en el sistema
     */
    public void inicializarUsuarios(){
        usuarios[0] = new Usuario(1, "Diego Maldonado", "Dieguitox1920", 50, 5, 2);
        usuarios[1] = new Usuario(2, "Anette Castellanos", "Castellane_", 60, 6, 1);
        usuarios[2] = new Usuario(3, "Marco Munguia", "Mander", 40, 4, 3);
        usuarios[3] = new Usuario(4, "Jesyca Lopez", "Jessilota", 70, 7, 0);
        usuarios[4] = new Usuario(5, "Bryan Guerra", "BryanMLG", 90, 9, 5);
    }

    /**
     * Metodo para mostrar usuarios en pantalla
     */
    public void mostrarUsuario(){
        System.out.println("\n\n Usuarios dentro del Juego:");
        System.out.println("---------------------------------------------");
        for(int i=0; i<(siguienteCodigo-1); i++){
            System.out.println((i+1)+") "+usuarios[i].mostrarInformacion());
        }
        System.out.println("\n\n");
    }

    /**
     * Metodo para mostrar puntuaciones
     */
    public void mostrarPuntuaciones(){
        System.out.println("\n\n");
        System.out.println("Puntuaciones de Usuarios:");
        System.out.println("-----------------------------------");
        for(int i=0; i<(siguienteCodigo-1); i++){
            System.out.println("-) "+usuarios[i].getNickname()+" tiene "+usuarios[i].getPartidasPerdidas()+" partidas perdidas");
            System.out.println("-) "+usuarios[i].getNickname()+" tiene "+usuarios[i].getPartidasGanadas()+" partidas ganadas");
            System.out.println("-) "+usuarios[i].getNickname()+" tiene "+usuarios[i].getPuntuacion()+ " puntos");
            System.out.println("\n\n");
        }
    }

    /**
     * Metodo para obtener el arreglo de usuarios
     * @return
     */
    public Usuario[] getUsuarios(){
        return usuarios;
    }


    /**
     * Metodo para asignar el podio y ordenar segun su puntuacion
     */
    public void asignarOrdenarPodio(){
        for(int i=0; i<(siguienteCodigo-1); i++){
            podio[i] = usuarios[i];
        }
        for (int i = 1; i < (siguienteCodigo-1); i++) {
            for (int j = 0; j < (siguienteCodigo-1-i); j++) {
                if(podio[j].getPuntuacion()<podio[j+1].getPuntuacion()){
                    Usuario aux = podio[j];
                    podio[j] = podio[j+1];
                    podio[j+1]= aux;
                }
            }
        }
    }

    /**
     * Metodo para mostrar Podio
     */
    public void mostrarPodio(){
        System.out.println("\n\n Podio del juego:");
        System.out.println("---------------------------------------------");
        for(int i=0; i<(siguienteCodigo-1); i++){
            System.out.println((i+1)+") "+podio[i].mostrarDatosPodio());
        }
        System.out.println("\n\n");
    }
}
