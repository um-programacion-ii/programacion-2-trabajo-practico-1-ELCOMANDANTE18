// Main.java
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Crear instancias de diferentes tipos de vehículos
        Vehiculo miVehiculo = new Vehiculo("ABC123", "Toyota", 2020, 500.0);
        Camion miCamion1 = new Camion("DEF456", "Volvo", 2023, 15000.0, true);
        Auto miAuto1 = new Auto("GHI789", "Ford", 2022, 0.0, 5);
        Camion miCamion2 = new Camion("JKL012", "Scania", 2021, 18000.0, false);
        Auto miAuto2 = new Auto("MNO345", "Fiat", 2024, 0.0, 4);

        // Crear un ArrayList para almacenar objetos de tipo Vehiculo
        List<Vehiculo> listaDeVehiculos = new ArrayList<>();

        // Agregar los vehículos a la lista
        listaDeVehiculos.add(miVehiculo);
        listaDeVehiculos.add(miCamion1); // Camion es un subtipo de Vehiculo
        listaDeVehiculos.add(miAuto1);   // Auto es un subtipo de Vehiculo
        listaDeVehiculos.add(miCamion2);
        listaDeVehiculos.add(miAuto2);

        // Crear una instancia de VehiculoPrinter
        VehiculoPrinter printer = new VehiculoPrinter();

        // Iterar sobre la lista de vehículos e imprimir su información
        System.out.println("--- Información de todos los vehículos ---");
        for (Vehiculo vehiculo : listaDeVehiculos) {
            printer.imprimir(vehiculo); // El polimorfismo se encarga de la impresión correcta
            System.out.println("---");
        }
    }
}