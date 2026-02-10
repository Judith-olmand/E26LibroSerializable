- BC3- COLECCIONES, FICHEROS Y ENTRADA/SALIDA
- PERSISTENCIA Y SERIALIZACIÓN

Gestión de Libros con Serialización

Programa en Java que permite gestionar una biblioteca personal mediante la serialización de objetos, permitiendo guardar y recuperar datos en formato binario.

🚀 Funcionalidades
- Persistencia de Objetos: Guarda listas completas de objetos Libro directamente en archivos, preservando su estado y estructura.
- Serialización Binaria: Utiliza flujos de objetos para transformar datos de la memoria a archivos físicos y viceversa.
- Gestión Dinámica: Permite al usuario añadir nuevos libros de forma interactiva y actualizar el archivo de almacenamiento.
- Recuperación Automática: Carga y muestra los datos existentes en el archivo al iniciar el programa.

🛠️ Estructura técnica
- El proyecto implementa la arquitectura de Java para el manejo de objetos persistentes:
- Interfaz Serializable: Implementada en la clase Libro para permitir que sus instancias sean convertidas en flujos de bytes.
- ObjectOutputStream y ObjectInputStream: Clases fundamentales para realizar la escritura y lectura binaria de objetos.
- Diseño Modular: * Libro: Modelo de datos con lógica de comparación (equals y hashCode).
- CrearFichero y LeerLibro: Clases de utilidad para separar la lógica de I/O de la lógica de negocio.
