import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.List;

public class CrearFichero {
    public static void crearFichero(List<Libro> libro) {

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("libro.ser"))) {
            oos.writeObject(libro);
            System.out.println("Objeto Persona serializado y guardado en persona.ser");

        } catch (IOException e) {
            System.out.println("Error al guardar el objeto: " +
                    e.getMessage());
        }
    }
}
