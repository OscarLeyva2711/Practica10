public abstract class Personaje extends Elemento implements Destruible{
    protected String nombre;


    // Constructor que inicializa nombre, escenario, posición y puntos de vida
    public Personaje(String nombre, Escenario escenario, Posicion posicion) {
        super(escenario, posicion);  // Llama al constructor de Elemento
        this.nombre = nombre;

    }

    public String getNombre() {
        return nombre;
    }
@Override
    public void destruir(){
    System.out.println("personaje destruido");
    escenario.removerElemento(this);
}



}