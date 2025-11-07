package ejercicio3;

public class Camion implements Conducible, Transportador {
    @Override
    public void conducir() {
        System.out.println("Conduciendo camión");
    }

    @Override
    public void cargarMercancia() {
        System.out.println("Cargando mercancía en el camión");
    }
}