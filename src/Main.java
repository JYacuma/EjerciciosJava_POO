//lstBanco.size();
//lstBanco.remove();
//lstBanco.add(c1);
//List<CuentaBancaria> lstBanco= new ArrayList<>();
import java.util.*;

//CORRECIONES:
//
//SE CORRIGIO EL ERROR DE LA CREACION DE DOS OBJETOS, SE CREA EL PRIMER OBJETO CON EL CASE 1.
//SE MEJORO EL DISEÑO VISUAL DEL MENU, INFORMACION DE CUENTA(S), RETIRAR Y DEPOSITAR.
//SE AGREGO NUEVOS LIMITES A RETIRAR: MINIMO $10,000 Y NO MAS DEL SUELDO DE LA CUENTA,
//SE CANCELA LA OPCION RETIRAR SI LA CUENTA NO TIENE $10,000 O MAS.
//SE AGREGO NUEVOS LIMITES A DEPOSITAR: MINIMO $10,000 Y NO MAS DE $1,000,000.
//SE AÑADIO UN NUEVO CASE (CASE 6): TRANSFERIR SALDO DE UNA CUENTA A OTRA.
//SE AÑADIO LA OPCION DE CUENTA NO ENCONTARDA, ESTO SE VE EN LOS CASE 3,4,5;
//EL CASE 6 TIENE SU PROPIO METODO PARA MOSTRAR SI UNA O AMBAS CUENTAS NO SE HAN ENCONTRADO.


public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int op;
        double monto;
        int estado=1;
        List<CuentaBancaria> lstBanco= new ArrayList<>();




        do {
            System.out.println(" ");

            System.out.println("""
                    
                    |====================================|
                    |          CUENTA BANCARIA           |
                    |====================================|
                    |                                    |
                    | [1] CREAR CUENTA                   |
                    | [2] MOSTRAR CUENTAS                |
                    | [3] MOSTRAR UNA CUENTA ESPECIFICA  |
                    | [4] DEPOSITAR A UNA CUENTA         |
                    | [5] RETIRAR A UNA CUENTA           |
                    | [6] TRANSFERIR SALDO A UNA CUENTA  |
                    | [7] TERMINAR                       |
                    |                                    |
                    |====================================|
                    """);

            System.out.print("OPCION= ");
            op = teclado.nextInt();
            teclado.nextLine();

            switch (op) {
                case 1 -> {

                    System.out.println("""
                    |====================================|
                    |     INGRESE NOMBRE DEL TITULAR     |
                    |====================================|
                    """);
                    String Titular= teclado.next();

                    System.out.println("""
                    |====================================|
                    |     INGRESE SALDO DEL TITULAR      |
                    |====================================|
                    """);
                    double Saldo= teclado.nextDouble();

                    System.out.println("""
                    |====================================|
                    |      INGRESE NUMERO DE CUENTA      |
                    |====================================|
                    """);
                    String NumrodeCuenta=teclado.next();

                    //c1 = new CuentaBancaria(c1.getTitular(), c1.getSaldo(), c1.getNumrodeCuenta());
                    //lstBanco.add(c1);


                    lstBanco.add(new CuentaBancaria(Titular, Saldo, NumrodeCuenta));

                    estado=1;




                }
                case 2 -> {
                    int contador=1;

                    System.out.println("""
                    |====================================|
                    |     INFORMACION DE LAS CUENTAS     |
                    |====================================|
                    """);
                    for(CuentaBancaria cu: lstBanco){
                        System.out.println(" CUENTA " + contador +":");

                        cu.mostarInfo2();
                        contador++;
                    }
                    System.out.println("PRESIONA 1 PARA VOLVER AL MENU");
                    estado= teclado.nextInt();



                }
                case 3 ->{
                    String nCuneta;
                    boolean cuentaEncontrada = false;

                    do {

                        System.out.println("INGRESE NUMERO DE CUENTA");
                        nCuneta = teclado.next();
                        for (int i = 0; i < lstBanco.size(); i++) {
                            if (lstBanco.get(i).getNumrodeCuenta().equalsIgnoreCase(nCuneta)) {
                                lstBanco.get(i).mostarInfo();
                                cuentaEncontrada = true;
                                break;
                            }
                            if (!cuentaEncontrada) {
                                System.out.println("CUENTA NO ENCONTRADA. INTENTE NUEVAMENTE.");
                            }
                        }
                    }while (!cuentaEncontrada);

                    System.out.println("PRESIONA 1 PARA VOLVER AL MENU");
                    estado= teclado.nextInt();
                    
                }
                case 4 ->{
                    String depositar;
                    boolean cuentaEncontrada = false;
                    System.out.println("""
                    |====================================|
                    |      DEPOSITAR EN UNA CUENTA       |
                    |====================================|
                    | NO SE PERMITE:                     |
                    | DEPOSITOS NEGATIVOS                |
                    | DEPOSITOS MENORES A $10,000        |
                    | DEPOSITOS MAYORES A $10,000,000    |
                    |====================================|
                    """);
                    do {
                        System.out.println("INGRESE NUMERO DE CUENTA");
                        depositar = teclado.next();
                        System.out.println("  ");
                        for (int i = 0; i < lstBanco.size(); i++) {

                            if (lstBanco.get(i).getNumrodeCuenta().equalsIgnoreCase(depositar)) {
                                System.out.println("INGRESE LA CANTIDAD DE DEPOSITO");
                                monto = teclado.nextDouble();
                                if (monto > 9999 && monto <= 10000000) {
                                    lstBanco.get(i).depositarDinero(monto);
                                    System.out.println("TRANSACCION EXITOSA...");
                                    System.out.println("SALDO NUEVO: $" + lstBanco.get(i).getSaldo());

                                } else {
                                    do {
                                        System.out.println("DEPOSITO DENEGADO");
                                        System.out.println(" ");
                                        System.out.println("INGRESE LA CANTIDAD DE DEPOSITO");
                                        monto = teclado.nextDouble();
                                        lstBanco.get(i).depositarDinero(monto);
                                    } while (monto <= 9999 || monto > 10000000);
                                    System.out.println(" ");
                                    System.out.println("TRANSACCION EXITOSA...");
                                    System.out.println("SALDO NUEVO: $" + lstBanco.get(i).getSaldo());


                                }
                                cuentaEncontrada = true;
                                break;

                            }
                            if (!cuentaEncontrada) {
                                System.out.println("CUENTA NO ENCONTRADA. INTENTE NUEVAMENTE.");
                            }
                        }
                    }while (!cuentaEncontrada);
                    System.out.println("   ");
                    System.out.println("PRESIONA 1 PARA VOLVER AL MENU");
                    estado= teclado.nextInt();



                }
                case 5 ->{
                    String retirardinero;
                    boolean cuentaEncontrada = false;
                    System.out.println("""
                    |====================================|
                    |       RETIRAR EN UNA CUENTA        |
                    |====================================|
                    | NO SE PERMITE:                     |
                    | RETIROS NEGATIVOS                  |
                    | RETIROS MENORES A $10,000          |
                    | RETIROS MAYORES AL SALDO           |
                    |====================================|
                    """);
                    do {
                        System.out.println("INGRESE NUMERO DE CUENTA");
                        retirardinero = teclado.next();
                        System.out.println("  ");
                        for (int i = 0; i < lstBanco.size(); i++) {

                            if (lstBanco.get(i).getNumrodeCuenta().equalsIgnoreCase(retirardinero)) {
                                if (lstBanco.get(i).getSaldo() < 10000) {
                                    System.out.println("TRANSACION NO DISPONIBLE");
                                    System.out.println("SALDO DE LA CUENTA: $" + lstBanco.get(i).getSaldo());
                                    System.out.println("RETIRO DISPONIBLE CON UN SALDO MAYOR O IGUAL A $10000");


                                } else {
                                    System.out.println("INGRESE LA CANTIDAD DE RETIRO");
                                    monto = teclado.nextDouble();
                                    if (monto > 9999 && monto <= lstBanco.get(i).getSaldo()) {
                                        lstBanco.get(i).retira(monto);
                                        System.out.println("  ");
                                        System.out.println("TRANSACCION EXITOSA...");
                                        System.out.println("SALDO NUEVO: $" + lstBanco.get(i).getSaldo());
                                    } else {
                                        do {
                                            System.out.println("RETIRO DENEGADO");
                                            System.out.println(" ");
                                            System.out.println("INGRESE LA CANTIDAD DE RETIRO");
                                            monto = teclado.nextDouble();
                                            lstBanco.get(i).retira(monto);
                                        } while (monto <= 9999 && monto >= lstBanco.get(i).getSaldo());
                                        System.out.println(" ");
                                        System.out.println("TRANSACCION EXITOSA...");
                                        System.out.println("SALDO NUEVO: $" + lstBanco.get(i).getSaldo());

                                    }
                                }
                                cuentaEncontrada = true;
                                break;

                            }
                            if (!cuentaEncontrada) {
                                System.out.println("CUENTA NO ENCONTRADA. INTENTE NUEVAMENTE.");
                            }

                        }
                    }while (!cuentaEncontrada);
                    System.out.println("   ");
                    System.out.println("PRESIONA 1 PARA VOLVER AL MENU");
                    estado= teclado.nextInt();



                }
                case 6 ->{
                    String cuentaOrigen;
                    String cuentaDestino;
                    double montoTransferencia;
                    System.out.println("""
                    |====================================|
                    |   TRANSFERIR SALDO A UNA CUENTA    |
                    |====================================|
                    | NO SE PERMITE:                     |
                    | TRANSFERENCIAS NEGATIVAS           |
                    | TRANSFERENCIAS MENORES A $10,000   |
                    | TRANSFERENCIAS MAYORES AL SALDO    |
                    |====================================|
                    """);
                    System.out.println("INGRESE NUMERO DE CUENTA ORIGEN:");
                    cuentaOrigen = teclado.next();
                    System.out.println("INGRESE NUMERO DE CUENTA DESTINO:");
                    cuentaDestino = teclado.next();

                    CuentaBancaria origen = null, destino = null;


                    for (CuentaBancaria cu : lstBanco) {
                        if (cu.getNumrodeCuenta().equalsIgnoreCase(cuentaOrigen)) {
                            origen = cu;
                        }
                        if (cu.getNumrodeCuenta().equalsIgnoreCase(cuentaDestino)) {
                            destino = cu;
                        }
                    }

                    if (origen != null && destino != null) {
                        boolean transferenciaExitosa = false;
                        do {
                            System.out.println("INGRESE MONTO A TRANSFERIR (Mínimo: 10,000):");
                            montoTransferencia = teclado.nextDouble();

                            if (montoTransferencia >= 10000 && montoTransferencia <= origen.getSaldo()) {
                                origen.retira(montoTransferencia);
                                destino.depositarDinero(montoTransferencia);
                                System.out.println("TRANSFERENCIA EXITOSA...");
                                System.out.println("SALDO NUEVO DE LA CUENTA DE ORIGEN: $" + origen.getSaldo());
                                System.out.println("SALDO NUEVO DE LA CUENTA DE DESTINO: $" + origen.getSaldo());

                                transferenciaExitosa = true;
                            } else {
                                System.out.println("""
                                        TRANSFERENCIA DENEGADA:
                                         - El monto debe ser mayor o igual a 10,000.
                                         - El monto no debe exceder el saldo disponible.
                                        INTENTE NUEVAMENTE.
                                        """);
                            }
                        } while (!transferenciaExitosa);
                        System.out.println("TRANSFERENCIA EXITOSA...");
                        System.out.println("SALDO NUEVO DE LA CUENTA DE ORIGEN: $" + origen.getSaldo());
                        System.out.println("SALDO NUEVO DE LA CUENTA DE DESTINO: $" + origen.getSaldo());
                    } else {
                        System.out.println("UNA O AMBAS CUENTAS NO EXISTEN.");
                    }
                    System.out.println("   ");
                    System.out.println("PRESIONA 1 PARA VOLVER AL MENU");
                    estado= teclado.nextInt();


                }
                case 7 ->{
                    System.out.println("SALIENDO..");
                    estado = 2;

                }
                default -> {
                    System.out.println("NUMERO NO VALIDO");
                }



            }
        }while(estado ==1);




    }
}