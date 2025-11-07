package ejercicio2;

public class BancaEnLinea implements Transferencia, PagoFactura {
    @Override
    public void transferir(double monto) {
        System.out.println("Transfiriendo " + monto);
    }

    @Override
    public void pagarFactura(String servicio, double monto) {
        System.out.println("Pago en línea de " + monto + " a " + servicio);
    }
}