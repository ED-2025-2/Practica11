/**
 * Interfaz que define el comportamiento de una estructura de datos tipo Cola.
 * @param <T> - El tipo de elementos de la Cola.
 */
public interface InterfazCola<T> {
    
    /**
     * Encola un nuevo elemento en esta Cola.
     * @param elemento - El elemento a encolar.
     * @throws ColaException - Si ocurre algún error al encolar.
     */
    void encolar(T elemento) throws ColaException;
    
    /**
     * Desencola el elemento del inicio de esta Cola.
     * @throws ColaException - Si esta Cola es vacía.
     * @return El elemento desencolado.
     */
    T desencolar() throws ColaException;
    
    /**
     * Devuelve el elemento contenido en el inicio de esta Cola sin eliminarlo.
     * @return El inicio de esta Cola.
     * @throws ColaException - Si esta Cola es vacía.
     */
    T peek() throws ColaException;
    
    /**
     * Determina si esta Cola es vacía.
     * @return true si esta Cola es vacía. En caso contrario, false.
     */
    boolean esVacia();
    
    /**
     * Devuelve el número de elementos de esta Cola.
     * @return El número de elementos de esta Cola.
     */
    int longitud();
    
    /**
     * Limpia todos los elementos de la cola.
     */
    void vaciar();
    
    /**
     * Crea una copia de esta cola sin modificar la original.
     * @return Una nueva cola con los mismos elementos.
     * @throws ColaException - Si ocurre algún error al clonar.
     */
    InterfazCola<T> clonar() throws ColaException;
}