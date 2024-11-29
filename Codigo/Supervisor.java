public class Supervisor extends Empleado{

    //constructor
    public Supervisor(String nombre, String apellido, String cedula, float sueldo) {
        super(nombre, apellido, cedula, sueldo);
    }

    //metodos
    public void controlarFuncionamiento(){
        System.out.println("El supervisor está revisando espacios\n");
    }
    @Override
    public void trabajar() {
        System.out.println("El supervisor está supervisando..\n");
    }

    @Override
    public void cumplirHorario() {
        System.out.println("El supervisor está cumpliendo horario..\n");
    }
}
