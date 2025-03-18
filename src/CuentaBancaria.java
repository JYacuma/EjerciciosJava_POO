


public class CuentaBancaria {

    private String titular;
    private double saldo;
    private String numrodeCuenta;

    public CuentaBancaria() {
    }

    public CuentaBancaria(String titular, double saldo, String numrodeCuenta) {
        this.titular = titular;
        this.saldo = saldo;
        this.numrodeCuenta = numrodeCuenta;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getNumrodeCuenta() {
        return numrodeCuenta;
    }

    public void setNumrodeCuenta(String numrodeCuenta) {
        this.numrodeCuenta = numrodeCuenta;
    }

    @Override
    public String toString() {
        return "CuentaBancaria{" +
                "titular='" + titular + '\'' +
                ", saldo=" + saldo +
                ", numrodeCuenta='" + numrodeCuenta + '\'' +
                '}';
    }

    public void depositarDinero(double monto){

        this.saldo+=monto;

    }

    public void retira(double monto){
        this.saldo-=monto;
    }

    public void mostarInfo(){
        System.out.println("""
                    |====================================|
                    |      INFORMACION DE LA CUENTA      |
                    |====================================|
                    """);

        System.out.println(" NOMBRE DEL TITULAR: "+ this.titular);
        System.out.println(" SALDO DEL TITULAR: $"+ this.saldo);
        System.out.println(" NUMERO DE CUENTA: "+ this.numrodeCuenta);
        System.out.println("|====================================|");
        System.out.println("   ");

    }

    public void mostarInfo2(){

        System.out.println(" NOMBRE DEL TITULAR: "+ this.titular);
        System.out.println(" SALDO DEL TITULAR: $"+ this.saldo);
        System.out.println(" NUMERO DE CUENTA: "+ this.numrodeCuenta);
        System.out.println("|====================================|");
        System.out.println("   ");

    }

}
