public class EmpleadoSalarioporHoras extends RegistrodeEmpleados {
    private int HorasTrabajadas;
    private int pagoporhora=98000;


    public EmpleadoSalarioporHoras() {
    }

    public EmpleadoSalarioporHoras(String nombre, int edad, int horasTrabajadas, int pagoporhora) {
        super(nombre, edad);
        this.HorasTrabajadas = horasTrabajadas;
        this.pagoporhora = pagoporhora;

    }

    public int getHorasTrabajadas() {
        return HorasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.HorasTrabajadas = horasTrabajadas;
    }

    public int getPagoporhora() {
        return pagoporhora;
    }

    public void setPagoporhora(int pagoporhora) {
        this.pagoporhora = pagoporhora;
    }


    @Override
    public String toString() {
        return "EmpleadoSalarioporHoras{" +
                "HorasTrabajadas=" + HorasTrabajadas +
                ", pagoporhora=" + pagoporhora +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                '}';
    }

    public void mostarInfo(){
        setPagoporhora(98000);
        super.mostarInfo();
        System.out.println(" PAGO MENSUAL:");
        System.out.println(" HORAS TRABAJADAS= " +HorasTrabajadas);
        System.out.println(" PAGO POR HORA= $" +pagoporhora);
        System.out.println(" SALARIO= $"+(pagoporhora*HorasTrabajadas)*21);
        System.out.println("|====================================|");

    }
}
