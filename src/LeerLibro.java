import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

public class LeerLibro {
    /*public static void leerLibro() {

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("libro.ser"))) {
            List<Libro> libros = (List<Libro>) ois.readObject();

            for (Libro libro : libros) {
                System.out.println("Titulo: " + libro.getTitulo() );
                System.out.println("        Nombre del autor: " + libro.getAutor() );
                System.out.println("                Año de publicación: " + libro.getAnioPublicacion());
            }

        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error al leer el objeto: " + e.getMessage());
        }
    }*/


    public static List<Libro> leerLibro2(String archivo) {

        List<Libro> libros = new ArrayList<>();
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(archivo))) {
            libros = (List<Libro>) ois.readObject();


        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error al leer el objeto: " + e.getMessage());
        }

        return libros;
    }
}