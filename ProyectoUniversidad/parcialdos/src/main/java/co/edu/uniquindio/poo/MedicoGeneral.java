package co.edu.uniquindio.poo;

public class MedicoGeneral extends PersonalApoyo {
    private String especialidad;
    private Consulta consulta;

    public MedicoGeneral(String nombre, String cedula, String direccion, String telefono, String especialidad, Consulta consulta) {
        super(nombre, cedula, direccion, telefono);
        this.especialidad = especialidad;
        this.consulta = consulta;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public Consulta getConsulta() {
        return consulta;
    }

    public void setConsulta(Consulta consulta) {
        this.consulta = consulta;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
    
    @Override
    public double calcularCostoConsulta() {
        double valorBase = 30.000;
        double operacion = valorBase + (5000 * consulta.getTratamientos().size());
        return operacion;
    }

    @Override
    public String toString() {
        return "MedicoGeneral [nombre=" + nombre + ", especialidad=" + especialidad + ", cedula=" + cedula
                + ", direccion=" + direccion + ", telefono=" + telefono + "]";
    }
    

    
}
