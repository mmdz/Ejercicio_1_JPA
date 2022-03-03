package libreria;

import entidades.Autor;
import entidades.Editorial;
import entidades.Libro;
import java.util.ArrayList;
import java.util.List;
import servicios.AutorServicio;
import servicios.EditorialServicio;
import servicios.LibroServicio;

public class LibreriaMain {

    public static void main(String[] args) {

        try {
            //creo los servicios
            AutorServicio as = new AutorServicio();
            EditorialServicio es = new EditorialServicio();
            LibroServicio ls = new LibroServicio();
            //creo autores
            Autor a1 = new Autor("OscarWilde");
            Autor a2 = new Autor("JaneAusten");
            Autor a3 = new Autor("Cortazar");
            Autor a4 = new Autor("Sabato");
            as.crearAutor(a1);
            as.crearAutor(a2);
            as.crearAutor(a3);
            as.crearAutor(a4);

            //creo editoriales
            Editorial e1 = new Editorial("Planeta");
            Editorial e2 = new Editorial("Adisson");
            Editorial e3 = new Editorial("Puerto");
            es.crearEditorial(e1);
            es.crearEditorial(e2);
            es.crearEditorial(e3);

            //creo Libros
            Libro l1 = new Libro(1000L, "Orgullo", 1850, 100, 50, 25, a2, e1);
            Libro l2 = new Libro(2000L, "Oliver", 1895, 200, 50, 75, a1, e1);
            Libro l3 = new Libro(3000L, "Rayuela", 1948, 300, 50, 45, a3, e3);
            Libro l4 = new Libro(4000L, "Tunel", 1920, 150, 75, 20, a4, e2);
            ls.crearLibro(l1);
            ls.crearLibro(l2);
            ls.crearLibro(l3);
            ls.crearLibro(l4);

            System.out.println("--------");//busca autor
       System.out.println(as.buscarPorNombre("Sabato").toString());
        
        System.out.println("---------");
        System.out.println(ls.buscarLibroPorIsbn(1000L).toString());
        
        System.out.println("---------");
        System.out.println(ls.buscarLibroPorTitulo("Rayuela"));
        
        System.out.println("---------"); //tit, aut, edi
        System.out.println(ls.buscarLibroPorNombreAutor("JaneAusten"));

            System.out.println("---------");

            List<Libro> lista = new ArrayList();
            lista = ls.buscarLibroPorNombreEditorial("Planeta");

            for (int i = 0; i < lista.size(); i++) {
                //System.out.println(lista.get(i).getTitulo().toString());
                System.out.println(lista.get(i).getTitulo().toString());

            }

        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        /*
//1) Crear base de datos Librería
//2) Crear unidad de persistencia
//3) Crear entidades previamente mencionadas ( excepto Préstamo )
//4) Generar las tablas con JPA
//5) Crear servicios previamente mencionados.
//6) Crear los métodos para persistir entidades en la base de datos librería
//7) Crear los métodos para dar de alta/bajo o editar dichas entidades.
//8) Búsqueda de un Autor por nombre.
//9) Búsqueda de un libro por ISBN.
//10) Búsqueda de un libro por Título.
//11) Búsqueda de un libro/s por nombre de Autor.
//12) Búsqueda de un libro/s por nombre de Editorial.
//13) Agregar las siguientes validaciones a todas las funcionalidades de la aplicación:
//• Validar campos obligatorios.
//• No ingresar datos duplicados.
         */
    }

}
