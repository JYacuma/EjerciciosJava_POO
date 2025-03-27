public class Camioneta extends AlquilerdeVehiculos{

    private double CapacidadCarga;

    public Camioneta() {
    }

    public Camioneta(String marca, String modelo, int año, double precioporDia, boolean estadodeDisponibilidad, double capacidadCarga) {
        super(marca, modelo, año, precioporDia, estadodeDisponibilidad);
        CapacidadCarga = capacidadCarga;
    }

    public double getCapacidadCarga() {
        return CapacidadCarga;
    }

    public void setCapacidadCarga(double capacidadCarga) {
        CapacidadCarga = capacidadCarga;
    }

    @Override
    public String toString() {
        return super.toString()+"Camioneta{" +
                "CapacidadCarga=" + CapacidadCarga +
                '}';
    }

    public void MostrarInfo(){
        super.MostrarInfo();
        System.out.println(" CAPACIDAD DE CARGA: " +CapacidadCarga+" Kg");
        System.out.println("|====================================|");
    }

}
