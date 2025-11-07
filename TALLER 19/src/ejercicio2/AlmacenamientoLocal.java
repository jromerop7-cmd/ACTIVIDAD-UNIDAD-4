package ejercicio2;

public class AlmacenamientoLocal implements Almacenamiento {
    @Override
    public void guardar(String archivo, byte[] datos) {
        System.out.println("Guardando en disco local: " + archivo);
    }

    @Override
    public byte[] recuperar(String archivo) {
        System.out.println("Recuperando desde disco local: " + archivo);
        return new byte[0];
    }
}