//Se importa la biblioteca linkedlist para concatenar los datos en una lista

import java.util.LinkedList;

public class Biblioteca {
    /**
     *Atributos
     * */
    public LinkedList<Libro> librosDisponibles = new LinkedList<>();
    /**
     *connstructor
     * */
    public void registrarLibro(Libro libro){
librosDisponibles.add(libro);
    }
    /**
     * Método para registrar un libro
     * Explicación: Este método busca un libro en la lista de libros disponibles por su título.
     * @param titulo Una cadena de caracteres que representa el título del libro que se desea buscar.
     * @return
     * Complejidad temporal: O(N) - Tiempo lineal.
     */
    public Libro buscarLibro(String titulo){
        for (int i = 0; i < librosDisponibles.size(); i++) {
            Libro libroBuscado = librosDisponibles.get(i);
            if (libroBuscado.getTitulo().equals(titulo) ) {
 return libroBuscado;
            }
        }

        return null;
    }
    /**
     * Método para mostrar los libros disponibles
     */
    public LinkedList<Libro> mostrarLibrosDisponibles(){
return librosDisponibles;
    }

}
