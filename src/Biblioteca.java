import java.util.Random;

//La clase de operaciones sera Biblioteca
public class Biblioteca {

    //Atributos del libro

    private String nombre;
    private String autor;
    private String genero;
    private String editorial;
    private int aniopublicacion;
    private int diasprestados;

    //Costructor Vacio

    public Biblioteca() {
    }

    //Constructor con parametros

    public Biblioteca(String nombre,String autor, String genero, String editorial, int aniopublicacion, int diasprestados) {
        this.nombre = nombre;
        this.genero = genero;
        this.editorial = editorial;
        this.aniopublicacion = aniopublicacion;
        this.diasprestados = diasprestados;
        this.autor= autor;
    }

    //Metodos get y set


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public int getAniopublicacion() {
        return aniopublicacion;
    }

    public void setAniopublicacion(int aniopublicacion) {
        this.aniopublicacion = aniopublicacion;
    }

    public int getDiasprestados() {
        return diasprestados;
    }

    public void setDiasprestados(int diasprestados) {
        this.diasprestados = diasprestados;
    }

    //ToSting

    @Override
    public String toString() {
        return "Biblioteca{" +
                "nombre='" + nombre + '\'' +
                ", autor='" + autor + '\'' +
                ", genero='" + genero + '\'' +
                ", editorial='" + editorial + '\'' +
                ", aniopublicacion=" + aniopublicacion +
                ", diasprestados=" + diasprestados +
                '}';
    }


    //Metodos propios

    //1.Mostrar aelatoriamente n personas que esperar para tener el libro

    public String lista(String nombre){
        int numero;
        int max=10;
        int min=1;
        Random ale1= new Random();
        numero= ale1.nextInt(max- min + 1) +min;
        System.out.println("Numero de reservas:");
        return numero+ " personas han reservado el libro " + "("+nombre+")"+" antes que ti";

    }


    //2.Mostrar Informacion del libro

    public void mostrarinfo(){
        System.out.println("Datos del libro:");
        System.out.println("Nombre: " +nombre);
        System.out.println("Autor: " +autor);
        System.out.println("Genero: " +genero);
        System.out.println("Editorial: " +editorial);
        System.out.println("Año de publicacion: " + aniopublicacion);
        System.out.println("Dias prestados: " + diasprestados);
    }

    //3.Colocar multa si se restrasa en el tiempo de entrega

    public void multa(int diasprestados, String nombre){
        System.out.println("Observacion de multas:");
        if (diasprestados>15){
            int retraso;
            int resultado;
            System.out.println("No entregaste a tiempo el libro: " +nombre);
            System.out.println("La multa es de $4700 por dia.");
            retraso= diasprestados-15;
            System.out.println("Dias retrasados: " + retraso);
            resultado=retraso*4700;
            System.out.println("Multa a pagar: $"+resultado);
        }else{
            System.out.println("Entragaste a tiempo");
            System.out.println("No hay multas");
        }
    }




}
