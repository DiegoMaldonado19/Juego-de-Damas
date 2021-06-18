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

    /**
     * Constructor para el vector de usuarios
     */
    public VectorUsuarios(){
        siguienteCodigo=1;
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
     * Metodo para mostrar usuarios en pantalla
     */
    public void mostrarUsuario(){
        System.out.println("\n\n Usuarios de juego");
        for(int i=0; i<siguienteCodigo; i++){
            System.out.println((i+1)+") "+usuarios[i].mostrarInformacion());
        }
        System.out.println("\n\n");
    }
}
