public class Vehiculo implements Tributable{
    private int id;
    private int modelo;
    private float valor;

    public Vehiculo(int id, int modelo, float valor) {
        this.id = id;
        this.modelo = modelo;
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "id=" + id +
                ", modelo=" + modelo +
                ", valor=" + valor +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }


    @Override
    public float calcularImpuestos() {
        int antiguedad;

        return 0;
    }
}