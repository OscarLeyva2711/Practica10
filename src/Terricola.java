public class Terricola extends Personaje {

    // Constructor que inicializa al Terricola con nombre, escenario, posición y puntos de vida
    public Terricola(String nombre, Escenario escenario, Posicion posicion) {
        super(nombre, escenario, posicion);  // Llama al constructor de la clase base Personaje
    }


    public char getRepresentacion() {
        return 'T';  // Representación del Terricola en el campo de batalla
    }
}