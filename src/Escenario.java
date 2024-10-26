import java.util.Arrays;

public class Escenario {
    private String nombre;
    private Elemento[][] campoDeBatalla;
    private int n;

    public Escenario(String nombre, int n) {
        this.n = n;
        campoDeBatalla = new Elemento[n][n];
        this.nombre = nombre;
    }

    public void agregarElemento(Elemento elemento) {
        Posicion posicion = elemento.getPosicion();
        campoDeBatalla[posicion.getRenglon()][posicion.getColumna()] = elemento;
    }

    public void destruirElemento(Posicion posicion, int radio) {
        int renglonCentral = posicion.getRenglon();
        int columnaCentral = posicion.getColumna();

        for (int i = renglonCentral - radio; i <= renglonCentral + radio; i++) {
            for (int j = columnaCentral - radio; j <= columnaCentral + radio; j++) {
                if (i >= 0 && i < n && j >= 0 && j < n && campoDeBatalla[i][j] != null) {
                    Elemento elemento = campoDeBatalla[i][j];
                    if (elemento instanceof Destruible) {
                        ((Destruible) elemento).destruir();
                        campoDeBatalla[i][j] = null;  // Eliminar el elemento del campo después de destruirlo
                    }
                }
            }
        }
    }

    public void removerElemento(Elemento elemento) {
        Posicion posicion = elemento.getPosicion();
        campoDeBatalla[posicion.getRenglon()][posicion.getColumna()] = null;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Escenario: ").append(nombre).append("\n");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (campoDeBatalla[i][j] == null) {
                    sb.append("0 ");
                } else {
                    sb.append(campoDeBatalla[i][j].getRepresentacion()).append(" ");
                }
            }
            sb.append("\n");
        }

        return sb.toString();
    }
}