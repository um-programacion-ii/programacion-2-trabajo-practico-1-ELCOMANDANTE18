// Imprimible.java
public abstract class Imprimible {
    /**
     * Método abstracto que define la acción de "imprimir"
     * para cualquier clase que herede de Imprimible.
     *
     * @param printer La instancia de VehiculoPrinter que realizará la impresión.
     */
    public abstract void imprimir(VehiculoPrinter printer);
}