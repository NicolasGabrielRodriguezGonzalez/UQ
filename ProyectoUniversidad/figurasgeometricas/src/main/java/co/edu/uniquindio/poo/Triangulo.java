package co.edu.uniquindio.poo;

public class Triangulo extends Figura{
    private int lado1;
    private int lado2;
    private int base;
    private int altura;
    public Triangulo(int lado1, int lado2, int base, int altura) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.base = base;
        this.altura = altura;
    }
    public int getLado1() {
        return lado1;
    }
    public int getBase() {
        return base;
    }
    public void setBase(int base) {
        this.base = base;
    }
    public int getAltura() {
        return altura;
    }
    public void setAltura(int altura) {
        this.altura = altura;
    }
    public void setLado1(int lado1) {
        this.lado1 = lado1;
    }
    public int getLado2() {
        return lado2;
    }
    @Override
    public int calcularPerimetro() {
        int perimetro = lado1 + lado2 + base;
        // TODO Auto-generated method stub
        return perimetro;
    }
    public void setLado2(int lado2) {
        this.lado2 = lado2;
    }
    @Override
    public int calcularArea() {
        int area = (base*altura)/2;
        // TODO Auto-generated method stub
        return area;
        
    }
    @Override
    public String toString() {
        return "Triangulo [lado1=" + lado1 + ", lado2=" + lado2 + ", base=" + base + ", altura=" + altura + "]";
    }
    
    
}
