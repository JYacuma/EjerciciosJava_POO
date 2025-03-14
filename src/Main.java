

public class Main {
    public static void main(String[] args) {

        //Objeto 1

        System.out.println("---------");
        System.out.println("LIBRO 1");
        System.out.println("  ");

        Biblioteca libro1= new Biblioteca("Cien años de soledad", "Gabriel García Márquez",
                "Narrativo", "Editorial Sudamericana", 1967, 20);

        System.out.println(libro1.lista("Cien años de soledad"));
        System.out.println("    ");
        libro1.mostrarinfo();
        System.out.println("   ");
        libro1.multa(20,"Cien años de soledad");

        //Objeto 2

        System.out.println("---------");
        System.out.println("LIBRO 2");
        System.out.println("  ");

        Biblioteca libro2= new Biblioteca("A Game of Thrones", "George R. R. Martin",
                "Narrativo", "Bantam Spectra", 1996, 10);

        System.out.println(libro2.lista("A Game of Thrones"));
        System.out.println("    ");
        libro2.mostrarinfo();
        System.out.println("   ");
        libro2.multa(10,"A Game of Thrones");

        //Objeto 3

        System.out.println("---------");
        System.out.println("LIBRO 3");
        System.out.println("  ");

        Biblioteca libro3= new Biblioteca("Dune", "Frank Herbert",
                "Ficcion", "Chilton Books", 1965, 33);

        System.out.println(libro3.lista("Dune"));
        System.out.println("    ");
        libro3.mostrarinfo();
        System.out.println("   ");
        libro3.multa(33,"Dune");












    }
}