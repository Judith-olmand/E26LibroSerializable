import java.util.ArrayList;
import java.util.List;

public class E26LibroSerializable{
    public static void main(String [] args){

        List<Libro> libro = new ArrayList<>();

        libro.add(new Libro("Brimstone", "Callie Hart", 2026));
        libro.add(new Libro("Cien años de soledad", "Gabriel García Márquez", 1967));
        libro.add(new Libro("1984", "George Orwell", 1949));
        libro.add(new Libro("El resplandor", "Stephen King", 1977));
        libro.add(new Libro("La sombra del viento", "Carlos Ruiz Zafón", 2001));
        libro.add(new Libro("Don Quijote de la Mancha", "Miguel de Cervantes", 1605));

        CrearFichero.crearFichero(libro);
        LeerLibro.leerLibro();
    }
}