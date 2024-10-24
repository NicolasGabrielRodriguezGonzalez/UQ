package co.edu.uniquindio.poo;
import java.util.LinkedList;
import java.time.LocalDate;

public class EventoDeportivo {
    private String nombre;
    private LocalDate fechaInicio;
    private String ubicacion;
    private String deporte;
    private LinkedList <Equipo> equipos;
    private TipoEvento tipoEvento;
    private LinkedList <Participante> participantes;
    public EventoDeportivo(String nombre, LocalDate fechaInicio, String ubicacion, String deporte,TipoEvento tipoEvento) {
        this.nombre = nombre;
        this.fechaInicio = fechaInicio;
        this.ubicacion = ubicacion;
        this.deporte = deporte;
        this.equipos=new LinkedList<>();
        this.tipoEvento = tipoEvento;
        this.participantes=new LinkedList<>();
    }
    public String getNombre() {
        return nombre;
    }
    public TipoEvento getTipoEvento() {
        return tipoEvento;
    }
    public LinkedList<Participante> getParticipantes() {
        return participantes;
    }
    public void setParticipantes(LinkedList<Participante> participantes) {
        this.participantes = participantes;
    }
    public void setTipoEvento(TipoEvento tipoEvento) {
        this.tipoEvento = tipoEvento;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public LocalDate getFechaInicio() {
        return fechaInicio;
    }
    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }
    public String getUbicacion() {
        return ubicacion;
    }
    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }
    public String getDeporte() {
        return deporte;
    }
    public void setDeporte(String deporte) {
        this.deporte = deporte;
    }
    public LinkedList<Equipo> getEquipos() {
        return equipos;
    }
    public void setEquipos(LinkedList<Equipo> equipos) {
        this.equipos = equipos;
    }
    @Override
    public String toString() {
        return "EventoDeportivo [nombre=" + nombre + ", fechaInicio=" + fechaInicio + ", ubicacion=" + ubicacion
                + ", deporte=" + deporte + ", equipos=" + equipos + ", tipoEvento=" + tipoEvento + ", participantes="
                + participantes + "]";
    }
    
    
    
}
