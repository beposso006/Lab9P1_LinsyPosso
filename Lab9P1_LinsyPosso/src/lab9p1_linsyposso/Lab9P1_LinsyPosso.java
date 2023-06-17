/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab9p1_linsyposso;
import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author CARMEN POSSO
 */
public class Lab9P1_LinsyPosso {
static Scanner Leer = new Scanner (System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Libros> libros = new ArrayList<>();
       boolean menuPrincipal = true;
       boolean agregarLibroSeleccionado = false;

        while (menuPrincipal) {
            System.out.println("Elija una opción:");
            System.out.println("1. Libros y más Libros");
            System.out.println("2. Salir");
            System.out.print("Opción ingresada: ");
            int opcionMenuPrincipal = Leer.nextInt();
            Leer.nextLine();

            switch (opcionMenuPrincipal) {
                case 1:
                    boolean subMenu = true;

                    while (subMenu) {
                        System.out.println("\nSUBMENÚ:");
                        System.out.println("1. Agregar Libro");
                        System.out.println("2. Listar libros");
                        System.out.println("3. Modificar libro");
                        System.out.println("4. Eliminar libro");
                        System.out.println("5. Buscar libro por título");
                        System.out.println("6. Buscar libros según autor");
                        System.out.println("7. Búsqueda con filtro de género");
                        System.out.print("Opción ingresada: ");
                        int opcionSubMenu = Leer.nextInt();
                        Leer.nextLine();
                        switch (opcionSubMenu) {
                         case 1:
                        System.out.println("Ha elegido la opción para agregar un libro, por favor aporte la información solicitada");
                        System.out.print("Título: ");
                        String Titulo = Leer.next();
                        System.out.print("Autor: ");
                        String NombredeAutor = Leer.next();
                        System.out.print("Género: ");
                        String Genero = Leer.next();
                        System.out.print("Edad minima para leer el libro: ");
                        int Edadmin = Leer.nextInt();
                        Libros libro = new Libros(Titulo, NombredeAutor, Genero, Edadmin);
                        libros.add(libro);
                        System.out.println("Libro agregado exitosamente!");
                        
                        agregarLibroSeleccionado = true; 
                        break;
                        case 2:
                            if (!agregarLibroSeleccionado) {
                                System.out.println("Debe seleccionar la opción 1 antes de acceder a otras opciones.");
                                break;
                            }
                            System.out.println("Libros disponibles: ");
                             for (int i = 0; i < libros.size(); i++) {
                                Libros book = libros.get(i);
                                System.out.println("Libro " + (i + 1));
                                System.out.println("Título: " + book.getTitulo());
                                System.out.println("Autor: " + book.getNombredeAutor());
                                System.out.println("Género: " + book.getGenero());
                                System.out.println("Edad mínima: " + book.getEdadmin());
                            }
                            break;
                        case 3:
                            if (!agregarLibroSeleccionado) {
                                System.out.println("Debe seleccionar la opción 1 antes de acceder a otras opciones.");
                                break;
                            }
                             System.out.println("Ha ingresado la opción de modificar libros, elija el libro que modificara: ");
                             for (int i = 0; i < libros.size(); i++) {
                                Libros book = libros.get(i);
                                System.out.println("Libro " + (i + 1));
                                System.out.println("Título: " + book.getTitulo());
                                System.out.println("Autor: " + book.getNombredeAutor());
                                System.out.println("Género: " + book.getGenero());
                                System.out.println("Edad mínima: " + book.getEdadmin());
                                }
                                System.out.print("Opción ingresada: ");
                                int Modificar = Leer.nextInt();
                                if (Modificar >= 1 && Modificar <= libros.size()) {                        
                                    Libros libroModificar = libros.get(Modificar - 1);
                                    System.out.println("Libro seleccionado: " + Modificar);
                                    System.out.println("¿Qué atributo desea modificar?");
                                    System.out.println("1. Título");
                                    System.out.println("2. Autor");
                                    System.out.println("3. Género");
                                    System.out.println("4. Edad Mínima");
                                    System.out.print("Opción ingresada: ");
                                    int Atributos = Leer.nextInt();
                                    switch (Atributos) {
                                        case 1:
                                            System.out.print("Ingrese el nuevo título del libro: ");
                                            String nuevoTitulo = Leer.nextLine();
                                            libroModificar.setTitulo(nuevoTitulo);
                                            System.out.println("¡Libro modificado exitosamente!");
                                            break;
                                        case 2:
                                            System.out.print("Ingrese el nuevo autor del libro: ");
                                            String nuevoAutor = Leer.nextLine();
                                            libroModificar.setNombredeAutor(nuevoAutor);
                                            System.out.println("¡Libro modificado exitosamente!");
                                            break;
                                        case 3:
                                            System.out.print("Ingrese el nuevo género del libro: ");
                                            String nuevoGenero = Leer.nextLine();
                                            libroModificar.setGenero(nuevoGenero);
                                            System.out.println("¡Libro modificado exitosamente!");
                                            break;
                                        case 4:
                                            System.out.print("Ingrese la nueva edad mínima del libro: ");
                                            int nuevaEdadMinima = Leer.nextInt();
                                            libroModificar.setEdadmin(nuevaEdadMinima);
                                            System.out.println("¡Libro modificado exitosamente!");
                                            break;
                                        default:
                                            System.out.println("Opción inválida. Intente nuevamente.");
                                            break;
                                    } 
                                }     
                        case 4:
                            if (!agregarLibroSeleccionado) {
                                System.out.println("Debe seleccionar la opción 1 antes de acceder a otras opciones.");
                                break;
                            }
                            System.out.println("Ha ingresado la opción de eliminar libros, elija el libro que eliminara: ");
                             for (int i = 0; i < libros.size(); i++) {
                                Libros book = libros.get(i);
                                System.out.println("Libro " + (i + 1));
                                System.out.println("Título: " + book.getTitulo());
                                System.out.println("Autor: " + book.getNombredeAutor());
                                System.out.println("Género: " + book.getGenero());
                                System.out.println("Edad mínima: " + book.getEdadmin());
                                }
                                System.out.print("Opción ingresada: ");
                                int opcionEliminar = Leer.nextInt();
                                Leer.nextLine();

                                if (opcionEliminar >= 1 && opcionEliminar <= libros.size()) {
                                    Libros libroEliminar = libros.get(opcionEliminar - 1);
                                    libros.remove(libroEliminar);
                                    System.out.println("¡Libro eliminado exitosamente!");
                                } else {
                                    System.out.println("Opción inválida. Intente nuevamente.");
                                }
                                break;
                        case 5:
                            if (!agregarLibroSeleccionado) {
                                System.out.println("Debe seleccionar la opción 1 antes de acceder a otras opciones.");
                                break;
                            }
                            System.out.print("\nIngrese el título del libro a buscar: ");
                                String tituloBusqueda = Leer.nextLine();
                                boolean encontradoTitulo = false;
                                for (int i = 0; i < libros.size(); i++) {
                                      Libros book = libros.get(i);
                                       if (book.getTitulo().equalsIgnoreCase(tituloBusqueda)) {
                                        System.out.println("Libro encontrado:");
                                        System.out.println("Título: " + book.getTitulo());
                                        System.out.println("Autor: " + book.getNombredeAutor());
                                        System.out.println("Género: " + book.getGenero());
                                        System.out.println("Edad mínima: " + book.getEdadmin());
                                        encontradoTitulo = true;
                                        break;
                                    }
                                }
                                if (!encontradoTitulo) {
                                    System.out.println("No se encontró ningún libro con ese título.");
                                }
                                break;
                        case 6:
                            if (!agregarLibroSeleccionado) {
                                System.out.println("Debe seleccionar la opción 1 antes de acceder a otras opciones.");
                                break;
                            }
                            System.out.println("Ingrese el autor del libro a buscar: ");
                                String autorBusqueda = Leer.nextLine();
                                boolean encontradoAutor = false;
                                for (int i = 0; i < libros.size(); i++) {
                                    Libros book = libros.get(i);
                                     if (book.getNombredeAutor().equalsIgnoreCase(autorBusqueda)) {                                       
                                        System.out.println("Libro encontrado:");
                                        System.out.println("Título: " + book.getTitulo());
                                        System.out.println("Autor: " + book.getNombredeAutor());
                                        System.out.println("Género: " + book.getGenero());
                                        System.out.println("Edad mínima: " + book.getEdadmin());
                                        encontradoAutor = true;
                                    }
                                }
                                if (!encontradoAutor) {
                                    System.out.println("No se encontraron libros con ese autor.");
                                }
                                break;
                        case 7:
                            if (!agregarLibroSeleccionado) {
                                System.out.println("Debe seleccionar la opción 1 antes de acceder a otras opciones.");
                                break;
                            }
                                System.out.print("\nIngrese el género a buscar: ");
                                String generoBusqueda = Leer.nextLine();
                                boolean encontradoGenero = false;
                                for (int i = 0; i < libros.size(); i++) {
                                    Libros book = libros.get(i);
                                    if (book.getGenero().equalsIgnoreCase(generoBusqueda)) {
                                        System.out.println("Libro encontrado:");
                                        System.out.println("Título: " + book.getTitulo());
                                        System.out.println("Autor: " + book.getNombredeAutor());
                                        System.out.println("Género: " + book.getGenero());
                                        System.out.println("Edad mínima: " + book.getEdadmin());
                                        encontradoGenero = true;
                                    }
                                }
                                if (!encontradoGenero) {
                                    System.out.println("No se encontraron libros con ese género.");
                                }
                                break;
                        }
                    }            
                        case 2:
                            menuPrincipal = false;
                            System.out.println("¡Gracias por usar la aplicación!");
                            break;

                        default:
                            System.out.println("Opción inválida. Intente nuevamente.");
                            break;        
                                                    
    }   
    }
}
    }