package co.edu.uniquindio.poo;



import java.time.LocalDate;
import java.time.LocalTime;
import java.util.LinkedList;

public class Reunion {
    private String descripcion;
    private LocalDate fecha;
    private LocalTime hora;
    private LinkedList<Contacto> listaContactosasistentes;

    public Reunion(String descripcion, LocalDate fecha, LocalTime hora) {
        this.descripcion = descripcion;
        this.fecha = fecha;
        this.hora = hora;
        this.listaContactosasistentes = new LinkedList<>();
    }

    public void agregarAsistente(Contacto contacto) {
        listaContactosasistentes.add(contacto);
    }

    public void removerAsistente(Contacto contacto){
        this.listaContactosasistentes.remove(contacto);
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }

    public void setAsistentes(LinkedList<Contacto> asistentes) {
        this.listaContactosasistentes = asistentes;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public LocalTime getHora() {
        return hora;
    }

    public LinkedList<Contacto> getAsistentes() {
        return listaContactosasistentes;
    }

    @Override
    public String toString() {
        return "\nLa reunion es de " + descripcion + " para el dia" +fecha+ "  inicia a las " + hora + " tiene los siguientes asistentes:\n" +
        listaContactosasistentes.toString() + "\n";
    }

 }