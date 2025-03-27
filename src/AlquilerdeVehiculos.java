public class AlquilerdeVehiculos {

    protected String Marca;
    protected String Modelo;
    protected int Anio;
    protected double PrecioporDia;
    protected boolean EstadodeDisponibilidad;

    public AlquilerdeVehiculos() {
    }

    public AlquilerdeVehiculos(String marca, String modelo, int anio, double precioporDia, boolean estadodeDisponibilidad) {
        Marca = marca;
        Modelo = modelo;
        Anio = anio;
        PrecioporDia = precioporDia;
        EstadodeDisponibilidad = estadodeDisponibilidad;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String marca) {
        Marca = marca;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String modelo) {
        Modelo = modelo;
    }

    public int getAnio() {
        return Anio;
    }

    public void setAño(int anio) {
        Anio = anio;
    }

    public double getPrecioporDia() {
        return PrecioporDia;
    }

    public void setPrecioporDia(double precioporDia) {
        PrecioporDia = precioporDia;
    }

    public boolean isEstadodeDisponibilidad() {
        return EstadodeDisponibilidad;
    }

    public void setEstadodeDisponibilidad(boolean estadodeDisponibilidad) {
        EstadodeDisponibilidad = estadodeDisponibilidad;
    }

    @Override
    public String toString() {
        return "AlquilerdeVehiculos{" +
                "Marca='" + Marca + '\'' +
                ", Modelo='" + Modelo + '\'' +
                ", Año=" + Anio +
                ", PrecioporDia=" + PrecioporDia +
                ", EstadodeDisponibilidad=" + EstadodeDisponibilidad +
                '}';
    }

    public void MostrarInfo(){
        System.out.println("  ");
        System.out.println(" ESTADO DE DISPONIBILIDAD: " +EstadodeDisponibilidad);
        System.out.println("  ");
        System.out.println(" MARCA: " +Marca);
        System.out.println(" MODELO: " +Modelo);
        System.out.println(" AÑO: " +Anio);
        System.out.println(" PRECIO POR DIA: $" +PrecioporDia);

    }

}
