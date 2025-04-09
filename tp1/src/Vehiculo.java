// Vehiculo.java
public class Vehiculo extends Imprimible {
    private String patente;
    private String marca;
    private int año;
    private double capacidadCargaKg;

    public Vehiculo(String patente, String marca, int año, double capacidadCargaKg) {
        this.patente = patente;
        this.marca = marca;
        this.año = año;
        this.capacidadCargaKg = capacidadCargaKg;
    }

    public String getPatente() {
        return patente;
    }

    public String getMarca() {
        return marca;
    }

    public int getAño() {
        return año;
    }

    public double getCapacidadCargaKg() {
        return capacidadCargaKg;
    }

    @Override
    public void imprimir(VehiculoPrinter printer) {
        printer.imprimirInfoVehiculo(this);
    }
}