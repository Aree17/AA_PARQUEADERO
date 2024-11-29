public class Bicicleta extends Vehiculo{
    private float tamanioMetros;

    //constructor
    public Bicicleta(String modelo, String color, String marca, float tamanioMetros) {
        super(modelo, color, marca);
        this.tarifa= 0.5f;
        this.tamanioMetros =tamanioMetros;
    }
}
