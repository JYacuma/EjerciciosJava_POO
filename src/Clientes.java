public class Clientes {

    private String Nombre;
    private int Cedula;
    private int LicenciaConducir;

    public Clientes() {
    }

    public Clientes(String nombre, int cedula, int licenciaConducir) {
        Nombre = nombre;
        Cedula = cedula;
        LicenciaConducir = licenciaConducir;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public int getCedula() {
        return Cedula;
    }

    public void setCedula(int cedula) {
        Cedula = cedula;
    }

    public int getLicenciaConducir() {
        return LicenciaConducir;
    }

    public void setLicenciaConducir(int licenciaConducir) {
        LicenciaConducir = licenciaConducir;
    }

    @Override
    public String toString() {
        return "Clientes{" +
                "Nombre='" + Nombre + '\'' +
                ", Cedula=" + Cedula +
                ", LicenciaConducir=" + LicenciaConducir +
                '}';
    }

    public void MostrarInfo(){
        System.out.println(" NOMBRE: " +Nombre);
        System.out.println(" CEDULA: " +Cedula);
        System.out.println(" LICENCIA DE CONDUCIR: " +LicenciaConducir);
        System.out.println("|====================================|");

    }
}
