// Camion.java
public class Camion extends Vehiculo {
    private boolean tieneAcoplado;

    public Camion(String patente, String marca, int año, double capacidadCargaKg, boolean tieneAcoplado) {
        super(patente, marca, año, capacidadCargaKg);
        this.tieneAcoplado = tieneAcoplado;
    }

    public boolean tieneAcoplado() {
        return tieneAcoplado;
    }

    public void setTieneAcoplado(boolean tieneAcoplado) {
        this.tieneAcoplado = tieneAcoplado;
    }
}