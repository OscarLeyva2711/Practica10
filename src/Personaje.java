public abstract class Personaje extends Elemento {
    protected String nombre;
    protected int puntosDeVida;

    // Constructor que inicializa nombre, escenario, posición y puntos de vida
    public Personaje(String nombre, Escenario escenario, Posicion posicion, int puntosDeVida) {
        super(escenario, posicion);  // Llama al constructor de Elemento
        this.nombre = nombre;
        this.puntosDeVida = puntosDeVida;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPuntosDeVida() {
        return puntosDeVida;
    }


}