public class Automovil extends AlquilerdeVehiculos{

    private int Npuertas;

    public Automovil() {
    }

    public Automovil(String marca, String modelo, int año, double precioporDia, boolean estadodeDisponibilidad, int npuertas) {
        super(marca, modelo, año, precioporDia, estadodeDisponibilidad);
        Npuertas = npuertas;
    }

    public int getNpuertas() {
        return Npuertas;
    }

    public void setNpuertas(int npuertas) {
        Npuertas = npuertas;
    }

    @Override
    public String toString() {
        return super.toString()+"Automovil{" +
                "Npuertas=" + Npuertas +
                '}';
    }

    public void MostrarInfo(){
        super.MostrarInfo();
        System.out.println(" NUMERO DE PUERTAS: "+Npuertas);
        System.out.println("|====================================|");
    }
}
