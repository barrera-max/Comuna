public class Inmueble {
    private int frente;
    private int cubiertos;

    public Inmueble(int frente, int cubiertos) {
        this.frente = frente;
        this.cubiertos = cubiertos;
    }

    @Override
    public String toString() {
        return "Inmueble{" +
                "frente=" + frente +
                ", cubiertos=" + cubiertos +
                '}';
    }
}
