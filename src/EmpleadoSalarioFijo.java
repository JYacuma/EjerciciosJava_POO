public class EmpleadoSalarioFijo extends RegistrodeEmpleados{
    private int salariofijo;

    public EmpleadoSalarioFijo() {
    }

    public EmpleadoSalarioFijo(String nombre, int edad, int salariofijo) {
        super(nombre, edad);
        this.salariofijo = salariofijo;
    }

    public int getSalariofijo() {
        return salariofijo;
    }

    public void setSalariofijo(int salariofijo) {
        this.salariofijo = salariofijo;
    }

    @Override
    public String toString() {
        return "EmpleadoSalarioFijo{" +
                "salariofijo=" + salariofijo +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                '}';
    }

    public void mostarInfo(){
        setSalariofijo(2100000);
        super.mostarInfo();
        System.out.println(" PAGO MENSUAL:");
        System.out.println(" SALARIO= $" +salariofijo);
        System.out.println("|====================================|");
    }
}
