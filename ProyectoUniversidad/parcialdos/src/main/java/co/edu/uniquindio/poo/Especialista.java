package co.edu.uniquindio.poo;

public class Especialista extends PersonalApoyo {
    private TipoEspecialidad tipoEspecialidad;
    private int añosExperiencia;
    public Especialista(String nombre, String cedula, String direccion, String telefono,
            TipoEspecialidad tipoEspecialidad, int añosExperiencia) {
        super(nombre, cedula, direccion, telefono);
        this.tipoEspecialidad = tipoEspecialidad;
        this.añosExperiencia = añosExperiencia;
    }
    public TipoEspecialidad getTipoEspecialidad() {
        return tipoEspecialidad;
    }
    public void setTipoEspecialidad(TipoEspecialidad tipoEspecialidad) {
        this.tipoEspecialidad = tipoEspecialidad;
    }
    public int getAñosExperiencia() {
        return añosExperiencia;
    }
    public void setAñosExperiencia(int añosExperiencia) {
        this.añosExperiencia = añosExperiencia;
    }
    
    @Override
    public double calcularCostoConsulta() {
        // TODO Auto-generated method stub
        return 0;
    }
    @Override
    public String toString() {
        return "Especialista [nombre=" + nombre + ", cedula=" + cedula + ", tipoEspecialidad=" + tipoEspecialidad
                + ", direccion=" + direccion + ", añosExperiencia=" + añosExperiencia + ", telefono=" + telefono + "]";
    }
    
    
    
}
