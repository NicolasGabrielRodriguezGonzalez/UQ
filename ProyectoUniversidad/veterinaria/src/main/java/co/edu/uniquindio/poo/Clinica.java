package co.edu.uniquindio.poo;
import java.util.LinkedList;

public class Clinica {
    private String nombre;
    private String direccion;
    private String telefono;
    private LinkedList<Veterinario> veterinarios;
    private LinkedList<Mascota> mascotas;
    private LinkedList<Dueño> dueños;

    public Clinica(String nombre, String direccion, String telefono) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        veterinarios = new LinkedList<>();
        mascotas = new LinkedList<>();
        dueños = new LinkedList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public LinkedList<Mascota> getMascotas() {
        return mascotas;
    }

    public void setMascotas(LinkedList<Mascota> mascotas) {
        this.mascotas = mascotas;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public LinkedList<Veterinario> getVeterinarios() {
        return veterinarios;
    }

    public void setVeterinarios(LinkedList<Veterinario> veterinarios) {
        this.veterinarios = veterinarios;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Clinica:\n");
        sb.append("Nombre: ").append(nombre).append("\n");
        sb.append("Direccion: ").append(direccion).append("\n");
        sb.append("Telefono: ").append(telefono).append("\n");

        sb.append("Veterinarios:\n");
        for (Veterinario veterinario : veterinarios) {
            sb.append(veterinario.toString()).append("\n");
        }

        sb.append("Mascotas:\n");
        int contadorMascotas = 1;
        for (Mascota mascota : mascotas) {
            sb.append("Mascota ").append(contadorMascotas++).append(":\n");
            sb.append("    Nombre: ").append(mascota.getNombre()).append("\n");
            sb.append("    Edad: ").append(mascota.getEdad()).append("\n");
            sb.append("    Especie: ").append(mascota.getEspecie()).append("\n");
            sb.append("    Historial Medico:\n");
            sb.append("        Fecha: ").append(mascota.getHistorialMedico().getFecha()).append("\n");
            sb.append("        Diagnostico: ").append(mascota.getHistorialMedico().getDiagnostico()).append("\n");
            sb.append("        Tratamiento: ").append(mascota.getHistorialMedico().getTratamiento()).append("\n");
            sb.append("        Observacion: ").append(mascota.getHistorialMedico().getObservacion()).append("\n");
            sb.append("        Veterinario: ").append(mascota.getHistorialMedico().getVeterinario().getNombre()).append("\n");
        }

        sb.append("Dueños:\n");
        int contadorDueños = 1;
        for (Dueño dueño : dueños) {
            sb.append("Dueño ").append(contadorDueños++).append(":\n");
            sb.append("    Nombre: ").append(dueño.getNombre()).append("\n");
            sb.append("    Direccion: ").append(dueño.getDireccion()).append("\n");
            sb.append("    Telefono: ").append(dueño.getTelefono()).append("\n");
            sb.append("    Mascotas:\n");

            int contadorMascotasDueño = 1; // Reiniciar el contador de mascotas para cada dueño
            for (Mascota mascota : dueño.getMascotas()) {
                sb.append("        Mascota ").append(contadorMascotasDueño++).append(":\n");
                sb.append("            Nombre: ").append(mascota.getNombre()).append("\n");
                sb.append("            Edad: ").append(mascota.getEdad()).append("\n");
                sb.append("            Especie: ").append(mascota.getEspecie()).append("\n");
            }
        }

        return sb.toString();
    }

    public void agregarVeterinario(Veterinario veterinario) {
        veterinarios.add(veterinario);
    }

    public void agregarMascota(Mascota mascota) {
        mascotas.add(mascota);
    }

    public static void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }

    public LinkedList<Dueño> getDueños() {
        return dueños;
    }

    public void setDueños(LinkedList<Dueño> dueños) {
        this.dueños = dueños;
    }

    public void agregarDueño(Dueño dueño) {
        dueños.add(dueño);
    }
}
