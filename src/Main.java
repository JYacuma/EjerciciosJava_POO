
import java.util.*;



public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int op;
        int estado = 1;

        List<RegistrodeEmpleados> lstresgistrofijo = new ArrayList<>();
        List<RegistrodeEmpleados> lstresgistrohoras = new ArrayList<>();



        do {
            System.out.println(" ");

            System.out.println("""
                    
                    |====================================|
                    |       REGISTRO DE EMPLEADOS        |
                    |====================================|
                    |                                    |
                    | [1] REGISTRAR EMPLEADO             |
                    | [2] BUSCAR EMPLEADO                |
                    | [3] MOSTRAR EMPLEADOS REGISTRADOS  |
                    | [4] SALIR                          |
                    |                                    |
                    |====================================|
                    """);

            System.out.print("OPCION= ");
            op = teclado.nextInt();
            teclado.nextLine();

            switch (op) {
                case 1->{
                    int tipo;
                    System.out.println("""
                    |====================================|
                    | [1] EMPLEADO POR SALARIO FIJO      |
                    | [2] EMPLEADO POR SALARIO HORAS     |
                    |====================================|
                    """);
                    System.out.print("OPCION= ");
                    tipo = teclado.nextInt();
                    teclado.nextLine();
                    if(tipo==1) {


                        System.out.println("""
                                |====================================|
                                |    INGRESE NOMBRE DEL EMPLEADO     |
                                |====================================|
                                """);
                        String nombre = teclado.next();

                        System.out.println("""
                                |====================================|
                                |     INGRESE EDAD DEL EMPLEADO      |
                                |====================================|
                                """);
                        int edad = teclado.nextInt();
                        int salariofijo = 2100000;

                        lstresgistrofijo.add(new EmpleadoSalarioFijo(nombre, edad, salariofijo));

                    }if (tipo==2){

                        System.out.println("""
                                |====================================|
                                |    INGRESE NOMBRE DEL EMPLEADO     |
                                |====================================|
                                """);
                        String nombre = teclado.next();

                        System.out.println("""
                                |====================================|
                                |     INGRESE EDAD DEL EMPLEADO      |
                                |====================================|
                                """);
                        int edad = teclado.nextInt();
                        System.out.println("""
                                |====================================|
                                |   INGRESE LAS HORAS DEL EMPLEADO   |
                                |====================================|
                                """);
                        int HorasTrabajadas = teclado.nextInt();
                        int pagoporhora=HorasTrabajadas*98000;




                        lstresgistrohoras.add(new EmpleadoSalarioporHoras(nombre, edad, HorasTrabajadas,pagoporhora));


                    }if(tipo<1 && tipo>2){
                        System.out.println("OPCION NO DISPONIBLE");
                    }

                    estado=1;

                }
                case 2->{
                    String nEmpleado;
                    boolean nombreEmpleado = false;

                    System.out.println("""
                                |====================================|
                                |         DATOS DEL EMPLEADO         |
                                |====================================|
                                """);

                    do {

                        System.out.println("INGRESE EL NOMBRE DEL EMPLEADO");
                        nEmpleado= teclado.next();
                        for (int i = 0; i < lstresgistrofijo.size(); i++) {
                            if (lstresgistrofijo.get(i).getNombre().equalsIgnoreCase(nEmpleado)) {
                                lstresgistrofijo.get(i).mostarInfo();
                                nombreEmpleado = true;
                                break;
                            }
                        }
                        if (!nombreEmpleado) {
                            for (int a = 0; a < lstresgistrohoras.size(); a++) {
                                if (lstresgistrohoras.get(a).getNombre().equalsIgnoreCase(nEmpleado)) {
                                    lstresgistrohoras.get(a).mostarInfo();
                                    nombreEmpleado = true;
                                    break;
                                }
                            }

                        }
                        if (!nombreEmpleado) {
                            System.out.println("NOMBRE DEL EMPLEADO NO ENCONTRADO. INTENTE NUEVAMENTE.");
                        }
                    }while (!nombreEmpleado);

                    System.out.println("PRESIONA 1 PARA VOLVER AL MENU");
                    estado= teclado.nextInt();


                }
                case 3->{
                    int contador=1;

                    System.out.println("""
                    |====================================|
                    |    INFORMACION DE LOS EMPLEADOS    |
                    |====================================|
                    """);
                    System.out.println("      EMPLEADOS CON SALARIO FIJO");
                    System.out.println("|====================================|");

                    for(RegistrodeEmpleados empleado: lstresgistrofijo){
                        System.out.println(" EMPLEADO " + contador +":");
                        empleado.mostarInfo();
                        contador++;
                    }
                    System.out.println("|====================================|");
                    System.out.println("   ");
                    System.out.println("   EMPLEADOS CON SALARIO POR HORAS");
                    System.out.println("|====================================|");

                    for(RegistrodeEmpleados empleado: lstresgistrohoras){
                        System.out.println(" EMPLEADO " + contador +":");
                        empleado.mostarInfo();
                        contador++;
                    }
                    System.out.println("PRESIONA 1 PARA VOLVER AL MENU");
                    estado= teclado.nextInt();


                }
                case 4->{
                    System.out.println("SALIENDO..");
                    estado = 2;

                }
                default -> {
                    System.out.println("NUMERO NO VALIDO");
                }

            }


        } while (estado == 1);


    }
}