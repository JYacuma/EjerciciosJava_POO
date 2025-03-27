

import java.util.*;



public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int op;
        int estado = 1;
        String cliente;

        List<AlquilerdeVehiculos> lstAutomovil= new ArrayList<>();
        List<AlquilerdeVehiculos> lstCamioneta= new ArrayList<>();

        List<Clientes> lstcliente= new ArrayList<>();






        do {
            System.out.println(" ");

            System.out.println("""
                    
                    |====================================|
                    |       ALQUILER DE VEHICULOS        |
                    |====================================|
                    |                                    |
                    | [1] EMPLEADO                       |
                    | [2] CLIENTE                        |
                    |====================================|
                    | [3] SALIR                          |
                    |====================================|
                    """);

            System.out.print("OPCION= ");
            op = teclado.nextInt();
            teclado.nextLine();

            switch (op) {
                case 1->{
                    int est1=1;
                    do {
                        int op1;

                        System.out.println("""
                                
                                |====================================|
                                |              EMPLEADO              |
                                |====================================|
                                |                                    |
                                | [1] REGISTRAR VEHICULO             |
                                | [2] VER LISTA DE LOS VEHICULOS     |
                                | [3] VER LISTA DE CLIENTES          |
                                |====================================|
                                | [4] REGRESAR AL MENU PRINCIPAL     |
                                |====================================|
                                """);
                        System.out.print("OPCION= ");
                        op1 = teclado.nextInt();
                        teclado.nextLine();

                        switch (op1) {
                            case 1 -> {
                                int tipo;
                                System.out.println("""
                                |====================================|
                                |        REGISTRAR VEHICULO          |
                                |====================================|
                                | [1] REGISTRAR AUTOMOVIL            |
                                | [2] REGISTRAR CAMIONETA            |
                                |====================================|
                                | [3] CANCELAR REGISTRO              |
                                |====================================|
                                """);
                                System.out.print("OPCION= ");
                                tipo = teclado.nextInt();
                                teclado.nextLine();
                                System.out.println("   ");

                                switch (tipo){
                                    case 1->{
                                        System.out.println("""
                                        |====================================|
                                        |        REGISTRAR AUTOMOVIL         |
                                        |====================================|
                                        """);
                                        System.out.println("INGRESA LA MARCA DEL AUTOMOVIL:");
                                        String Marca= teclado.next();

                                        System.out.println("INGRESA EL MODELO DEL AUTOMOVIL:");
                                        String Modelo= teclado.next();

                                        System.out.println("INGRESA EL AÑO DEL AUTOMOVIL:");
                                        int Anio= teclado.nextInt();

                                        System.out.println("INGRESA EL PRECIO POR DIA DEL AUTOMOVIL:");
                                        double PrecioporDia= teclado.nextDouble();

                                        System.out.println("INGRESA EL NUMERO DE PUERTAS DEL VEHICULO");
                                        int Npuertas= teclado.nextInt();

                                        System.out.println("INGRESA ESTADO DE DISPONIBILIDAD");
                                        boolean EstadodeDisponibilidad= teclado.nextBoolean();

                                        lstAutomovil.add(new Automovil(Marca, Modelo, Anio, PrecioporDia, EstadodeDisponibilidad, Npuertas) );

                                        est1=1;

                                    }
                                    case 2->{
                                        System.out.println("""
                                        |====================================|
                                        |        REGISTRAR CAMIONETA         |
                                        |====================================|
                                        """);
                                        System.out.println("INGRESA LA MARCA DE LA CAMIONETA:");
                                        String Marca= teclado.next();

                                        System.out.println("INGRESA EL MODELO DE LA CAMIONETA:");
                                        String Modelo= teclado.next();

                                        System.out.println("INGRESA EL AÑO DE LA CAMIONETA:");
                                        int Anio= teclado.nextInt();

                                        System.out.println("INGRESA EL PRECIO POR DIA DE LA CAMIONETA:");
                                        double PrecioporDia= teclado.nextDouble();

                                        System.out.println("INGRESA LA CAPACIDA DE CARGA (Kg) DE LA CAMIONETA:");
                                        double CapacidadCarga= teclado.nextDouble();

                                        System.out.println("INGRESA ESTADO DE DISPONIBILIDAD");
                                        boolean EstadodeDisponibilidad= teclado.nextBoolean();

                                        lstCamioneta.add(new Camioneta(Marca, Modelo, Anio, PrecioporDia, EstadodeDisponibilidad,CapacidadCarga));

                                    }
                                    case 3->{
                                        System.out.println("CANCELANDO...");
                                        est1 = 1;

                                    }
                                    default -> {
                                        System.out.println("OPCION NO VALIDA");
                                    }

                                }


                            }
                            case 2->{
                                int contador=1;

                                System.out.println("""
                                |====================================|
                                |    INFORMACION DE LOS VEHICULOS    |
                                |====================================|
                                """);
                                System.out.println("             AUTOMOVILES");
                                System.out.println("|====================================|");

                                for(AlquilerdeVehiculos auto: lstAutomovil){
                                    System.out.println(" VEHICULO " + contador +":");
                                    auto.MostrarInfo();
                                    contador++;
                                }
                                System.out.println("|====================================|");
                                System.out.println("   ");
                                System.out.println("             CAMIONETAS");
                                System.out.println("|====================================|");

                                for(AlquilerdeVehiculos auto: lstCamioneta){
                                    System.out.println(" VEHICULO " + contador +":");
                                    auto.MostrarInfo();
                                    contador++;
                                }
                                System.out.println("PRESIONA 1 PARA VOLVER AL MENU");
                                est1= teclado.nextInt();

                            }


                            case 3 -> { // VER LISTA DE CLIENTES
                            }
                            case 4->{
                                System.out.println("REGRESANDO AL MENU PRINCIPAL...");
                                est1 = 2;

                            }
                            default -> {
                                System.out.println("OPCION NO VALIDA");
                            }
                        }
                    }while(est1==1);

                    estado=1;


                }
                case 2->{
                    int est2=1;
                    do {
                        int op2;
                        System.out.println("""
                        
                        |====================================|
                        |              CLIENTE               |
                        |====================================|
                        |                                    |
                        | [1] CREAR CUENTA                   |
                        | [2] VER ESTADO DE LA CUENTA        |
                        | [3] ALQUILAR VEHICULO              |
                        | [4] PAGAR ALQUILER DEL VEHICULO    |
                        |====================================|
                        | [5] REGRESAR AL MENU PRINCIPAL     |
                        |====================================|
                        """);
                        System.out.print("OPCION= ");
                        op2 = teclado.nextInt();
                        teclado.nextLine();

                        switch (op2){
                            case 1->{
                                System.out.println("""
                                |====================================|
                                |            CREAR CUENTA            |
                                |====================================|
                                """);
                                System.out.println("INGRESE SU NOMBRE:");
                                String Nombre= teclado.next();

                                System.out.println("INGRESE EL NUMERO DE SU CEDULA");
                                int Cedula= teclado.nextInt();

                                System.out.println("INGRESE EL NUMERO DE SU LICENCIA DE CONDUCIR");
                                int LicenciaConducir= teclado.nextInt();

                                lstcliente.add(new Clientes(Nombre, Cedula, LicenciaConducir));

                            }
                            case 2->{
                                int nCliente;
                                boolean nombreConductor = false;
                                System.out.println("  ");
                                do {

                                    System.out.println("INGRESE LA LICENCIA DEL CONDUCIR:");
                                    nCliente= teclado.nextInt();
                                    for (int i = 0; i < lstcliente.size(); i++) {
                                        if (lstcliente.get(i).getLicenciaConducir()==nCliente) {
                                            System.out.println("""
                                            |====================================|
                                            |        ESTADO DE LA CUENTA         |
                                            |====================================|
                                            """);
                                            lstcliente.get(i).MostrarInfo();
                                            nombreConductor = true;
                                            break;
                                        }
                                    }
                                    if (!nombreConductor) {
                                        System.out.println("CUENTA NO ENCONTRADA. INTENTE NUEVAMENTE.");
                                    }
                                }while (!nombreConductor);

                                System.out.println("PRESIONA 1 PARA VOLVER AL MENU");
                                est2= teclado.nextInt();


                            }
                            case 3->{
                                int tipo2;
                                System.out.println("""
                                |====================================|
                                |         ALQUILAR VEHICULO          |
                                |====================================|
                                | [1] ALQUILAR AUTOMOVIL             |
                                | [2] ALQUILAR CAMIONETA             |
                                |====================================|
                                | [3] CANCELAR                       |
                                |====================================|
                                """);
                                System.out.print("OPCION= ");
                                tipo2 = teclado.nextInt();
                                teclado.nextLine();
                                switch (tipo2){
                                    case 1-> {
                                        Clientes cliente1 = null;
                                        System.out.println("  ");
                                        System.out.println("INGRESE LA LICENCIA DEL CONDUCIR:");
                                        int licenciaConductor = teclado.nextInt();

                                        for (Clientes c : lstcliente) {
                                            if (c.getLicenciaConducir() == licenciaConductor) {
                                                cliente1 = c;
                                                break;
                                            }
                                        }

                                        if (cliente1 == null) {
                                            System.out.println("CUENTA NO ENCONTRADA. INTENTE NUEVAMENTE.");
                                            break;
                                        }

                                        System.out.println("""
                                        |====================================|
                                        |      AUTOMOVILES DISPONIBLES       |
                                        |====================================|
                                        """);
                                        int contador = 1;
                                        if (contador>0) {
                                            for (AlquilerdeVehiculos auto : lstAutomovil) {
                                                if (auto.isEstadodeDisponibilidad()) {
                                                    System.out.println(" AUTOMOVIL " + contador);
                                                    auto.MostrarInfo();
                                                    contador++;
                                                }
                                            }
                                            System.out.print(" INGRESA NUMERO DEL VEHICULO: ");
                                            int seleccion = teclado.nextInt();
                                            teclado.nextLine();

                                            if (seleccion < 1 && seleccion >= contador) {
                                                System.out.println(" OPCION NO VALIDA");
                                                break;
                                            }

                                            AlquilerdeVehiculos autoSeleccionado = lstAutomovil.get(seleccion - 1);
                                            if (!autoSeleccionado.isEstadodeDisponibilidad()) {
                                                System.out.println(" AUTOMOVIL NO DISPONIBLE");
                                                break;
                                            }

                                            autoSeleccionado.setEstadodeDisponibilidad(false);
                                            System.out.println(" ALQUILER EXITOSO: " );
                                            System.out.println(" NOMBRE DEL CLIENTE: "+ cliente1.getNombre() );
                                            System.out.println("  ");

                                        }if (contador == 0) { // No hubo vehículos disponibles
                                            System.out.println(" NO HAY AUTOMOVILES DISPONOBLES");
                                            System.out.println(" REGRESA MAS TARDE PARA VER LA DISPONIBILIDAD");

                                            break;
                                        }


                                        System.out.println("PRESIONA 1 PARA VOLVER AL MENU");
                                        est2= teclado.nextInt();


                                    }
                                    case 2->{

                                        Clientes cliente2 = null;
                                        System.out.println("  ");
                                        System.out.println("INGRESE LA LICENCIA DEL CONDUCIR:");
                                        int licenciaConductor = teclado.nextInt();

                                        for (Clientes c : lstcliente) {
                                            if (c.getLicenciaConducir() == licenciaConductor) {
                                                cliente2 = c;
                                                break;
                                            }
                                        }

                                        if (cliente2 == null) {
                                            System.out.println("CUENTA NO ENCONTRADA. INTENTE NUEVAMENTE.");
                                            break;
                                        }

                                        System.out.println("""
                                        |====================================|
                                        |      AUTOMOVILES DISPONIBLES       |
                                        |====================================|
                                        """);
                                        int contador = 1;
                                        if (contador>0) {
                                            for (AlquilerdeVehiculos auto : lstCamioneta) {
                                                if (auto.isEstadodeDisponibilidad()) {
                                                    System.out.println(" CAMIONETA " + contador);
                                                    auto.MostrarInfo();
                                                    contador++;
                                                }
                                            }
                                            System.out.print(" INGRESA NUMERO DEL VEHICULO: ");
                                            int seleccion = teclado.nextInt();
                                            teclado.nextLine();

                                            if (seleccion < 1 && seleccion >= contador) {
                                                System.out.println(" OPCION NO VALIDA");
                                                break;
                                            }

                                            AlquilerdeVehiculos autoSeleccionado = lstCamioneta.get(seleccion - 1);
                                            if (!autoSeleccionado.isEstadodeDisponibilidad()) {
                                                System.out.println(" CAMIONETA NO DISPONIBLE");
                                                break;
                                            }

                                            autoSeleccionado.setEstadodeDisponibilidad(false);
                                            System.out.println(" ALQUILER EXITOSO: " );
                                            System.out.println(" NOMBRE DEL CLIENTE: "+ cliente2.getNombre() );
                                            System.out.println("  ");

                                        }if (contador == 0) {
                                            System.out.println(" NO HAY CAMIONETAS DISPONOBLES");
                                            System.out.println(" REGRESA MAS TARDE PARA VER LA DISPONIBILIDAD");

                                            break;
                                        }


                                        System.out.println("PRESIONA 1 PARA VOLVER AL MENU");
                                        est2= teclado.nextInt();

                                    }
                                    case 3->{
                                        System.out.println("CANCELANDO...");
                                        est2 = 1;
                                    }
                                    default -> {
                                        System.out.println("OPCION NO VALIDA");
                                    }
                                }

                            }
                            case 4 -> {
                                System.out.println("""
                                |====================================|
                                |           PAGAR ALQUILER           |
                                |====================================|
                                """);
                                System.out.println("INGRESE LA LICENCIA DEL CONDUCIR:");
                                int licenciaConductor = teclado.nextInt();

                                Clientes cliente3 = null;
                                for (Clientes c : lstcliente) {
                                    if (c.getLicenciaConducir() == licenciaConductor) {
                                        cliente3 = c;
                                        break;
                                    }
                                }

                                if (cliente3 == null) {
                                    System.out.println("CUENTA NO ENCONTRADA. INTENTE NUEVAMENTE.");
                                    break;
                                }

                                AlquilerdeVehiculos vehiculoRentado = null;
                                for (AlquilerdeVehiculos auto : lstAutomovil) {
                                    if (!auto.isEstadodeDisponibilidad() && cliente3.getLicenciaConducir() == licenciaConductor) {
                                        vehiculoRentado = auto;
                                        break;
                                    }
                                }
                                for (AlquilerdeVehiculos camioneta : lstCamioneta) {
                                    if (!camioneta.isEstadodeDisponibilidad() && cliente3.getLicenciaConducir() == licenciaConductor) {
                                        vehiculoRentado = camioneta;
                                        break;
                                    }
                                }

                                if (vehiculoRentado == null) {
                                    System.out.println("NO TIENE UN VEHÍCULO ALQUILADO.");
                                    break;
                                }

                                System.out.println("INGRESE EL NÚMERO DE DÍAS QUE USÓ EL VEHÍCULO:");
                                int dias = teclado.nextInt();

                                double totalPagar = vehiculoRentado.getPrecioporDia() * dias;
                                if (dias > 7) {
                                    totalPagar *= 0.9;
                                }

                                System.out.println("""
                                |====================================|
                                |             FACTURA                |
                                |====================================|
                                """);
                                System.out.println("CLIENTE: " + cliente3.getNombre());
                                System.out.println("VEHÍCULO: " + vehiculoRentado.getMarca() + " " + vehiculoRentado.getModelo());
                                System.out.println("DÍAS ALQUILADO: " + dias);
                                System.out.println("TOTAL A PAGAR: $" + totalPagar);
                                vehiculoRentado.setEstadodeDisponibilidad(true);
                                System.out.println("PAGO REALIZADO EXITOSAMENTE.");

                            }
                            case 5->{
                                System.out.println("REGRESANDO AL MENU PRINCIPAL...");
                                est2 = 2;
                            }
                            default -> {
                                System.out.println("OPCION NO VALIDA");
                            }

                        }
                    }while (est2==1);
                }
                case 3->{
                    System.out.println("SALIENDO..");
                    estado = 2;

                }
                default -> {
                    System.out.println("OPCION NO VALIDA");
                }

            }


        } while (estado == 1);


    }
}