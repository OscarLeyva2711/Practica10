public class MisionPosibleMain {
    public static void main(String[] args) {
        Escenario escenario = new Escenario("Nostromo", 10);

        // Agregar un Terricola
        Terricola terricola = new Terricola("Ripley", escenario, new Posicion(3, 2), 100);
        escenario.agregarElemento(terricola);

        // Agregar un Extraterrestre
        Extraterrestre extraterrestre = new Extraterrestre("Alien", escenario, new Posicion(4, 4), 50);
        escenario.agregarElemento(extraterrestre);

        // Agregar una Bomba
        Bomba bomba = new Bomba(escenario, new Posicion(4, 4), 1);
        escenario.agregarElemento(bomba);

        // Mostrar el escenario antes de la explosión
        System.out.println("Escenario antes de la explosión:");
        System.out.println(escenario);

        // Hacer explotar la bomba y mostrar el escenario después de la explosión
        bomba.explotar();

        System.out.println("\nEscenario después de la explosión:");
        System.out.println(escenario);
    }
}