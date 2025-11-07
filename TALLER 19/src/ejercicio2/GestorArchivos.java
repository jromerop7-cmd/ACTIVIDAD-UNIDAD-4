package ejercicio2;

public class GestorArchivos {
    private Almacenamiento almacenamiento;

    public GestorArchivos(Almacenamiento almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    public void procesarArchivo(String nombre, byte[] datos) {
        almacenamiento.guardar(nombre, datos);
        almacenamiento.recuperar(nombre);
    }
}