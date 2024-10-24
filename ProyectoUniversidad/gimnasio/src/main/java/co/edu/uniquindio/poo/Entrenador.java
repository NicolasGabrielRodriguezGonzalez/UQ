package co.edu.uniquindio.poo;

import java.util.LinkedList;

public class Entrenador extends Persona {
    private String especialidad;
    private LinkedList<Miembro> listaMiembros;
    
    public Entrenador(String nombre, String cedula, int telefono, String correo, String especialidad) {
        super(nombre, cedula, telefono, correo);
        this.especialidad = especialidad;
        this.listaMiembros=new LinkedList<>();
        // Validaciones
        if (nombre == null || nombre.isBlank()) {
            throw new IllegalArgumentException("El nombre no puede estar vacío");
        }
        if (cedula == null || cedula.isBlank()) {
            throw new IllegalArgumentException("La cédula no puede estar vacía");
        }
        if (telefono <= 0) {
            throw new IllegalArgumentException("El teléfono debe ser un número positivo");
        }
        if (correo == null || correo.isBlank() || !correo.contains("@")) {
            throw new IllegalArgumentException("El correo no es válido");
        }
        if (especialidad == null || especialidad.isBlank()) {
            throw new IllegalArgumentException("La especialidad no puede estar vacía");
        }
    }

    public LinkedList<Miembro> getListaMiembros() {
        return listaMiembros;
    }

    public void setListaMiembros(LinkedList<Miembro> listaMiembros) {
        this.listaMiembros = listaMiembros;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    @Override
    public String toString() {
        return "Entrenador [nombre=" + nombre + ", cedula=" + cedula + ", especialidad=" + especialidad + ", telefono="
                + telefono + ", correo=" + correo + ", listaMiembros=" + listaMiembros + "]";
    }
    public void agregarMiembro (Miembro miembro){
        listaMiembros.add(miembro);
    }
    
    
}