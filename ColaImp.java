/**
 * @autor Kevin Jair Torres Valencia.
 */

/**
 * Implementación de la EDD Cola.
 * @param <T> - El tipo de elementos de la Cola.
 */
public class ColaImp<T> implements InterfazCola<T> {
    
    /*
    * Unidades básicas de una Cola.
    */
    private class NodoCola {
        /* Parámetros */
        public T elemento;
        public NodoCola siguiente;
    
        /* Métodos */
        /**
         * Construye un NodoCola a partir de un elemento dado.
         * @param elemento - El elemento que contendrá este NodoCola.
         */
        public NodoCola(T elemento) {
            this.elemento = elemento;
            this.siguiente = null;
        }
    }
    
    /* Parámetros */
    private NodoCola inicio;
    private NodoCola fin;
    private int longitud;
    private final int capacidadMaxima;
    
    /* Métodos */
    /**
     * Crea la Cola vacía con capacidad ilimitada.
     */
    public ColaImp() {
        this(Integer.MAX_VALUE);
    }
    
    /**
     * Crea la Cola vacía con capacidad máxima especificada.
     * @param capacidadMaxima - Capacidad máxima de la cola.
     */
    public ColaImp(int capacidadMaxima) {
        //Aqui va su codigo
    }
    
    /**
     * Encola un nuevo elemento en esta Cola.
     * @param elemento - El elemento a encolar.
     * @throws ColaException - Si la cola está llena o el elemento es nulo.
     */
    @Override
    public void encolar(T elemento) throws ColaException {
        if (elemento == null) {
            throw new ColaException("No se puede encolar un elemento nulo");
        }
        
        if (longitud >= capacidadMaxima) {
            throw new ColaException("La cola ha alcanzado su capacidad máxima");
        }
        //Aqui va su codigo
    }
    
    /**
     * Desencola el elemento del inicio de esta Cola.
     * @return El elemento desencolado.
     * @throws ColaException - Si esta Cola es vacía.
     */
    @Override
    public T desencolar() throws ColaException {
        if (esVacia()) {
            throw new ColaException("La cola está vacía");
        }
        
        //Aqui va su codigo
    }
    
    /**
     * Devuelve el elemento contenido en el inicio de esta Cola sin eliminarlo.
     * @return El inicio de esta Cola.
     * @throws ColaException - Si esta Cola es vacía.
     */
    @Override
    public T peek() throws ColaException {
        if (esVacia()) {
            throw new ColaException("La cola está vacía");
        }
        //Aqui va su codigo
    }
    
    /**
     * Determina si esta Cola es vacía.
     * @return true si esta Cola es vacía. En caso contrario, false.
     */
    @Override
    public boolean esVacia() {
        // Aqui va su codigo
    }
  
    /**
     * Devuelve el número de elementos de esta Cola.
     * @return El número de elementos de esta Cola.
     */
    @Override
    public int longitud() {
        //Aqui va su codigo
    }
    
    /**
     * Limpia todos los elementos de la cola.
     */
    @Override
    public void vaciar() {
        //Aqui va su codigo
    }
    
    /**
     * Crea una copia de esta cola sin modificar la original.
     * @return Una nueva cola con los mismos elementos.
     * @throws ColaException - Si ocurre algún error al clonar.
     */
    @Override
    public InterfazCola<T> clonar() throws ColaException {
        // Aqui va su codigo
    }
    
    /**
     * Método adicional: Combina esta cola con otra manteniendo el orden.
     * @param otraCola - La cola que se combinará con esta.
     * @throws ColaException - Si la otra cola es nula o si se excede la capacidad.
     */
    public void combinar(InterfazCola<T> otraCola) throws ColaException {
        if (otraCola == null) {
            throw new ColaException("La cola a combinar no puede ser nula");
        }
        
        // Verificar si la combinación excedería la capacidad máxima
        if (this.longitud + otraCola.longitud() > this.capacidadMaxima) {
            throw new ColaException("La combinación excedería la capacidad máxima de la cola");
        }
        
        // Aqui va su codigo
    }
    
    /**
     * Método adicional: Invierte el orden de los elementos en la cola.
     * @throws ColaException - Si ocurre algún error al invertir.
     */
    public void invertir() throws ColaException {
        // Aqui va su codigo
    }

    /**
     * Metodo que nos proporciona una visualizacion
     * de los elementos de la cola
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        
        NodoCola actual = inicio;
        while (actual != null) {
            sb.append(actual.elemento);
            if (actual.siguiente != null) {
                sb.append(" | ");
            }
            actual = actual.siguiente;
        }
        sb.append("]");
        return sb.toString();
    }
}