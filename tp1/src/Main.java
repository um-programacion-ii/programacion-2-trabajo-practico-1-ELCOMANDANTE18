// Main.java
public class Main {
    public static void main(String[] args) {
        Vehiculo miVehiculo = new Vehiculo("ABC123", "Toyota", 2020, 500.0);
        VehiculoPrinter printer = new VehiculoPrinter();
        printer.imprimir(miVehiculo);
    }
}