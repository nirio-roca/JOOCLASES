import java.util.*;

public class PrincipalClases {
    public static void mostrarFlores(List<CFlor> flores){
        System.out.println("ID_FLOR\t\tNOMBRE\t\t\tAROMA\t\t\tCOLOR\t\t\tPRECIO");
        for (CFlor flor: flores) {
            System.out.println(flor.getIDFlor()+"\t\t\t"+flor.getNombre()+"\t\t\t"+
                    flor.getAroma()+"\t\t\t"+
                    flor.getColor()+"\t\t\t"+
                    flor.getPrecio());
        }
    }
    public static void mostrarClientes(List<CCliente> clientes){
        System.out.println("ID\t\tNOMBRE\t\t\tAPELLIDO\t\t\tCORREO\t\t\tGENERO\t\t\tESTADO\t\t\tTIPO DE DOCUMENTO\t\t\tNÚMERO DOCUMENTO");
        for (CCliente cliente: clientes) {
            scan.EscribirLinea(
                    cliente.getIdCliente()+"\t\t"+
                            cliente.getNombres()+"\t\t\t"+
                            cliente.getApellidos()+"\t\t\t"+
                            cliente.getCorreo()+"\t\t\t"+
                            cliente.getTipo()+"\t\t\t"+
                            cliente.getEstado()+"\t\t\t"+
                            cliente.getTipoDocumento()+"\t\t\t"+
                            cliente.getNumDocumento());
        }
    }
    public static void mostrarVendedores(List<CVendedor> Vendedores){
        System.out.println("ID_VENDEDOR\t\tTIPO_DE_DOCUMENTO\t\t\tNÚMERO_DOCUMENTO\t\t\tNOMBRES\t\t\tAPELLIDOS\t\t\tCORREO\t\t\tCONTRASEÑA\t\t\tESTADO");
        for (CVendedor Vendedor: Vendedores) {
            scan.EscribirLinea(
                    Vendedor.getIdVendedor()+"\t\t\t\t"+
                            Vendedor.getTipoDocumento()+"\t\t\t\t\t"+
                            Vendedor.getNumDocumento()+"\t\t\t\t\t\t\t"+
                            Vendedor.getNombres()+"\t\t\t\t"+
                            Vendedor.getApellidos()+"\t\t\t\t\t"+
                            Vendedor.getCorreo()+"\t\t\t\t"+
                            Vendedor.getContrasenia()+"\t\t\t\t"+
                            Vendedor.getEstado());
        }
    }

    public static void mostrarVentas(List<CVenta> Ventas){
        System.out.println("TIPO_DE_DOCUMENTO\t\tNÚMERO_DE_DOCUMENTO\t\t\t\t\tFECHA\t\t\t\t\t\t\t\t\t\tID_VENDEDOR\t\t\tID_CLIENTE\t\t\tPRECIO_TOTAL\t\t\tIGV\t\t\tDESCUENTO\t\t\tESTADO");
        for (CVenta Venta: Ventas) {
            scan.EscribirLinea(
                            Venta.getipoDocumento()+"\t\t\t\t\t"+
                            Venta.getNroDocumento()+"\t\t\t\t\t\t\t\t"+
                            Venta.getFechaVenta()+"\t\t\t\t"+
                            Venta.getIdVendedor()+"\t\t\t\t\t"+
                            Venta.getIdCliente()+"\t\t\t\t"+
                            Venta.getPrecioTotal()+"\t\t\t\t"+
                            Venta.getIgv()+"\t\t\t\t"+
                            Venta.getDescuento()+"\t\t\t\t"+
                            Venta.getEstado());
        }
    }


    public static void mostrarDetalle(List<CDetalleVenta> Detalles){
        System.out.println("ID_DETALLE_VENTA\t\tID_VENTA\t\t\tID_PRODUCTO\t\t\tCANTIDAD\t\t\tDESCUENTO\t\t\tPRECIO");
        for (CDetalleVenta Detalle: Detalles) {
            scan.EscribirLinea(
                    Detalle.getIdDetalleVenta()+"\t\t\t\t\t\t"+
                            Detalle.getIdVenta()+"\t\t\t\t\t\t"+
                            Detalle.getIdProducto()+"\t\t\t\t\t"+
                            Detalle.getCantidad()+"\t\t\t"+
                            Detalle.getDescuento()+"\t\t\t\t"+
                            Detalle.getPrecio());
        }
    }

    public static int menu(String Clase) {
        int opcion = 0;
        boolean verif = true;
        do {
            scan.EscribirLinea("----------------");
            scan.EscribirLinea(" MENÚ "+Clase.toUpperCase()+" ");
            scan.EscribirLinea("----------------");
            scan.EscribirLinea("\t0) Salir al menú principal");
            scan.EscribirLinea("\t1) Añadir       (C) ");
            scan.EscribirLinea("\t2) Mostrar      (R) ");
            scan.EscribirLinea("\t3) Actualizar   (U) ");
            scan.EscribirLinea("\t4) Eliminar     (D) ");
            opcion = scan.Leer("\t>>Elija una opciòn: ");
            scan.EscribirLinea("");
            if (opcion >-1 && opcion <= 4) {
                verif = false;
            } else {

                scan.EscribirLinea("""
                        \t\t----------------
                        \t\t    ERROR: N°2
                        \t\tOPCIÓN NO EXISTE
                        \t\t----------------
                        """);
                verif = true;
            }
        } while (verif);
        return opcion;
    }
    public static int submenuMostraF(){
        int opcion = 0;
        boolean verif = true;
        do {
            System.out.println("  Menu Mostrar Vendedores ");
            System.out.println(" 0- Regresar al menu Vendedores");
            System.out.println(" 1- Mostrar por posicion");
            System.out.println(" 2- Mostrar por nombres y apellidos");
            System.out.println(" 3- Mostrar todos los vendedores");
            opcion = scan.Leer(">>Elija una opciòn: ");
            scan.EscribirLinea("");
            if (opcion >-1 && opcion <= 3) {
                verif = false;
            } else {

                scan.EscribirLinea("""
                        \t\t----------------
                        \t\t    ERROR: N°2
                        \t\tOPCIÓN NO EXISTE
                        \t\t----------------
                        """);
                verif = true;
            }
        } while (verif);
        return opcion;
    }
    public static int EliminarFlor(String nombre, String color, List<CFlor> flores){
        int pos=-1;
        for (CFlor flor : flores) {
            if (flor.getNombre().equals(nombre.toUpperCase()) && flor.getColor().equals(color.toUpperCase())) {
                pos=flores.indexOf(flor);
            }
        }
        return pos;
    }
    public static int EliminarVendedor(String nombre, String apellidos, List<CVendedor> Vendedores){
        int pos=-1;
        for (CVendedor Vendedor : Vendedores) {
            if (Vendedor.getNombres().equals(nombre.toUpperCase()) && Vendedor.getApellidos().equals(apellidos.toUpperCase())) {
                pos=Vendedores.indexOf(Vendedor);
            }
        }
        return pos;
    }
    public static int EliminarCliente(String nombre, String apellidos, List<CCliente> clientes){
        int pos=-1;
        for (CCliente cliente : clientes) {
            if (cliente.getNombres().equals(nombre.toUpperCase()) && cliente.getApellidos().equals(apellidos.toUpperCase())) {
                pos=clientes.indexOf(cliente);
            }
        }
        return pos;
    }
    public static int mostrarFlor(String nombre, String color, List<CFlor> flores){
        int pos = -1;
        for (CFlor flor : flores) {
            if (flor.getNombre().equals(nombre.toUpperCase()) && flor.getColor().equals(color.toUpperCase())) {
                pos=flores.indexOf(flor);
            }
        }
        return pos;
    }
    public static int mostrarCliente(String nombre, String apellidos, List<CCliente> clientes){
        int pos = -1;
        for (CCliente cliente : clientes) {
            if (cliente.getNombres().equals(nombre) && cliente.getApellidos().equals(apellidos)) {
                pos=clientes.indexOf(cliente);
            }
        }
        return pos;
    }
    public static int mostrarVendedor(String nombre, String apellidos, List<CVendedor> Vendedores){
        int pos = -1;
        for (CVendedor Vendedor : Vendedores) {
            if (Vendedor.getNombres().equals(nombre.toUpperCase()) && Vendedor.getApellidos().equals(apellidos.toUpperCase())) {
                pos=Vendedores.indexOf(Vendedor);
            }
        }
        return pos;
    }

    public static int mostrarDetalle(int i, List<CDetalleVenta> Detalles){
        int pos = -1;
        for (CDetalleVenta Detalle : Detalles) {
            if (Detalle.getIdDetalleVenta() == i ) {
                pos=Detalles.indexOf(Detalle);
            }
        }
        return pos;
    }

    public static int menuPrincipal() {
        int opcion = 0;
        boolean verif = true;
        do {
            scan.EscribirLinea("--------------");
            scan.EscribirLinea("MENÚ PRINCIPAL                ");
            scan.EscribirLinea("--------------");
            scan.EscribirLinea("\t0) Salir del programa");
            scan.EscribirLinea("\t1) Gestionar clientes   ");
            scan.EscribirLinea("\t2) Gestionar flores");
            scan.EscribirLinea("\t3) Gestionar vendedores ");
            scan.EscribirLinea("\t4) Gestionar venta ");
            scan.EscribirLinea("\t5) Gestionar detalles venta ");
            opcion = scan.Leer("\t>>Elija una opciòn: ");
            scan.EscribirLinea("");
            if (opcion >-1 && opcion <= 5) {
                verif = false;
            } else {
                scan.EscribirLinea(" Esa opción no existe ");
                verif = true;
            }
        } while (verif);
        return opcion;
    }

    public static boolean existeVendedor(String n,List<CVendedor> Vendedores) {
        boolean flag=false;
        for (CVendedor Vendedor : Vendedores) {
            if (Vendedor.getNumDocumento().equals(n)) {
                flag=true;
            }
        }
        return  flag;
    }

    public static boolean DNIvendedor(String n,List<CVendedor> Vendedores) {
        boolean flag=false;
        for (CVendedor Vendedor : Vendedores) {
            if (Vendedor.getNumDocumento().equals(n)) {
                flag=true;
            }
        }
        return  flag;
    }


    public static boolean validarDuplicados(List<CFlor> flores,String N,String A) {
        boolean flag=false;

        for (CFlor flor : flores) {
            if (flor.getNombre().equals(N) && flor.getColor().equals(A)  ) {
                flag=true;
            }
        }
        return  flag;
    }


    //CLIENTE

    public static int IDflor(int n,List<CFlor> flores){
        int flag=-1;
        for (CFlor flor : flores) {
            if (flor.getIDFlor() == n) {
                flag = flores.indexOf(flor);
                ;
            }
        }
        return  flag;
    }


    public static Boolean DNICliente(String n,List<CCliente> clientes){
        boolean flag=false;
        for (CCliente cliente : clientes) {
            if (cliente.getNumDocumento().equals(n)) {
                flag=true;
            }
        }
        return  flag;
    }



    // VENTAS



    public static int DNIVendedor(int n,List<CVendedor> vendedores){
        int flag=-1;
        for (CVendedor vendedor : vendedores) {
            if (vendedor.getIdVendedor() == n) {
                flag = vendedores.indexOf(vendedor);
                ;
            }
        }
        return  flag;
    }

    public static int DNICliente(int n,List<CCliente> clientes){
        int flag=-1;
        for (CCliente cliente : clientes) {
            if (cliente.getIdCliente() == n) {
                flag = clientes.indexOf(cliente);
            }
        }
        return  flag;
    }

    public static String ingresarNumDocVenta(){
        System.out.print("Num Documento: ");
        return new Scanner(System.in).nextLine();
    }



    public static double descuetoGlobal(){
        System.out.print("Ingrese el monto de descuento: ");
        return new Scanner(System.in).nextDouble();
    }

    public static void mostrarDetalleVenta(int idVenta,List<CDetalleVenta> Detalles){
        System.out.println("tID\tIDV\tIDP\tCant\tDes\tPre");
        for (CDetalleVenta dv: Detalles) {
            if(dv.getIdVenta()==idVenta)
                dv.mostrarLista();
        }
    }





    //DETALLES CORRESPONDE

    public  static int existeIDflor(int IDf,List<CFlor> flores){
        int ID=-1;

        for (CFlor flor : flores) {
            if (flor.getIDFlor() == IDf) {
                ID=flores.indexOf(flor);
            }
        }

        return ID;
    }


    public static void main(String[] args) {
        List<CCliente> clientes = new ArrayList<CCliente>();
        List<CFlor> flores = new ArrayList<CFlor>();
        List<CVendedor> Vendedores = new ArrayList<CVendedor>();
        List<CDetalleVenta> Detalles = new ArrayList<CDetalleVenta>();
        List<CVenta> Ventas = new ArrayList<CVenta>();
        List<CFlor> floresVendidas = new ArrayList<CFlor>();
        CFlor flor = null;
        CCliente cliente = null;
        CVendedor Vendedor = null;
        CVenta Venta = null;
        boolean flagmain=true;

        do {
            int opcionmain = menuPrincipal();
            int countCliente = 0;
            int countVendedor = 0;
            scan.EscribirLinea("" + countVendedor);
            int countDetalle = 0;
            int countFlor = 0;
            int countVenta = 0;
            switch (opcionmain) {
                case 0:
                    scan.EscribirLinea("SALIENDO DEL PROGRAMA");
                    flagmain = false;
                    break;
                case 1:
                    scan.EscribirLinea(" >>GESTIONANDO CLIENTES");
                    scan.EscribirLinea("");
                    boolean flagCliente = true;
                    do {
                        int opcion = menu("cliente");
                        switch (opcion) {
                            case 0:
                                scan.EscribirLinea("SALIENDO DEL MENÚ :)");
                                flagCliente = false;
                                break;
                            case 1:
                                scan.EscribirLinea(" - CREATE / CREAR - ");

                                boolean flagC = true;
                                do {
                                    scan.EscribirLinea("Cliente datos: ");
                                    cliente = new CCliente(countCliente);
                                    String DNI = cliente.getNumDocumento();
                                    if (DNICliente(DNI, clientes)) {
                                        scan.EscribirLinea("");
                                        scan.EscribirLinea("Cliente existente:\n Ingrese Nuevamente: ");
                                        scan.EscribirLinea("");
                                        flagC = true;
                                    } else {
                                        scan.EscribirLinea("");
                                        scan.EscribirLinea("Cliente añadido");
                                        scan.EscribirLinea("");
                                        countCliente++;
                                        clientes.add(cliente);
                                        flagC = false;
                                    }
                                } while (flagC);

                                break;
                            case 2:
                                scan.EscribirLinea(" - READ / LEER - ");
                                scan.EscribirLinea(" ");
                                scan.EscribirLinea("  Menu Mostrar Cliente ");
                                System.out.println(" 0- Regresar al menu Clientes");
                                System.out.println(" 1- Mostrar por posicion");
                                System.out.println(" 2- Mostrar por nombre y apellidos");
                                System.out.println(" 3- Mostrar todos las clientes");
                                int opcionMostrarClientes = scan.Leer("    Ingrese una opción: ");
                                switch (opcionMostrarClientes) {
                                    case 0:
                                        System.out.println(" ... Regresando al Menu cliente");
                                        break;
                                    case 1:
                                        System.out.print("Ingrese la posicion de la cliente buscado: ");

                                        int posicionCl = new Scanner(System.in).nextInt();
                                        int tamaño = clientes.size();
                                        scan.EscribirLinea("");
                                        if (posicionCl <= tamaño && posicionCl >= 0) {
                                            scan.EscribirLinea("El Cliente en la " + posicionCl + " es: ");

                                            clientes.get(posicionCl).mostrar();
                                        } else {
                                            scan.EscribirLinea(" Este elemento no existe");
                                        }
                                        break;
                                    case 2:
                                        scan.EscribirLinea("");

                                        System.out.println("Mostrar por nombre y apellidos: ");

                                        System.out.print("Nombre: ");
                                        String n = new Scanner(System.in).nextLine().toUpperCase();
                                        System.out.print("Apellidos: ");
                                        String a = new Scanner(System.in).nextLine().toUpperCase();

                                        int posicionC = mostrarCliente(n, a, clientes);
                                        scan.EscribirLinea("");
                                        if (posicionC == -1) {
                                            scan.EscribirLinea(" Este elemento no existe");
                                        } else {
                                            scan.EscribirLinea("El Cliente con el " + n + " y el apellido " + a + " es: ");
                                            clientes.get(posicionC).mostrar();
                                        }
                                        break;
                                    case 3:
                                        mostrarClientes(clientes);
                                        break;
                                    default:
                                        scan.EscribirLinea(" No existe esa opción ");
                                        break;
                                }
                                break;
                            case 3:
                                scan.EscribirLinea(" - UPDATE / ACTUALIZAR - ");
                                System.out.println("  Menu actualizar Clientes ");
                                System.out.println(" 0- Regresar al menu Clientes");
                                System.out.println(" 1- Actualizar un campo");
                                System.out.println(" 2- Actualizar todo");
                                int opcionActualizarCliente = scan.Leer("    Ingrese una opción: ");
                                switch (opcionActualizarCliente) {
                                    case 0:
                                        System.out.println(" ... Regresando al menu Clientes");
                                        break;
                                    case 1:
                                        scan.EscribirLinea("");
                                        scan.EscribirLinea("Actualizando un campo ");
                                        System.out.print("Ingrese la posicion a actualizar: ");
                                        int pos = new Scanner(System.in).nextInt();
                                        scan.EscribirLinea("");
                                        scan.EscribirLinea("-----------------------");
                                        System.out.println("Sub menú actualizar por campo ");
                                        scan.EscribirLinea("-----------------------");
                                        System.out.println(" 1- ID de cliente");
                                        System.out.println(" 2- Nombres ");
                                        System.out.println(" 3- Apellidos");
                                        System.out.println(" 4- Tipo de documento y número de documento");
                                        System.out.println(" 5- Correo");
                                        System.out.println(" 6- Tipo");
                                        System.out.println(" 7- Estado");
                                        int submenuActualiza = scan.Leer("  Ingrese campo que desea actualizar: ");
                                        cliente = (CCliente) clientes.get(pos);
                                        switch (submenuActualiza) {
                                            case 1:
                                                cliente.setIdCliente(scan.Leer("Nuevo ID: "));
                                                break;
                                            case 2:
                                                scan.Escribir("Nuevo nombres: ");
                                                cliente.setNombres(new Scanner(System.in).nextLine().toUpperCase());
                                                break;
                                            case 3:
                                                scan.Escribir("Nuevo apellidos: ");
                                                cliente.setApellidos(new Scanner(System.in).nextLine().toUpperCase());
                                                break;
                                            case 4:
                                                scan.Escribir("Nuevo Tipo de documento y número de documento: ");
                                                String TdocC = " ";
                                                String NducC = " ";
                                                boolean flagtipo = true;
                                                do {
                                                    System.out.println("Seleccione tipo de documento:");
                                                    System.out.println("  (A) DNI        (B) CARNET EXTRANJERIA ");
                                                    scan.Escribir("Eliga una opción: ");
                                                    TdocC = new Scanner(System.in).next(); // Factura | Boleta

                                                    if (TdocC.toUpperCase().equals("A")) {
                                                        TdocC = "DNI";

                                                        scan.Escribir("Ingrese el número del dni: ");
                                                        boolean flag = true;
                                                        do {
                                                            NducC = new Scanner(System.in).next();

                                                            if (NducC.length() == 8) {
                                                                flag = false;
                                                            } else {
                                                                scan.Escribir("Error: Ingrese de nuevo: ");
                                                                flag = true;
                                                            }
                                                        } while (flag);
                                                        flagtipo = false;
                                                    } else if (TdocC.toUpperCase().equals("B")) {
                                                        TdocC = "CARNET EXTRANJERIA";

                                                        scan.Escribir("Ingrese el número del carnet extranjeria: ");

                                                        boolean flag = true;
                                                        do {
                                                            NducC = new Scanner(System.in).next();

                                                            if (NducC.length() == 12) {
                                                                flag = false;
                                                            } else {
                                                                scan.Escribir("Error: Ingrese de nuevo: ");
                                                                flag = true;
                                                            }
                                                        } while (flag);
                                                        flagtipo = false;

                                                        flagtipo = false;
                                                    } else {
                                                        System.out.println("Error ...");
                                                        flagtipo = true;
                                                    }
                                                } while (flagtipo);
                                                cliente.setTipoDocumento(TdocC);
                                                cliente.setNumDocumento(NducC);
                                                break;
                                            case 5:
                                                scan.Escribir("Nuevo Correo: ");
                                                cliente.setCorreo(new Scanner(System.in).nextLine().toUpperCase());
                                                break;
                                            case 6:
                                                scan.Escribir("Nuevo Tipo: ");
                                                cliente.setTipo(new Scanner(System.in).nextLine().toUpperCase());
                                                break;
                                            case 7:
                                                scan.Escribir("Nuevo Estado: ");
                                                cliente.setEstado(new Scanner(System.in).nextLine().toUpperCase());
                                                break;
                                            default:
                                                scan.EscribirLinea(" No existe esa opción ");
                                                break;
                                        }
                                        break;
                                    case 2:
                                        scan.EscribirLinea("Actualizando todo ");
                                        int tamamoAct = clientes.size();
                                        for (int i = 0; i < tamamoAct; i++) {
                                            cliente = new CCliente(i);
                                            scan.EscribirLinea("");
                                            clientes.set(i, cliente);
                                        }
                                        break;
                                    default:
                                        scan.EscribirLinea(" No existe esa opción ");
                                        break;
                                }
                                break;
                            case 4:
                                scan.EscribirLinea(" - DELETE / ELIMINAR - ");
                                System.out.println("  Menu Eliminar Clientes");
                                System.out.println(" 0- Regresar al menu Clientes");
                                System.out.println(" 1- Eliminar por posicion");
                                System.out.println(" 2- Eliminar por nombres y apellidos");
                                System.out.println(" 3- Eliminar todo lo clientes");
                                int opcionDelte = scan.Leer("Ingrese una opcion: ");
                                switch (opcionDelte) {
                                    case 0:
                                        System.out.println(" ... Regresando al menu Clientes");
                                        break;
                                    case 1:
                                        scan.EscribirLinea(" ");
                                        scan.EscribirLinea("Eliminar por posicion");
                                        int tamañoDC = clientes.size();
                                        int pos = scan.Leer("Ingrese la posicion a Eliminar: ");
                                        if (pos <= tamañoDC && pos >= 0) {
                                            scan.EscribirLinea("EL Cliente en la posición " + pos + " ha sido eliminado: ");

                                            clientes.remove((pos));
                                        } else {
                                            scan.EscribirLinea(" Este elemento no existe");
                                        }
                                        break;
                                    case 2:
                                        scan.EscribirLinea(" ");
                                        System.out.println(" Eliminar por nombres y apellidos");
                                        boolean flagDele = true;
                                        do {
                                            scan.EscribirLinea(" ");
                                            scan.Escribir("Ingrese el nombre: ");
                                            String Nombre = new Scanner(System.in).nextLine().toUpperCase();
                                            scan.Escribir("Ingrese el apellidos: ");
                                            String apellidos = new Scanner(System.in).nextLine().toUpperCase();

                                            int posicion = EliminarCliente(Nombre, apellidos, clientes);
                                            if (posicion == -1) {
                                                scan.EscribirLinea("El cliente no existe ");
                                                flagDele = true;
                                            } else {
                                                scan.EscribirLinea("EL Cliente con los nombres " + Nombre + " y apellidos " + apellidos + " ha sido eliminado: ");

                                                clientes.remove(posicion);
                                                flagDele = false;
                                            }
                                        } while (flagDele);
                                        break;
                                    case 3:
                                        scan.EscribirLinea("Eliminando todo");
                                        clientes.clear();
                                        break;
                                    default:
                                        scan.EscribirLinea(" ");
                                        scan.EscribirLinea("No existe esa opción");
                                        break;
                                }
                                break;
                            default:
                                scan.EscribirLinea(" No existe esa opción ");
                                break;
                        }
                    } while (flagCliente);
                    break;
                case 2:
                    scan.EscribirLinea(" >>GESTIONANDO FLORES");
                    scan.EscribirLinea("");
                    boolean verif = true;
                    do {
                        int opcion = menu("flores");
                        switch (opcion) {
                            case 0:
                                scan.EscribirLinea(" REGRESANDO AL MENÚ PRNCIPAL :)");
                                verif = false;
                                break;
                            case 1:
                                scan.EscribirLinea(" * CREATE / CREAR  * ");

                                boolean flagFlor = true;
                                do {
                                    scan.EscribirLinea("  Ingrese los datos flores: ");
                                    flor = new CFlor(countFlor);
                                    String Nombre = flor.getNombre();
                                    String Color = flor.getColor();
                                    if (validarDuplicados(flores, Nombre, Color)) {
                                        scan.EscribirLinea(" << Flor ya existe ");
                                        scan.EscribirLinea("-- ingrese nuevamente --");
                                        flagFlor = true;
                                    } else {
                                        scan.EscribirLinea("\nFlor añadido\n");
                                        flores.add(flor);
                                        countFlor++;
                                        flagFlor = false;
                                    }
                                } while (flagFlor);
                                break;
                            case 2:
                                scan.EscribirLinea(" * READ / LEER  * ");
                                System.out.println("  Menu Mostrar Flores ");
                                System.out.println(" 0- Regresar al menu Flores");
                                System.out.println(" 1- Mostrar por posicion");
                                System.out.println(" 2- Mostrar por nombre y color");
                                System.out.println(" 3- Mostrar todas las Flores");
                                int submenuMotrar = scan.Leer("Elija una opción: ");
                                switch (submenuMotrar) {
                                    case 0:
                                        scan.EscribirLinea("... Regresando al Menu Flores");
                                        break;
                                    case 1:
                                        scan.EscribirLinea("");
                                        System.out.println("Mostrar por posicion");
                                        int posicionflor = scan.Leer("Ingrese la posicion de la flor buscada: ");
                                        scan.EscribirLinea("");
                                        int tamaño = flores.size();
                                        if (posicionflor <= tamaño && posicionflor >= 0) {
                                            scan.EscribirLinea("La flor en la posición " + posicionflor + "  es: ");
                                            flores.get(posicionflor).mostrar();
                                        } else {
                                            scan.EscribirLinea(" Este elemento no existe");
                                        }

                                        break;
                                    case 2:
                                        scan.EscribirLinea(" ");
                                        System.out.println(" Mostrar por nombre y color");
                                        scan.Escribir("Ingrese el nombre: ");
                                        String Nombre = new Scanner(System.in).nextLine().toUpperCase();
                                        scan.Escribir("Ingrese el color: ");
                                        String Color = new Scanner(System.in).nextLine().toUpperCase();

                                        int sizeflor = flores.size();
                                        int posicion = mostrarFlor(Nombre, Color, flores);
                                        if (posicion == -1) {
                                            scan.EscribirLinea(" Este elemento no existe");
                                        } else {
                                            scan.EscribirLinea("La flor con el " + Nombre + " y el Color " + Color + " es: ");
                                            flores.get(posicion).mostrar();
                                        }
                                        break;
                                    case 3:
                                        scan.EscribirLinea("Mostrar todo");
                                        mostrarFlores(flores);
                                        break;
                                    default:
                                        scan.EscribirLinea("Esa opción no existe");
                                        break;
                                }

                                break;
                            case 3:
                                scan.EscribirLinea(" - UPDATE / ACTUALIZAR - ");
                                System.out.println("  Menu Mostrar Flor ");
                                System.out.println(" 0- Regresar al menu Flores");
                                System.out.println(" 1- Actualizar un campo");
                                System.out.println(" 2- Actualizar todo");
                                System.out.print("   Ingrese una opcion:  ");
                                int opcionActualizarFlor = new Scanner(System.in).nextInt();
                                switch (opcionActualizarFlor) {
                                    case 0:
                                        System.out.println(" ... Regresando al menu Flores");
                                        break;
                                    case 1:
                                        scan.EscribirLinea("");
                                        System.out.println("Actualizar un campo");
                                        int pos = scan.Leer("Ingrese la posicion a actualizar: ");
                                        scan.EscribirLinea("-----------------------");
                                        System.out.println("Sub menú actualizar por campo ");
                                        scan.EscribirLinea("-----------------------");
                                        System.out.println(" 1- Nombre");
                                        System.out.println(" 2- Aroma ");
                                        System.out.println(" 3- Color");
                                        System.out.println(" 4- Precio");
                                        int submenuFlor = scan.Leer("  Ingrese campo que desea actualizar: ");
                                        flor = (CFlor) flores.get(pos);
                                        switch (submenuFlor) {
                                            case 1:
                                                System.out.print("Nuevo nombre: ");
                                                flor.setNombre(new Scanner(System.in).nextLine().toUpperCase());
                                                break;
                                            case 2:
                                                System.out.print("Nuevo aroma: ");
                                                flor.setAroma(new Scanner(System.in).nextLine().toUpperCase());
                                                break;
                                            case 3:
                                                System.out.print("Nuevo color: ");
                                                flor.setColor(new Scanner(System.in).nextLine().toUpperCase());
                                                break;
                                            case 4:
                                                flor.setPrecio(scan.Leer("Nuevo precio: "));
                                                break;
                                            default:
                                                scan.EscribirLinea("Esa opción no existe");
                                                break;
                                        }
                                        break;
                                    case 2:
                                        int tamaño = flores.size();
                                        scan.EscribirLinea("Actualizando todo");

                                        for (int i = 0; i < tamaño; i++) {
                                            scan.EscribirLinea(" ");
                                            flor = new CFlor(i);
                                            flores.set(i, flor);
                                        }
                                        break;
                                    default:
                                        scan.EscribirLinea(" ");
                                        scan.EscribirLinea("No existe esa opción");
                                        break;
                                }
                                break;
                            case 4:
                                scan.EscribirLinea(" * DELETE / ELIMINAR * ");
                                System.out.println("  Menu Mostrar Flor ");
                                System.out.println(" 0- Regresar al menu Flores");
                                System.out.println(" 1- Eliminar por posicion");
                                System.out.println(" 2- Eliminar por nombre y color");
                                System.out.println(" 3- Eliminar todas las flores");
                                int opcionDelte = scan.Leer("Ingrese una opcion: ");
                                switch (opcionDelte) {
                                    case 0:
                                        System.out.println(" ... Regresando al menu Flores");
                                        break;
                                    case 1:
                                        scan.EscribirLinea(" ");
                                        scan.EscribirLinea("Eliminar por posicion");
                                        int lengethList = flores.size();
                                        int pos = scan.Leer("Ingrese la posicion a Eliminar: ");
                                        if (pos <= lengethList && pos >= 0) {
                                            scan.EscribirLinea("La flor en la posición " + pos + "ha sido eliminado: ");
                                            flores.remove((pos));
                                        } else {
                                            scan.EscribirLinea("Este elemento no existe");
                                        }
                                        break;
                                    case 2:
                                        scan.EscribirLinea(" ");
                                        System.out.println(" Eliminar por nombre y color");
                                        scan.Escribir("Ingrese el nombre: ");
                                        String Nombre = new Scanner(System.in).nextLine().toUpperCase();
                                        scan.Escribir("Ingrese el color: ");
                                        String Color = new Scanner(System.in).nextLine().toUpperCase();


                                        int posiciondelete = EliminarFlor(Nombre, Color, flores);
                                        if (posiciondelete == -1) {
                                            scan.EscribirLinea("La flor con el nombre " + Nombre + " y color " + Color + " ha sido eliminado: ");
                                            scan.EscribirLinea("Este elemento no existe");
                                        } else {
                                            flores.remove(posiciondelete);
                                        }
                                        break;
                                    case 3:
                                        int tamañod = flores.size();
                                        scan.EscribirLinea("Eliminando todo");
                                        flores.clear();
                                        break;
                                    default:
                                        scan.EscribirLinea(" ");
                                        scan.EscribirLinea("No existe esa opción");
                                        break;
                                }
                                break;
                        }
                    } while (verif);
                    break;
                case 3:
                    scan.EscribirLinea(" >>GESTIONANDO VENDEDORES");
                    boolean flagVendedor = true;
                    do {
                        int opcionvendedor = menu("vendedores");
                        switch (opcionvendedor) {
                            case 0:
                                scan.EscribirLinea("SALIENDO AL MENÚ PRINCIPAL :)");
                                flagVendedor = false;
                                break;
                            case 1:
                                scan.EscribirLinea("- CREATE / CREAR - ");
                                scan.EscribirLinea("");
                                boolean flagC = true;
                                do {
                                    scan.EscribirLinea("Vendedor datos: ");
                                    Vendedor = new CVendedor(countVendedor);
                                    String DNIV = Vendedor.getNumDocumento();
                                    if (DNIvendedor(DNIV, Vendedores)) {
                                        scan.EscribirLinea("");
                                        scan.EscribirLinea("Vendedor existente:\n Ingrese Nuevamente: ");
                                        scan.EscribirLinea("");
                                        flagC = true;
                                    } else {
                                        scan.EscribirLinea("");
                                        scan.EscribirLinea("Vendedor añadido");
                                        scan.EscribirLinea("");
                                        countVendedor++;
                                        Vendedores.add(Vendedor);
                                        flagC = false;
                                    }
                                } while (flagC);
                                break;
                            case 2:
                                scan.EscribirLinea(" - READ / LEER  - ");
                                System.out.println("  Menu Mostrar Vendedores ");
                                System.out.println(" 0- Regresar al menu Vendedores");
                                System.out.println(" 1- Mostrar por posicion");
                                System.out.println(" 2- Mostrar por nombres y apellidos");
                                System.out.println(" 3- Mostrar todos los vendedores");
                                int opcionMVe = scan.Leer("Ingrese una opcion: ");
                                switch (opcionMVe) {
                                    case 0:
                                        System.out.println(" ... Regresando al Menu Vendedores");
                                        break;
                                    case 1:
                                        scan.EscribirLinea("");
                                        System.out.println("Mostrar por posicion");
                                        int posicion = scan.Leer("Ingrese la posicion del Vendedor buscada: ");
                                        int tamaño = Vendedores.size();
                                        if (posicion <= tamaño && posicion >= 0) {
                                            scan.EscribirLinea("El Vendedor en la posición " + posicion + " es: ");
                                            Vendedores.get(posicion).mostrar();
                                        } else {
                                            scan.EscribirLinea("Este elemento no existe");
                                        }
                                        break;
                                    case 2:
                                        scan.EscribirLinea("");
                                        System.out.println("Mostrar por nombres y apellidos");
                                        System.out.print("Nombres: ");
                                        String n = new Scanner(System.in).nextLine().toUpperCase();
                                        System.out.print("apellidos: ");
                                        String c = new Scanner(System.in).nextLine().toUpperCase();
                                        int pos = mostrarVendedor(n, c, Vendedores);
                                        if (pos == -1) {
                                            scan.EscribirLinea("Este elemento no existe");

                                        } else {
                                            scan.EscribirLinea("El Vendedor con el " + n + " y el apellido " + c + " es: ");
                                            Vendedores.get(pos).mostrar();
                                        }
                                        break;
                                    case 3:
                                        System.out.println("Mostrar todos los vendedores");
                                        mostrarVendedores(Vendedores);
                                        break;
                                }
                                break;
                            case 3:
                                scan.EscribirLinea(" - UPDATE / ACTUALIZAR - ");

                                System.out.println("  Menu Mostrar Vendedor ");
                                System.out.println(" 0- Regresar al menu Vendedor");
                                System.out.println(" 1- Actualizar un campo");
                                System.out.println(" 2- Actualizar todo");
                                int opcionActualizarFlor = scan.Leer("   Ingrese una opción: ");
                                switch (opcionActualizarFlor) {
                                    case 0:
                                        System.out.println(" ... Regresando al menu Vendedor");
                                        break;
                                    case 1:
                                        scan.EscribirLinea("");
                                        System.out.println("Actualizar un campo");

                                        int pos = scan.Leer("Ingrese la posicion a actualizar: ");
                                        scan.EscribirLinea("""
                                                        SUB MENU DE CAMPOS ACTUALIZAR VENDEDORES
                                                   0- Id vendedor
                                                   1- tipo Documento y número de documento
                                                   2- Nombres
                                                   3- Apellidos
                                                   4- Correo
                                                   5- Contraseña
                                                   6- Estado
                                                """);

                                        int campo = scan.Leer("  Ingrese campo que desea actualizar:");
                                        Vendedor = (CVendedor) Vendedores.get(pos);
                                        switch (campo) {
                                            case 0:
                                                Vendedor.setIdVendedor(scan.Leer("Nuevo Id vendedor:"));
                                                break;
                                            case 1:
                                                System.out.print("Nuevo tipo Documento y número de documento: ");
                                                String Tdoc = " ";
                                                String Nduc = " ";
                                                boolean flagtipo = true;
                                                do {
                                                    System.out.println("Seleccione tipo de documento:");
                                                    System.out.println("  (A) DNI        (B) CARNET EXTRANJERIA ");
                                                    scan.Escribir("Eliga una opción: ");
                                                    Tdoc = new Scanner(System.in).next(); // Factura | Boleta

                                                    if (Tdoc.toUpperCase().equals("A")) {
                                                        Tdoc = "DNI";

                                                        scan.Escribir("Ingrese el número del dni: ");

                                                        boolean flag = true;
                                                        do {
                                                            Nduc = new Scanner(System.in).next();

                                                            if (Nduc.length() == 8) {
                                                                if (existeVendedor(Nduc, Vendedores)) {
                                                                    scan.Escribir("Ya existe DNI: Ingrese de nuevo DNI: ");
                                                                    flag = true;
                                                                } else {
                                                                    flag = false;
                                                                }
                                                            } else {
                                                                scan.Escribir("Error: Ingrese de nuevo: ");
                                                                flag = true;
                                                            }
                                                        } while (flag);
                                                        flagtipo = false;
                                                    } else if (Tdoc.toUpperCase().equals("B")) {
                                                        Tdoc = "CARNET EXTRANJERIA";

                                                        scan.Escribir("Ingrese el número del carnet extranjeria: ");

                                                        boolean flag = true;
                                                        do {
                                                            Nduc = new Scanner(System.in).next();

                                                            if (Nduc.length() == 12) {
                                                                if (existeVendedor(Nduc, Vendedores)) {
                                                                    scan.Escribir("Ya existe CARNET EXT: Ingrese de nuevo CARNET EXT: ");
                                                                    flag = true;
                                                                } else {
                                                                    flag = false;
                                                                }
                                                            } else {
                                                                scan.Escribir("Error: Ingrese de nuevo: ");
                                                                flag = true;
                                                            }
                                                        } while (flag);
                                                        flagtipo = false;

                                                        flagtipo = false;
                                                    } else {
                                                        System.out.println("Error ...");
                                                        flagtipo = true;
                                                    }
                                                } while (flagtipo);
                                                Vendedor.setTipoDocumento(Tdoc);
                                                Vendedor.setNumDocumento(Nduc);
                                                break;
                                            case 2:
                                                System.out.print("Nuevo Nombres: ");
                                                Vendedor.setNombres(new Scanner(System.in).nextLine().toUpperCase());
                                                break;
                                            case 3:
                                                System.out.print("Nuevo Apellidos: ");
                                                Vendedor.setApellidos(new Scanner(System.in).nextLine().toUpperCase());
                                                break;
                                            case 4:
                                                System.out.print("Nuevo correo: ");
                                                Vendedor.setCorreo(new Scanner(System.in).nextLine());
                                                break;
                                            case 5:
                                                System.out.print("Nueva contraseñea: ");
                                                Vendedor.setContrasenia(new Scanner(System.in).nextLine());
                                                break;
                                            case 6:
                                                System.out.print("Nuevo estado: ");
                                                Vendedor.setEstado(new Scanner(System.in).nextLine().toUpperCase());
                                                break;
                                            default:
                                                scan.EscribirLinea("");
                                                scan.EscribirLinea(" no exise esa opción");
                                                break;

                                        }
                                        break;
                                    case 2:
                                        scan.EscribirLinea("");
                                        System.out.println("Actualizar todo");
                                        int tamañoVendedores = Vendedores.size();
                                        scan.EscribirLinea("Actualizando todo");
                                        for (int i = 0; i < tamañoVendedores; i++) {
                                            scan.EscribirLinea(" ");
                                            Vendedor = new CVendedor(i);
                                            Vendedores.set(i, Vendedor);
                                        }
                                        break;
                                }
                                break;
                            case 4:
                                scan.EscribirLinea(" - DELETE / ELIMINAR - ");

                                System.out.println("  Menu Eliminar vendedores ");
                                System.out.println(" 0- Regresar al menu vendedores");
                                System.out.println(" 1- Eliminar por posicion");
                                System.out.println(" 2- Eliminar por nombres y apellidos");
                                System.out.println(" 3- Eliminar todos los vendedores");
                                int opcionDelte = scan.Leer("Ingrese una opcion: ");
                                switch (opcionDelte) {
                                    case 0:
                                        System.out.println(" ... Regresando al menu vendedores");
                                        break;
                                    case 1:
                                        scan.EscribirLinea(" ");

                                        scan.EscribirLinea("Eliminar por posicion");
                                        int lengethList = Vendedores.size();
                                        int pos = scan.Leer("Ingrese la posicion a Eliminar: ");
                                        if (pos <= lengethList && pos >= 0) {
                                            scan.EscribirLinea("El vendedor en la posicón " + pos + " ha sido eliminado");
                                            Vendedores.remove((pos));
                                        } else {
                                            scan.EscribirLinea(" Este elemento no existe ");
                                        }
                                        break;
                                    case 2:
                                        scan.EscribirLinea(" ");

                                        System.out.println(" Eliminar por nombres y apellidos");
                                        scan.Escribir("Ingrese el nombres: ");
                                        String Nombre = new Scanner(System.in).nextLine().toUpperCase();
                                        scan.Escribir("Ingrese el apellidos: ");
                                        String Apellido = new Scanner(System.in).nextLine().toUpperCase();
                                        int posicionDe = EliminarVendedor(Nombre, Apellido, Vendedores);
                                        if (posicionDe == -1) {
                                            scan.EscribirLinea("Este elemento no existe");

                                        } else {
                                            scan.EscribirLinea("El Vendedor con el " + Nombre + " con el apellido " + Apellido + " ha sido eliminado: ");
                                            Vendedores.remove(posicionDe);
                                        }

                                        break;
                                    case 3:
                                        scan.EscribirLinea(" ");
                                        scan.EscribirLinea("Eliminando todo");
                                        Vendedores.clear();
                                        break;
                                    default:
                                        scan.EscribirLinea(" ");
                                        scan.EscribirLinea("No existe esa opción");
                                        break;
                                }
                                break;
                        }

                    } while (flagVendedor);
                    break;
                case 4:
                    scan.EscribirLinea(" >>GESTIONANDO VENTAS");
                    boolean opcionVentas = true;
                    do {
                        scan.EscribirLinea("----------------");
                        scan.EscribirLinea(" MENÚ VENTAS");
                        scan.EscribirLinea("----------------");
                        scan.EscribirLinea("\t0) Salir al menú principal");
                        scan.EscribirLinea("\t1) Añadir       (C) ");
                        scan.EscribirLinea("\t2) Mostrar      (R) ");
                        scan.EscribirLinea("\t4) Eliminar     (D) ");
                        int opcionV = scan.Leer("\t>>Elija una opciòn: ");
                        switch (opcionV) {
                            case 0:
                                System.out.println("... Regresando al menu principal.");
                                opcionVentas = false;
                                break;
                            case 1: // Resgistrar una venta
                                // Tipo y Num documento
                                String Tdoc = " ";
                                String Nduc = " ";
                                boolean flagtipo = true;
                                do {
                                    System.out.println("Seleccione tipo de documento:");
                                    System.out.println("  (A) FACTURA        (B) BOLETA ");
                                    scan.Escribir("Eliga una opción: ");
                                    Tdoc = new Scanner(System.in).next(); // Factura | Boleta
                                    if (Tdoc.toUpperCase().equals("A")) {
                                        Tdoc = "FACTURA";

                                        scan.Escribir("Ingrese el número de la factura: ");

                                        Nduc = new Scanner(System.in).next();

                                        flagtipo = false;
                                    } else if (Tdoc.toUpperCase().equals("B")) {
                                        Tdoc = "BOLETA";

                                        scan.Escribir("Ingrese el número boleta: ");

                                        Nduc = new Scanner(System.in).next();

                                        flagtipo = false;
                                    } else {
                                        System.out.println("Error ... Ingrese nueva opción: ");
                                        flagtipo = true;
                                    }
                                } while (flagtipo);

                                String tipoDocumento = Tdoc;
                                String NumVenta = Nduc;

                                // Fecha

                                Date FechaVenta = new Date();
                                scan.EscribirLinea("Fecha: " + FechaVenta);

                                String DniVendedor = "";
                                boolean VentaVendedor = true;
                                do {
                                    scan.EscribirLinea("");
                                    mostrarVendedores(Vendedores);
                                    scan.EscribirLinea("");
                                    int IDVendedor = scan.Leer("Ingrese el id del vendedor: ");
                                    // Funcion existe() en vendedor
                                    int ExistDNI = DNIVendedor(IDVendedor, Vendedores);

                                    if (ExistDNI != -1) {
                                        scan.EscribirLinea("");
                                        System.out.println("Vendedor existe");
                                        scan.EscribirLinea("");
                                        DniVendedor = Vendedores.get(ExistDNI).getNumDocumento();
                                        VentaVendedor = false;
                                    } else {
                                        scan.EscribirLinea("");
                                        System.out.println("Vendedor NO existe");
                                        scan.EscribirLinea("");
                                        System.out.println("Agregando nuevo Vendedor ");
                                        boolean plag = true;

                                        do {
                                            Vendedor = new CVendedor(Vendedores.size());
                                            DniVendedor = Vendedor.getNumDocumento();
                                            if (DNIvendedor(DniVendedor, Vendedores)) {
                                                scan.EscribirLinea("");
                                                scan.EscribirLinea("Vendedor existente:\n Ingrese Nuevamente: ");
                                                scan.EscribirLinea("");
                                                plag = true;
                                            } else {
                                                scan.EscribirLinea("");
                                                scan.EscribirLinea("Vendedor añadido");
                                                scan.EscribirLinea("");
                                                countVendedor++;
                                                Vendedores.add(Vendedor);
                                                plag = false;
                                            }
                                        } while (plag);

                                        VentaVendedor = true;
                                    }
                                } while (VentaVendedor);


                                // Funcion existe() en Cliente
                                String Dnicliente = "";
                                boolean VentaCliente = true;
                                do {
                                    scan.EscribirLinea("");
                                    mostrarClientes(clientes);
                                    scan.EscribirLinea("");

                                    int IDCliente = scan.Leer("Ingrese el id del cliente: ");

                                    int ExistDNICliente = DNICliente(IDCliente, clientes);
                                    if (ExistDNICliente != -1) {
                                        scan.EscribirLinea("");
                                        System.out.println("Cliente existe");
                                        scan.EscribirLinea("");
                                        Dnicliente = clientes.get(IDCliente).getNumDocumento();
                                        VentaCliente = false;
                                    } else {
                                        scan.EscribirLinea("");
                                        System.out.println("Cliente NO existe");
                                        scan.EscribirLinea("");
                                        boolean plagC = true;

                                        do {
                                            System.out.println("Agregando nuevo  ");
                                            cliente = new CCliente(clientes.size());
                                            Dnicliente = cliente.getNumDocumento();
                                            if (DNICliente(Dnicliente, clientes)) {
                                                scan.EscribirLinea("");
                                                scan.EscribirLinea("Cliente existente:\n Ingrese Nuevamente: ");
                                                scan.EscribirLinea("");
                                                plagC = true;
                                            } else {
                                                scan.EscribirLinea("");
                                                scan.EscribirLinea("Cliente añadido");
                                                scan.EscribirLinea("");
                                                clientes.add(cliente);
                                                countCliente++;
                                                Dnicliente = clientes.get(IDCliente).getNumDocumento();
                                                plagC = false;
                                            }
                                        } while (plagC);
                                        VentaCliente = true;
                                    }
                                } while (VentaCliente);

                                String agregarFlores;
                                double precioTotal = 0;
                                int cantidad = 0;
                                int descuento = 0;

                                int posFlorVenta = 0;
                                int IDFlor = -1;
                                boolean Vendida = true;
                                do {
                                    mostrarFlores(flores);
                                    posFlorVenta = scan.Leer("Seleccione ID de la flor para vender: ");
                                    int ExistFlor = IDflor(posFlorVenta, flores);
                                    if (ExistFlor != -1) {
                                        scan.EscribirLinea("");
                                        System.out.println("flor añadida");
                                        scan.EscribirLinea("");
                                        IDFlor = posFlorVenta;
                                        Vendida = false;
                                    } else {
                                        scan.EscribirLinea("");
                                        System.out.println("flor NO existe");
                                        scan.EscribirLinea("");
                                        boolean flagFlor = true;
                                        do {
                                            System.out.println("Agregando nueva flor ");
                                            flor = new CFlor(flores.size());
                                            String Nombre = flor.getNombre();
                                            String Color = flor.getColor();

                                            if (validarDuplicados(flores, Nombre, Color)) {
                                                scan.EscribirLinea(" << Flor ya existe ");
                                                scan.EscribirLinea("-- ingrese nuevamente --");
                                                flagFlor = true;
                                            } else {
                                                scan.EscribirLinea("\nFlor añadido\n");
                                                IDFlor = flor.getIDFlor();
                                                countFlor++;
                                                flores.add(flor);
                                                flagFlor = false;
                                            }
                                        } while (flagFlor);
                                        Vendida = true;
                                    }

                                    boolean flagFlor = true;

                                } while (Vendida);


                                // Pregunta cuantas quiere
                                cantidad = scan.Leer("Cantidad que desea comprar: ");

                                descuento = scan.Leer("Ingrese el descuento: ");

                                CFlor f2 = (CFlor) flores.get(posFlorVenta);
                                floresVendidas.add(f2);
                                double igv = Math.round(precioTotal * 0.18);
                                precioTotal = (f2.getPrecio() * cantidad) - descuento;

                                Detalles.add(new CDetalleVenta(countDetalle++, Integer.parseInt(NumVenta), IDFlor, cantidad, descuento, f2.getPrecio()));
                                String estado = "";
                                boolean flagestado = true;
                                do {
                                    scan.EscribirLinea("""
                                            A) NUEVA |  B) CANCELADA |  C)POR PAGAR""");
                                    scan.Escribir("Ingrese tipo de estado: ");
                                    String input = new Scanner(System.in).nextLine().toUpperCase();

                                    switch (input) {
                                        case "A":
                                            estado = "NUEVA";
                                            flagestado = false;
                                            break;
                                        case "B":
                                            estado = "CANCELADA";
                                            flagestado = false;
                                            break;
                                        case "C":
                                            estado = "POR PAGAR";
                                            flagestado = false;
                                            break;
                                        default:
                                            scan.EscribirLinea("No existe esa opción ");
                                            flagestado = true;
                                            break;
                                    }
                                } while (flagestado);

                                Ventas.add(new CVenta(tipoDocumento, NumVenta, FechaVenta, DniVendedor, Dnicliente, descuento, precioTotal * 0.18, descuento, estado));
                                break;
                            case 2:
                                scan.EscribirLinea(" - READ / LEER  - ");
                                System.out.println("  Menu Mostrar venta ");
                                System.out.println(" 0- Regresar al menu venta");
                                System.out.println(" 1- Mostrar por posicion");
                                System.out.println(" 2- Mostrar todas las  venta");
                                int opciondetalle = scan.Leer("Ingrese una opcion: ");
                                switch (opciondetalle) {
                                    case 0:
                                        System.out.println(" ... Regresando al Detalle venta");
                                        break;
                                    case 1:
                                        scan.EscribirLinea("");
                                        System.out.println("Mostrar por posicion");
                                        scan.EscribirLinea("");
                                        int posicion = scan.Leer("Ingrese la posicion del Detalle venta buscada: ");
                                        int tamaño = Ventas.size();

                                        if (posicion <= tamaño && posicion >= 0) {
                                            scan.EscribirLinea("Venta en la posición " + posicion + " es: ");
                                            Ventas.get(posicion).mostrarLista();
                                        } else {
                                            scan.EscribirLinea("Este elemento no existe");
                                        }
                                        break;
                                    case 2:
                                        System.out.println("Mostrar todos los Detalle venta");
                                        mostrarVentas(Ventas);
                                        break;
                                }
                                break;
                            case 3:
                                scan.EscribirLinea(" - DELETE / ELIMINAR - ");
                                System.out.println("  Menu Eliminar venta ");
                                System.out.println(" 0- Regresar al menu venta ");
                                System.out.println(" 1- Eliminar por posicion");
                                System.out.println(" 3- Eliminar todos los vendedores");
                                int opcionDelteDetalle = scan.Leer("Ingrese una opcion: ");
                                switch (opcionDelteDetalle) {
                                    case 0:
                                        System.out.println(" ... Regresando al menu venta");
                                        break;
                                    case 1:
                                        scan.EscribirLinea(" ");

                                        scan.EscribirLinea("Eliminar por posicion");
                                        int lengethListD = Ventas.size();
                                        int pos = scan.Leer("Ingrese la posicion a Eliminar: ");
                                        if (pos <= lengethListD && pos >= 0) {
                                            scan.EscribirLinea("La venta en la posicón " + pos + " ha sido eliminado");
                                            Ventas.remove((pos));
                                        } else {
                                            scan.EscribirLinea(" Este elemento no existe ");
                                        }
                                        break;
                                    case 2:
                                        scan.EscribirLinea(" ");
                                        scan.EscribirLinea("Eliminando todo");
                                        Ventas.clear();
                                        break;
                                    default:
                                        scan.EscribirLinea(" ");
                                        scan.EscribirLinea("No existe esa opción");
                                        break;
                                }
                                break;
                            default:
                                break;
                        }


                    } while (opcionVentas);
                    break;
                case 5:
                    scan.EscribirLinea(" >>GESTIONANDO DETALLE VENTA");
                    boolean flagDetalleVenta = true;
                    do {

                        int opcionDetalle = menu("detalle venta");
                        CDetalleVenta Detalle;

                        switch (opcionDetalle) {
                            case 0:
                                scan.EscribirLinea("SALIENDO AL MENÚ PRINCIPAL :)");
                                flagDetalleVenta = false;
                                break;
                            case 1:
                                scan.EscribirLinea("- CREATE / CREAR - ");
                                scan.EscribirLinea("");
                                scan.EscribirLinea("\t Datos del detalle de venta");


                                scan.EscribirLinea("Id Detalle de venta: " + (countDetalle++));
                                int IDDetalle = countDetalle;
                                int IDVenta = (scan.Leer("Id Venta: "));

                                scan.EscribirLinea("-------------Producto------------");
                                mostrarFlores(flores);
                                scan.EscribirLinea("");

                                int IDflor = -1;
                                double Precio = 0;
                                boolean flagProducto = true;
                                do {
                                    int IDLectura = (scan.Leer("Elija Id Producto(Flor): "));
                                    if (existeIDflor(IDLectura, flores) != -1) {
                                        IDflor = IDLectura;
                                        Precio = flores.get(IDflor).getPrecio();
                                        flagProducto = false;
                                    } else {
                                        scan.EscribirLinea("\t No existe la flor");
                                        flagProducto = true;
                                    }
                                } while (flagProducto);
                                int Cantidad = (scan.Leer("Cantidad: "));
                                int Descuento = (scan.Leer("Descuento: "));
                                scan.EscribirLinea("Precio: " + Precio);

                                break;
                            case 2:
                                scan.EscribirLinea(" - READ / LEER  - ");
                                System.out.println("  Menu Mostrar Detalle venta ");
                                System.out.println(" 0- Regresar al menu Detalle venta");
                                System.out.println(" 1- Mostrar por posicion");
                                System.out.println(" 2- Mostrar por Id Detalle venta");
                                System.out.println(" 3- Mostrar todos los Detalles venta");
                                int opciondetalle = scan.Leer("Ingrese una opcion: ");
                                switch (opciondetalle) {
                                    case 0:
                                        System.out.println(" ... Regresando al Detalle venta");
                                        break;
                                    case 1:
                                        scan.EscribirLinea("");
                                        System.out.println("Mostrar por posicion");
                                        int posicion = scan.Leer("Ingrese la posicion del Detalle venta buscada: ");
                                        int tamaño = Detalles.size();
                                        if (posicion <= tamaño && posicion >= 0) {
                                            scan.EscribirLinea("Detalle venta en la posición " + posicion + " es: ");
                                            Detalles.get(posicion).mostrar();
                                        } else {
                                            scan.EscribirLinea("Este elemento no existe");
                                        }
                                        break;
                                    case 2:
                                        scan.EscribirLinea("");
                                        System.out.println("Mostrar por Id venta");
                                        int c = scan.Leer("Id venta: ");
                                        int tamavu = Detalles.size();
                                        if (tamavu != 0) {
                                            int posi = mostrarDetalle(c, Detalles);
                                            if (posi == -1) {
                                                scan.EscribirLinea("Este elemento no existe");
                                            } else {
                                                scan.EscribirLinea("Detalle venta con el Id " + c + " es: ");
                                                Detalles.get(posi).mostrar();
                                            }
                                        } else {
                                            scan.EscribirLinea("Esta vacia la lista Detalles");
                                        }

                                        break;
                                    case 3:
                                        System.out.println("Mostrar todos los Detalle venta");
                                        mostrarDetalle(Detalles);
                                        break;
                                }
                                break;
                            case 3:
                                scan.EscribirLinea(" - UPDATE / ACTUALIZAR - ");
                                System.out.println("  Menu Actualizar Detalle venta");
                                System.out.println(" 0- Regresar al menu Detalle venta");
                                System.out.println(" 1- Actualizar un campo");
                                System.out.println(" 2- Actualizar todo");
                                int opcionActualizarFlor = scan.Leer("   Ingrese una opción: ");
                                switch (opcionActualizarFlor) {
                                    case 0:
                                        System.out.println(" ... Regresando al  Detalle venta");
                                        break;
                                    case 1:
                                        scan.EscribirLinea("");
                                        System.out.println("Actualizar un campo");
                                        int pos = scan.Leer("Ingrese la posicion a actualizar: ");
                                        scan.EscribirLinea("""
                                                        SUB MENU DE CAMPOS DETALLE VENTA
                                                   0- Id Detalle de venta
                                                   1- Id Venta
                                                   2- Id Producto
                                                   3- Cantidad
                                                   4- Descuento
                                                   5- Precio
                                                """);
                                        int campo = scan.Leer("  Ingrese campo que desea actualizar:");
                                        Detalle = (CDetalleVenta) Detalles.get(pos);
                                        switch (campo) {
                                            case 0:
                                                Detalle.setIdDetalleVenta(scan.Leer("Nuevo Id Detalle de venta: "));
                                                break;
                                            case 1:
                                                Detalle.setIdVenta(scan.Leer("Nuevo Id de venta: "));
                                                break;
                                            case 2:
                                                Detalle.setIdProducto(scan.Leer("Nuevo Id de producto: "));
                                                break;
                                            case 3:
                                                Detalle.setCantidad(scan.Leer("Nueva cantidad: "));
                                                break;
                                            case 4:
                                                Detalle.setDescuento(scan.Leer("Nuevo descuento: "));
                                                break;
                                            case 5:
                                                Detalle.setPrecio(scan.Leer("Nuevo precio: "));
                                                break;
                                            default:
                                                scan.EscribirLinea("");
                                                scan.EscribirLinea(" no exise esa opción");
                                                break;
                                        }
                                        break;
                                    case 2:
                                        scan.EscribirLinea("");
                                        System.out.println("Actualizar todo");
                                        int tamañoDetalles = Detalles.size();
                                        scan.EscribirLinea("Actualizando todo");
                                        for (int i = 0; i < tamañoDetalles; i++) {
                                            scan.EscribirLinea(" ");
                                            Detalle = new CDetalleVenta(i);
                                            Detalles.set(i, Detalle);
                                        }
                                        break;
                                }
                                break;
                            case 4:
                                scan.EscribirLinea(" - DELETE / ELIMINAR - ");
                                System.out.println("  Menu Eliminar Detalle venta ");
                                System.out.println(" 0- Regresar al menu Detalle venta");
                                System.out.println(" 1- Eliminar por posicion");
                                System.out.println(" 2- Eliminar por Id Detalle venta");
                                System.out.println(" 3- Eliminar todos los vendedores");
                                int opcionDelteDetalle = scan.Leer("Ingrese una opcion: ");
                                switch (opcionDelteDetalle) {
                                    case 0:
                                        System.out.println(" ... Regresando al menu Detalle venta");
                                        break;
                                    case 1:
                                        scan.EscribirLinea(" ");

                                        scan.EscribirLinea("Eliminar por posicion");
                                        int lengethListD = Detalles.size();
                                        int pos = scan.Leer("Ingrese la posicion a Eliminar: ");
                                        if (pos <= lengethListD && pos >= 0) {
                                            scan.EscribirLinea("El Detalle venta en la posicón " + pos + " ha sido eliminado");
                                            Detalles.remove((pos));
                                        } else {
                                            scan.EscribirLinea(" Este elemento no existe ");
                                        }
                                        break;
                                    case 2:
                                        scan.EscribirLinea(" ");

                                        System.out.println(" Eliminar por Id Detalle venta");
                                        int IdDetalle = scan.Leer("Ingrese Id Detalle venta: ");
                                        int posicionDe = mostrarDetalle(IdDetalle, Detalles);
                                        if (posicionDe == -1) {
                                            scan.EscribirLinea("Este elemento no existe");
                                        } else {
                                            scan.EscribirLinea("El Id Detalle venta con el " + IdDetalle + " ha sido eliminado: ");
                                            Detalles.remove(posicionDe);
                                        }
                                        break;
                                    case 3:
                                        scan.EscribirLinea(" ");
                                        scan.EscribirLinea("Eliminando todo");
                                        Detalles.clear();
                                        break;
                                    default:
                                        scan.EscribirLinea(" ");
                                        scan.EscribirLinea("No existe esa opción");
                                        break;
                                }
                                break;
                        }

                    } while (flagDetalleVenta);
                    break;
            }
        }while (flagmain) ;
    }
}
