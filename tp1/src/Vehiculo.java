// Vehiculo.java
public class Vehiculo {
    private String patente;
    private String marca;
    private int año;
    private double capacidadCargaKg;

    // Constructor
    public Vehiculo(String patente, String marca, int año, double capacidadCargaKg) {
        this.patente = patente;
        this.marca = marca;
        this.año = año;
        this.capacidadCargaKg = capacidadCargaKg;
    }

    // Getters y setters
    public String getPatente() { return patente; }
    public String getMarca() { return marca; }
    public int getAño() { return año; }
    public double getCapacidadCargaKg() { return capacidadCargaKg; }

    public void setPatente(String patente) { this.patente = patente; }
    public void setMarca(String marca) { this.marca = marca; }
    public void setAño(int año) { this.año = año; }
    public void setCapacidadCargaKg(double capacidadCargaKg) { this.capacidadCargaKg = capacidadCargaKg; }

    // Método para mostrar información
    public void mostrarInfo() {
        System.out.println("Patente: " + patente);
        System.out.println("Marca: " + marca);
        System.out.println("Año: " + año);
        System.out.println("Capacidad de carga: " + capacidadCargaKg + " kg");
    }
}