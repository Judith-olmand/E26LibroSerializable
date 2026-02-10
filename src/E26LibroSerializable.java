import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class E26LibroSerializable{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        List<Libro> libro = new ArrayList<>();
        boolean continuar = true;

        libro.add(new Libro("Brimstone", "Callie Hart", 2026));
        libro.add(new Libro("Cien años de soledad", "Gabriel García Márquez", 1967));
        libro.add(new Libro("1984", "George Orwell", 1949));
        libro.add(new Libro("El resplandor", "Stephen King", 1977));
        libro.add(new Libro("La sombra del viento", "Carlos Ruiz Zafón", 2001));
        libro.add(new Libro("Don Quijote de la Mancha", "Miguel de Cervantes", 1605));

        CrearFichero.crearFichero(libro);
        //LeerLibro.leerLibro();


        List<Libro> libros2 = LeerLibro.leerLibro2("libro.ser");
        for (Libro libro1 : libros2) {
            System.out.println(libro1.getTitulo() + libro1.getAutor() + libro1.getAnioPublicacion());
        }

        do {
            System.out.println();
            System.out.println("Añada un titulo");
            String titulo = sc.nextLine();
            System.out.println("Autor");
            String autor = sc.nextLine();
            System.out.println("Año de publicación");
            int anioPublicacion = sc.nextInt();

            libro.add(new Libro(titulo, autor, anioPublicacion));

            System.out.println("¿Quiere añadir más libros?S/N");
            String opcion = sc.nextLine();
            sc.nextLine();

            if(opcion.equalsIgnoreCase("N")){
                continuar = false;
            }

        } while (!continuar);

        System.out.println();

        CrearFichero.crearFichero(libro);
        //LeerLibro.leerLibro();



    }
}