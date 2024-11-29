public class Automovil extends Vehiculo {
    private String matricula;
    private int capacidadPersonas;

    public Automovil(String modelo, String color, String marca, String matricula, int capacidadPersonas) {
        super(modelo, color, marca);
        this.tarifa= 1.0f;
        this.matricula = matricula;
        this.capacidadPersonas = capacidadPersonas;
    }

}
