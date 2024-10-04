package co.edu.uniquindio.poo;

public class Bibliotecario extends Persona {
    private double salario;


    public Bibliotecario(String nombre, String cedula, String telefono, String email, double salario) {
        super(nombre, cedula, telefono, email);
        this.salario = salario;
        assert !nombre.isBlank();
        assert !cedula.isBlank();
        assert !telefono.isBlank();
        assert !email.isBlank();
        assert salario >= 1300000;
        assert email.contains("@");
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Bibliotecarios [nombre=" + nombre + ", salario=" + salario + ", cedula=" + cedula + ", telefono="
                + telefono + ", email=" + email + "]";
    }
    

    

    
}
