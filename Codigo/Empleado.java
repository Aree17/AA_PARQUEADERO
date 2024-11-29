public abstract class Empleado extends Persona implements IContrato {
    protected float sueldo;
    private Parqueadero parqueadero;

    public Empleado(String nombre, String apellido, String cedula, float sueldo) {
        super(nombre, cedula);
        this.sueldo = sueldo;
    }
}
