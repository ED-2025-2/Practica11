public class Main {
    public static void main(String[] args) {
        try {
            // Crear una cola con capacidad máxima de 5 elementos
            ColaImp<Integer> cola = new ColaImp<>(5);
            
            // Prueba de encolar elementos
            System.out.println("\nSe creo una cola con capacidad maxima de 5 elementos");
            System.out.println("Se encolan los elementos: 1, 2, 3, 4, 5");
            cola.encolar(1);
            cola.encolar(2);
            cola.encolar(3);
            cola.encolar(4);
            cola.encolar(5);

            System.out.println("Mostrando la cola " + cola);
            

            // Intentar encolar un sexto elemento (debería lanzar excepción)
            System.out.println("Se intenta encolar un elementos más para exceder su capacidad:");
            try {
                cola.encolar(6);
            } catch (ColaException e) {
                System.out.println("Excepción capturada: " + e.getMessage());
            }
            

            // Mostrar el primer elemento con peek
            System.out.println("\nMostrar elemento del frente: " + cola.peek());
            

            // Desencolar elementos
            System.out.println("\nDesencolando elementos");
            System.out.println("Desencolando: " + cola.desencolar());
            System.out.println("Desencolando: " + cola.desencolar());
            System.out.println("Contenido de la cola despues de desencolar " + cola);
            
            
            // Clonar la cola
            ColaImp<Integer> clon = (ColaImp<Integer>) cola.clonar();
            System.out.println("\nSe crea un clon de la cola creada previamente.");
            System.out.println("Cola original " + cola + " Cola clonada " + clon );

            
            // Mostrar elementos restantes en la cola original
            System.out.println("Elemento en el frente en la cola original: " + cola.peek());
            
            
            // Invertir la cola
            System.out.println("\nSe invierte la cola");
            cola.invertir();
            System.out.println("Visualizando la cola invertida " + cola);
            System.out.println("Elemento en el frente después de invertir la cola: " + cola.peek());



            System.out.println("\nSe crea una cola para combinar");
            ColaImp<Integer> cola2 = new ColaImp<>(10);
            // Llenar la segunda cola con otros valores
            cola2.encolar(7);
            cola2.encolar(8);
            cola2.encolar(9);
            System.out.println("Cola 2 antes de combinar: " + cola2);
            cola2.combinar(cola);
            System.out.println("Colas combinadas" + cola2 );
            
            
            // Vaciar la cola
            System.out.println("\nSe vacia la cola");
            cola.vaciar();
            System.out.println("¿Está vacía la cola? " + cola.esVacia());
            System.out.println("Se intenta desencolar un elemento en la cola vacia");
            
            
            // Intentar desencolar de una cola vacía
            try {
                cola.desencolar();
            } catch (ColaException e) {
                System.out.println("Excepción capturada: " + e.getMessage());
            }
        } catch (ColaException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
