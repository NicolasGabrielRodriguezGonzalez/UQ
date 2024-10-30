package co.edu.uniquindio.poo;
import java.util.LinkedList;
import java.time.LocalDate;

public class Consulta {
    private String codigo;
    private TipoConsulta tipoConsulta;
    private LocalDate fechaConsulta;
    private double costoTotal;
    private LinkedList <Tratamiento> tratamientos;
    public Consulta(String codigo, TipoConsulta tipoConsulta, LocalDate fechaConsulta, double costoTotal) {
        this.codigo = codigo;
        this.tipoConsulta = tipoConsulta;
        this.fechaConsulta = fechaConsulta;
        this.costoTotal = costoTotal;
        tratamientos = new LinkedList<>();
        
    }
    public String getCodigo() {
        return codigo;
    
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public LinkedList<Tratamiento> getTratamientos() {
        return tratamientos;
    }
    public void setTratamientos(LinkedList<Tratamiento> tratamientos) {
        this.tratamientos = tratamientos;
    }
    public TipoConsulta getTipoConsulta() {
        return tipoConsulta;
    }
    public void setTipoConsulta(TipoConsulta tipoConsulta) {
        this.tipoConsulta = tipoConsulta;
    }
    public LocalDate getFechaConsulta() {
        return fechaConsulta;
    }
    public void setFechaConsulta(LocalDate fechaConsulta) {
        this.fechaConsulta = fechaConsulta;
    }
    public double getCostoTotal() {
        return costoTotal;
    }
    public void setCostoTotal(double costoTotal) {
        this.costoTotal = costoTotal;
    }
    @Override
    public String toString() {
        return "Consulta [codigo=" + codigo + ", tipoConsulta=" + tipoConsulta + ", fechaConsulta=" + fechaConsulta
                + ", costoTotal=" + costoTotal + "]";
    }

    

    
}
