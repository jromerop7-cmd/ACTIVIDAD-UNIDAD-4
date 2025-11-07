package ejercicio1;

public class AutenticacionLocal implements ServicioAutenticacion {
    @Override
    public boolean autenticar(String usuario, String clave) {
        return "admin".equals(usuario) && "1234".equals(clave);
    }
}