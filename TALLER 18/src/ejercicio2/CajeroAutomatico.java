package ejercicio2;

public class CajeroAutomatico implements Retiro, PagoFactura {
    @Override
    public void retirar(double monto) {
        System.out.println("Retirando $" + monto);
    }

    @Override
    public void pagarFactura(String servicio, double monto) {
        System.out.println("Pagando $" + monto + " a " + servicio);
    }
}