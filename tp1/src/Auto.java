// Auto.java
public class Auto extends Vehiculo {
    private int cantidadPasajeros;

    public Auto(String patente, String marca, int año, double capacidadCargaKg, int cantidadPasajeros) {
        super(patente, marca, año, capacidadCargaKg);
        this.cantidadPasajeros = cantidadPasajeros;
    }

    public int getCantidadPasajeros() {
        return cantidadPasajeros;
    }

    public void setCantidadPasajeros(int cantidadPasajeros) {
        this.cantidadPasajeros = cantidadPasajeros;
    }

    @Override
    public void imprimir(VehiculoPrinter printer) {
        printer.imprimirInfoAuto(this);
    }
}