
public class Main {
    public static void main(String[] args) {
        /**
         * Método main
         * Explicación: Este método es el punto de entrada de la aplicación y se utiliza para crear una instancia de la clase Biblioteca,
         * registrar libros y mostrar información sobre los libros.
         * @param args Argumentos de línea de comandos (no se utilizan en este caso).
         * Complejidad temporal: O(1) - Tiempo constante.
         */

        Biblioteca biibliotecaKonradLorenz = new Biblioteca();

        // Registrar el libro para almacenarlo en la biblioteca

        Libro cienAnos = new Libro("Cien años de soledad", "Gabriel Garciia Marquez", 496);
        biibliotecaKonradLorenz.registrarLibro(cienAnos);

        Libro codigoDaVinci = new Libro("ElcódigoDaVinci", "Dan Brown", 656);
        biibliotecaKonradLorenz.registrarLibro(codigoDaVinci);

        Libro milNovecientos = new Libro("1984", "George Orwell", 326);
        biibliotecaKonradLorenz.registrarLibro(milNovecientos);

        Libro hobbit = new Libro("ElHobbit", "J.R.R. Tolkien", 310);
        biibliotecaKonradLorenz.registrarLibro(hobbit);

        Libro LaOdisea = new Libro("LaOdisea", "Homero", 448);
        biibliotecaKonradLorenz.registrarLibro(LaOdisea);

// Mostrar los libros disponibles
        cienAnos.info();
        codigoDaVinci.info();
        milNovecientos.info();
        hobbit.info();
        LaOdisea.info();

    }
}