public class Cajero extends Empleado {

    //metodos
    public void cobrarTotal(float total){
        System.out.println("Se ha cobrado el total");
    }

    //Constructor
    public Cajero(String nombre, String apellido, String cedula, float sueldo) {
        super(nombre, apellido, cedula, sueldo);
    }

    @Override
    public void trabajar() {
        System.out.println("El cajero está cobrando..\n");
    }

    @Override
    public void cumplirHorario() {
        System.out.println("El cajero cumple su horario..");
    }
}
