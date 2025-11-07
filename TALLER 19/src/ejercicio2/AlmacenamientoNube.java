package ejercicio2;

public class AlmacenamientoNube implements Almacenamiento {
    @Override
    public void guardar(String archivo, byte[] datos) {
        System.out.println("Guardando en la nube: " + archivo);
    }

    @Override
    public byte[] recuperar(String archivo) {
        System.out.println("Recuperando desde la nube: " + archivo);
        return new byte[0]; // Simulación
    }
}