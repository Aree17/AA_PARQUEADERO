public abstract class Vehiculo {
    protected String modelo;
    protected String color;
    protected String marca;
    protected float tarifa;

    public Vehiculo(String modelo, String color, String marca) {
        this.modelo = modelo;
        this.color = color;
        this.marca = marca;
        this.tarifa = 1.0f;
    }


    // Getters
    public String getModelo() {
        return modelo;
    }


    public String getColor() {
        return color;
    }


    public String getMarca() {
        return marca;
    }


    public float getTarifa() {
        return tarifa;
    }


}
