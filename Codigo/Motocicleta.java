public class Motocicleta extends Vehiculo {
    private String matricula;
    private String tipoMotor;

    public Motocicleta(String modelo, String color, String marca, String matricula, String tipoMotor) {
        super(modelo, color, marca);
        this.tarifa= 0.75f;
        this.matricula = matricula;
        this.tipoMotor = tipoMotor;
    }
}
