import java.util.Arrays;

public class Comuna {
    private Tributable[] bienes;

    public Comuna(){
        bienes = new Tributable[3];
        bienes[0] = new Inmueble(123, 345,120);
        bienes[1] = new Inmueble(456, 1300,430);
        bienes[2] = new Vehiculo(987, 2018, 11870);
    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        for (Tributable t:bienes
             ) {
            sb.append("\n" + t.toString());

        } return sb.toString();
    }
    public float calcularTotalImpuestos() {
        float total = 0;
        for (Tributable t : bienes
        ) {
            total += t.calcularImpuestos();

        }
        return total;
    }

    public float calcularImpuestosPorTipo(Class x) {
        float total = 0;
        for (Tributable t:
                bienes) {
            if (t.getClass() == x)
                total += t.calcularImpuestos();

        }
    return total;}
}
