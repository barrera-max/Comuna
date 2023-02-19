import java.text.DecimalFormat;

public class Principal {
    public static void main(String[] args) {
        Comuna comuna = new Comuna();
        System.out.println("Listado de propiedades: ");
        System.out.println(comuna);
        float totGeneral = comuna.calcularTotalImpuestos();
        System.out.println("Total de impuestos $ "+ totGeneral);
        float totIn = comuna.calcularImpuestosPorTipo(Inmueble.class);
        float totVe = comuna.calcularImpuestosPorTipo(Vehiculo.class);
        DecimalFormat df = new DecimalFormat("#.##");
        System.out.println("Total impuestos inmuebles $" + totIn +
                " Porcentaje: " + df.format(totIn * 100/totGeneral) + "%");
        System.out.println("Total impuestos vehiculos $" + totVe +
                " Porcentaje: " + df.format(totVe * 100/totGeneral) + "%");
    }
}
