package co.edu.uniquindio.poo;

public abstract class PersonalApoyo {
    public String nombre;
    public String cedula;
    public String direccion;
    public String telefono;
    public PersonalApoyo(String nombre, String cedula, String direccion, String telefono) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.direccion = direccion;
        this.telefono = telefono;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getCedula() {
        return cedula;
    }
    public void setCedula(String cedula) {
        this.cedula = cedula;
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
    public abstract double calcularCostoConsulta();
    

    
}
