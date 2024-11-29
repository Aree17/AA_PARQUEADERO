public class Plaza {
    private String codigo;
    private boolean reservado;

    //relaciones
    Piso piso;

    //constructor
    public Plaza(String codigo, boolean reservado, Piso piso) {
        this.codigo = codigo;
        this.reservado = reservado;
        this.piso = piso;
    }
    //metodos
    public boolean isReservado() {
        return reservado;
    }

    //Getters y Setters
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setReservado(boolean reservado) {
        this.reservado = reservado;
    }

    public Piso getPiso() {
        return piso;
    }

    public void setPiso(Piso piso) {
        this.piso = piso;
    }

    public void mostrarDatos(Plaza plaza) {
        System.out.println("Codigo: " + codigo);
        System.out.println("Reservado: " + reservado);
    }

}
