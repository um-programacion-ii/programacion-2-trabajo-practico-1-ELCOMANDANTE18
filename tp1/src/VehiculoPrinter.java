// VehiculoPrinter.java
public class VehiculoPrinter {
    public void imprimir(Imprimible imprimible) {
        imprimible.imprimir(this);
    }

    public void imprimirInfoVehiculo(Vehiculo vehiculo) {
        System.out.println("Patente: " + vehiculo.getPatente());
        System.out.println("Marca: " + vehiculo.getMarca());
        System.out.println("Año: " + vehiculo.getAño());
        System.out.println("Capacidad de carga: " + vehiculo.getCapacidadCargaKg() + " kg");
    }

    public void imprimirInfoCamion(Camion camion) {
        imprimirInfoVehiculo(camion); // Imprime la información básica del vehículo
        System.out.println("¿Tiene acoplado? " + (camion.tieneAcoplado() ? "Sí" : "No"));
    }
}