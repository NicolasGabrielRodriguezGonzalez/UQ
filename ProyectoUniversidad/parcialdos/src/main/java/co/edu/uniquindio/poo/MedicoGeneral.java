package co.edu.uniquindio.poo;

public class MedicoGeneral extends PersonalApoyo {
    private String especialidad;

    public MedicoGeneral(String nombre, String cedula, String direccion, String telefono, String especialidad) {
        super(nombre, cedula, direccion, telefono);
        this.especialidad = especialidad;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
    
    @Override
    public double calcularCostoConsulta() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public String toString() {
        return "MedicoGeneral [nombre=" + nombre + ", especialidad=" + especialidad + ", cedula=" + cedula
                + ", direccion=" + direccion + ", telefono=" + telefono + "]";
    }
    

    
}
