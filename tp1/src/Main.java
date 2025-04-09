// Main.java
public class Main {
    public static void main(String[] args) {
        Vehiculo miVehiculo = new Vehiculo("ABC123", "Toyota", 2020, 500.0);
        Camion miCamion = new Camion("DEF456", "Volvo", 2023, 15000.0, true);
        Auto miAuto = new Auto("GHI789", "Ford", 2022, 0.0, 5);

        VehiculoPrinter printer = new VehiculoPrinter();
        printer.imprimir(miVehiculo);
        System.out.println("---");
        printer.imprimir(miCamion);
        System.out.println("---");
        printer.imprimir(miAuto);
    }
}