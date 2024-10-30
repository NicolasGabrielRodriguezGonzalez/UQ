package co.edu.uniquindio.poo;

public class Especialista extends PersonalApoyo {
    private TipoEspecialidad tipoEspecialidad;
    private int añosExperiencia;
    private Consulta consulta;

    public Especialista(String nombre, String cedula, String direccion, String telefono,
            TipoEspecialidad tipoEspecialidad, int añosExperiencia, Consulta consulta) {
        super(nombre, cedula, direccion, telefono);
        this.tipoEspecialidad = tipoEspecialidad;
        this.añosExperiencia = añosExperiencia;
        this.consulta = consulta;
    }

    public TipoEspecialidad getTipoEspecialidad() {
        return tipoEspecialidad;
    }

    public void setTipoEspecialidad(TipoEspecialidad tipoEspecialidad) {
        this.tipoEspecialidad = tipoEspecialidad;
    }

    public Consulta getConsulta() {
        return consulta;
    }

    public void setConsulta(Consulta consulta) {
        this.consulta = consulta;
    }

    public int getAñosExperiencia() {
        return añosExperiencia;
    }

    public void setAñosExperiencia(int añosExperiencia) {
        this.añosExperiencia = añosExperiencia;
    }
    
    @Override
    public double calcularCostoConsulta() {
        double costoBase;

        if (tipoEspecialidad == TipoEspecialidad.CARDIOLOGIA) {
            costoBase = 80000;
        } else if (tipoEspecialidad == TipoEspecialidad.NEUROLOGIA) {
            costoBase = 160000;
        } else {
            costoBase = 0;
        }

        double operacion = costoBase * consulta.getTratamientos().size();
        return operacion;
    }

    @Override
    public String toString() {
        return "Especialista [nombre=" + getNombre() + ", cedula=" + getCedula() + ", tipoEspecialidad=" + tipoEspecialidad
                + ", direccion=" + getDireccion() + ", añosExperiencia=" + añosExperiencia + ", telefono=" + getTelefono() + "]";
    }
}
