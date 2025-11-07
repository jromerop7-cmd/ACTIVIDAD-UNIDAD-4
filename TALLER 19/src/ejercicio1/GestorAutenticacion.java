package ejercicio1;

public class GestorAutenticacion {
    private ServicioAutenticacion servicio;

    public GestorAutenticacion(ServicioAutenticacion servicio) {
        this.servicio = servicio;
    }

    public void iniciarSesion(String usuario, String clave) {
        if (servicio.autenticar(usuario, clave)) {
            System.out.println("Autenticación exitosa.");
        } else {
            System.out.println("Credenciales inválidas.");
        }
    }
}