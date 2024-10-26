public class Roca extends Elemento {

    // Constructor que inicializa la roca con el escenario y su posición
    public Roca(Escenario escenario, Posicion posicion) {
        super(escenario, posicion);  // Llama al constructor de la clase base Elemento
    }


    public char getRepresentacion() {
        return 'R';  // Representación de la roca en el campo de batalla
    }
}