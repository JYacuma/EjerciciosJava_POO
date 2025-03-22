public class RegistrodeEmpleados {
    protected String nombre;
    protected int edad;

    public RegistrodeEmpleados() {
    }

    public RegistrodeEmpleados(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "RegistrodeEmpleados{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                '}';
    }

    public void mostarInfo(){
        System.out.println("   ");
        System.out.println(" NOMBRE: "+nombre);
        System.out.println(" EDAD: "+ edad);
    }
}
