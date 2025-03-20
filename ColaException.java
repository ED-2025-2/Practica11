/**
 * Excepción personalizada para las operaciones de Cola.
 */
public class ColaException extends Exception {
    
    /**
     * Construye una nueva excepción con el mensaje especificado.
     * @param mensaje - El mensaje de error.
     */
    public ColaException(String mensaje) {
        super(mensaje);
    }
    
    /**
     * Construye una nueva excepción con el mensaje y la causa especificados.
     * @param mensaje - El mensaje de error.
     * @param causa - La causa del error.
     */
    public ColaException(String mensaje, Throwable causa) {
        super(mensaje, causa);
    }
}