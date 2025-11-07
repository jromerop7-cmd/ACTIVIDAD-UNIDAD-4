package ejercicio2;

public interface Almacenamiento {
    void guardar(String archivo, byte[] datos);
    byte[] recuperar(String archivo);
}