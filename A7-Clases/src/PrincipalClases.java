import java.util.*;

public class PrincipalClases {
    public static void mostrarFlores(List<CFlor> flores){
        System.out.println("N°\t\tNOMBRE\t\t\tAROMA\t\t\tCOLOR\t\t\tPRECIO");
        int count=1;
        for (CFlor flor: flores) {
            System.out.println((count++)+"\t\t"+flor.getNombre()+"\t\t\t"+
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
                            Vendedor.getTipoDocumento()+"\t\t\t\t\t\t\t"+
                            Vendedor.getNumDocumento()+"\t\t\t\t\t\t\t"+
                            Vendedor.getNombres()+"\t\t\t\t"+
                            Vendedor.getApellidos()+"\t\t\t\t\t"+
                            Vendedor.getCorreo()+"\t\t\t\t"+
                            Vendedor.getContrasenia()+"\t\t\t\t"+
                            Vendedor.getEstado());
        }
    }

    public static void mostrarDetalle(List<CDetalleVenta> Detalles){
        System.out.println("ID_DETALLE VENTA\t\tID_VENTA\t\t\tID_PRODUCTO\t\t\tCANTIDAD\t\t\tDESCUENTO\t\t\tPRECIO");
        for (CDetalleVenta Detalle: Detalles) {
            scan.EscribirLinea(
                    Detalle.getIdDetalleVenta()+"\t\t\t\t"+
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
            scan.EscribirLinea("\t4) Gestionar detalles venta ");
            opcion = scan.Leer("\t>>Elija una opciòn: ");
            scan.EscribirLinea("");
            if (opcion >-1 && opcion <= 4) {
                verif = false;
            } else {
                scan.EscribirLinea(" Esa opción no existe ");
                verif = true;
            }
        } while (verif);
        return opcion;
    }

    public static int validardniVendedor(List<CVendedor> Vendedores) {
        int ret=-1;

        for (CVendedor Vendedor : Vendedores) {
            if (Vendedor.getNumDocumento().equals(Vendedor.getNumDocumento())) {
                ret=0;
            }
        }
        return  ret;
    }

    public static int validardniCliente(List<CCliente> clientes) {
        int ret=-1;

        for (CCliente cliente : clientes) {
            if (cliente.getNumDocumento().equals(cliente.getNumDocumento())) {
                ret=0;
            }
        }
        return  ret;
    }

    public static int validarDuplicados(List<CFlor> flores) {
        int ret=-1;

        for (CFlor flor : flores) {
            if (flor.getNombre().equals(flor.getNombre()) && flor.getColor().equals(flor.getColor())  ) {
                ret=0;
            }
        }
        return  ret;
    }


    public static void main(String[] args) {
        List<CCliente> clientes = new ArrayList<CCliente>();
        List<CFlor> flores = new ArrayList<CFlor>();
        List<CVendedor> Vendedores = new ArrayList<CVendedor>();
        List<CDetalleVenta> Detalles = new ArrayList<CDetalleVenta>();
        boolean flagmain=true;
        do {
            int opcionmain = menuPrincipal();
            int countCliente = 0;
            int countVendedor = 0;
            int countDetalle = 0;
            switch (opcionmain){
                case 0:
                    scan.EscribirLinea("SALIENDO DEL PROGRAMA");
                    flagmain=false;
                    break;
                case 1:
                    scan.EscribirLinea(" >>GESTIONANDO CLIENTES");
                    scan.EscribirLinea("");
                    boolean flagCliente=true;
                    do {
                        int opcion=menu("cliente");
                        CCliente cliente=null;
                        switch (opcion){
                            case 0:
                                scan.EscribirLinea("SALIENDO DEL MENÚ :)");
                                flagCliente=false;
                                break;
                            case 1:
                                scan.EscribirLinea(" - CREATE / CREAR - ");


                                scan.EscribirLinea("Cliente datos: ");
                                boolean flagClien=true;
                                do {
                                    cliente = new CCliente(countCliente);
                                    int tamañolistaC= clientes.size();
                                    if(tamañolistaC==0){
                                        scan.EscribirLinea("Cliente añadido");
                                        clientes.add(cliente);
                                        flagClien=false;
                                        countCliente=+1;
                                    }else {
                                        int validar=validardniCliente(clientes);
                                        if (validar !=1 ){
                                            scan.EscribirLinea("Cliente añadido");
                                            clientes.add(cliente);
                                            flagClien=false;
                                            countCliente=+1;
                                        }
                                        scan.EscribirLinea(" << Cliente ya existe ");
                                        scan.EscribirLinea("-- ingrese nuevamente --");
                                        flagClien=true;
                                    }
                                }while (flagClien);


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
                                        int tamaño=clientes.size();
                                        scan.EscribirLinea("");
                                        if(posicionCl <= tamaño && posicionCl>=0){
                                            scan.EscribirLinea("El Cliente en la "+posicionCl+" es: ");

                                            clientes.get(posicionCl).mostrar();
                                        }else{
                                            scan.EscribirLinea(" Este elemento no existe");
                                        }
                                        break;
                                    case 2:
                                        scan.EscribirLinea("");

                                        System.out.println("Mostrar por nombre y apellidos: ");

                                        System.out.print("Nombre: ");
                                        String n = new  Scanner(System.in).nextLine().toUpperCase();
                                        System.out.print("Apellidos: ");
                                        String a = new  Scanner(System.in).nextLine().toUpperCase();

                                        int posicionC = mostrarCliente(n, a, clientes);
                                        scan.EscribirLinea("");
                                        if(posicionC == -1){
                                            scan.EscribirLinea(" Este elemento no existe");
                                        }else{
                                            scan.EscribirLinea("El Cliente con el "+n+" y el apellido "+a+" es: ");
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
                                int opcionActualizarCliente= scan.Leer("    Ingrese una opción: ");
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
                                        int submenuActualiza= scan.Leer("  Ingrese campo que desea actualizar: ");
                                        cliente = (CCliente) clientes.get(pos);
                                        switch (submenuActualiza){
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
                                                String TdocC=" ";
                                                String NducC=" ";
                                                boolean flagtipo=true;
                                                do{
                                                    System.out.println("Seleccione tipo de documento:");
                                                    System.out.println("  (A) DNI        (B) CARNET EXTRANJERIA ");
                                                    scan.Escribir("Eliga una opción: ");
                                                    TdocC = new Scanner(System.in).next(); // Factura | Boleta

                                                    if(TdocC.toUpperCase().equals("A")){
                                                        TdocC="DNI";

                                                        scan.Escribir("Ingrese el número del dni: ");
                                                        boolean flag=true;
                                                        do {
                                                            NducC = new  Scanner(System.in).next();

                                                            if(NducC.length() == 8){
                                                                flag=false;
                                                            }else {
                                                                scan.Escribir("Error: Ingrese de nuevo: ");
                                                                flag=true;
                                                            }
                                                        }while (flag);
                                                        flagtipo=false;
                                                    }
                                                    else if (TdocC.toUpperCase().equals("B")) {
                                                        TdocC="CARNET EXTRANJERIA";

                                                        scan.Escribir("Ingrese el número del carnet extranjeria: ");

                                                        boolean flag=true;
                                                        do {
                                                            NducC = new  Scanner(System.in).next();

                                                            if(NducC.length() == 12){
                                                                flag=false;
                                                            }else {
                                                                scan.Escribir("Error: Ingrese de nuevo: ");
                                                                flag=true;
                                                            }
                                                        }while (flag);
                                                        flagtipo=false;

                                                        flagtipo = false;
                                                    }
                                                    else{
                                                        System.out.println("Error ...");
                                                        flagtipo=true;
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
                                        int tamamoAct=clientes.size();
                                        for (int i = 0; i < tamamoAct; i++) {
                                            cliente = new CCliente(i);
                                            scan.EscribirLinea("");
                                            clientes.set(i,cliente);
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
                                        if(pos<=tamañoDC && pos>=0){
                                            scan.EscribirLinea("EL Cliente en la posición "+pos+" ha sido eliminado: ");

                                            clientes.remove((pos));
                                        }else {
                                            scan.EscribirLinea(" Este elemento no existe");
                                        }
                                        break;
                                    case 2:
                                        scan.EscribirLinea(" ");
                                        System.out.println(" Eliminar por nombres y apellidos");
                                        boolean flagDele=true;
                                        do {
                                            scan.EscribirLinea(" ");
                                            scan.Escribir("Ingrese el nombre: ");
                                            String Nombre = new Scanner(System.in).nextLine().toUpperCase();
                                            scan.Escribir("Ingrese el apellidos: ");
                                            String apellidos = new Scanner(System.in).nextLine().toUpperCase();

                                            int posicion=EliminarCliente(Nombre,apellidos,clientes);
                                            if (posicion == -1){
                                                scan.EscribirLinea("El cliente no existe ");
                                                flagDele=true;
                                            }else {
                                                scan.EscribirLinea("EL Cliente con los nombres "+Nombre+" y apellidos "+apellidos+" ha sido eliminado: ");

                                                clientes.remove(posicion);
                                                flagDele=false;
                                            }
                                        }while (flagDele);
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
                    }while (flagCliente);
                    break;
                case 2:
                    scan.EscribirLinea(" >>GESTIONANDO FLORES");
                    scan.EscribirLinea("");
                    boolean verif=true;
                    do {
                        int opcion=menu("flores");
                        CFlor flor;
                        switch (opcion){
                            case 0:
                                scan.EscribirLinea(" REGRESANDO AL MENÚ PRNCIPAL :)");
                                verif=false;
                                break;
                            case 1:
                                scan.EscribirLinea(" * CREATE / CREAR  * ");
                                scan.EscribirLinea("  Ingrese los datos flores: ");
                                boolean flagFlor=true;
                                do {
                                    flor = new CFlor();
                                    int tamañolistaf= flores.size();
                                    if(tamañolistaf == 0){
                                        scan.EscribirLinea("Flor añadido");
                                        flores.add(flor);
                                        flagFlor=false;
                                    }else {
                                        int validar=validarDuplicados(flores);
                                        if (validar !=1 ){
                                            scan.EscribirLinea("Flor añadido");
                                            flores.add(flor);
                                            flagFlor=false;
                                        }
                                        scan.EscribirLinea(" << Flor ya existe ");
                                        scan.EscribirLinea("-- ingrese nuevamente --");
                                        flagFlor=true;
                                    }
                                }while (flagFlor);
                                break;
                            case 2:
                                scan.EscribirLinea(" * READ / LEER  * ");
                                System.out.println("  Menu Mostrar Flores ");
                                System.out.println(" 0- Regresar al menu Flores");
                                System.out.println(" 1- Mostrar por posicion");
                                System.out.println(" 2- Mostrar por nombre y color");
                                System.out.println(" 3- Mostrar todas las Flores");
                                int submenuMotrar= scan.Leer("Elija una opción: ");
                                switch (submenuMotrar){
                                    case 0:
                                        scan.EscribirLinea("... Regresando al Menu Flores");
                                        break;
                                    case 1:
                                        scan.EscribirLinea("");
                                        System.out.println("Mostrar por posicion");
                                        int posicionflor= scan.Leer("Ingrese la posicion de la flor buscada: ");
                                        scan.EscribirLinea("");
                                        int tamaño=flores.size();
                                        if(posicionflor <= tamaño && posicionflor>=0){
                                            scan.EscribirLinea("La flor en la posición "+posicionflor+"  es: ");
                                            flores.get(posicionflor).mostrar();
                                        }else{
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

                                        int sizeflor=flores.size();
                                        int posicion=mostrarFlor(Nombre,Color,flores);
                                        if(posicion == -1){
                                            scan.EscribirLinea(" Este elemento no existe");
                                        }else{
                                            scan.EscribirLinea("La flor con el "+Nombre+" y el Color "+Color+" es: ");
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
                                        int submenuFlor= scan.Leer("  Ingrese campo que desea actualizar: ");
                                        flor = (CFlor) flores.get(pos);
                                        switch (submenuFlor){
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
                                        int tamaño=flores.size();
                                        scan.EscribirLinea("Actualizando todo");

                                        for (int i = 0; i < tamaño; i++) {
                                            scan.EscribirLinea(" ");
                                            flor = new CFlor();
                                            flores.set(i,flor);
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
                                        int lengethList=flores.size();
                                        int pos = scan.Leer("Ingrese la posicion a Eliminar: ");
                                        if(pos<=lengethList && pos>=0){
                                            scan.EscribirLinea("La flor en la posición "+pos+ "ha sido eliminado: ");
                                            flores.remove((pos));
                                        }else {
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


                                        int posiciondelete=EliminarFlor(Nombre,Color,flores);
                                        if(posiciondelete == -1){
                                            scan.EscribirLinea("La flor con el nombre "+Nombre+" y color "+Color+" ha sido eliminado: ");
                                            scan.EscribirLinea("Este elemento no existe");
                                        }else {
                                            flores.remove(posiciondelete);
                                        }
                                        break;
                                    case 3:
                                        int tamañod=flores.size();
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
                    }while (verif);
                    break;
                case 3:
                    scan.EscribirLinea(" >>GESTIONANDO VENDEDORES");
                    boolean flagVendedor=true;
                    do{
                        int opcionvendedor=menu("vendedores");
                        CVendedor Vendedor;

                        switch (opcionvendedor){
                            case 0:
                                scan.EscribirLinea("SALIENDO AL MENÚ PRINCIPAL :)");
                                flagVendedor=false;
                                break;
                            case 1:
                                scan.EscribirLinea("- CREATE / CREAR - ");
                                    scan.EscribirLinea("");
                                scan.EscribirLinea("\t Datos del vendedor");
                                boolean flagvendedor=true;
                                do {
                                    Vendedor = new CVendedor(countVendedor);
                                    int tamañolista= Vendedores.size();
                                    if(tamañolista==0){
                                        scan.EscribirLinea("Vendedor añadido");
                                        Vendedores.add(Vendedor);
                                        flagvendedor=false;
                                        countVendedor=+1;
                                    }else {
                                        int validar=validardniVendedor(Vendedores);
                                        if (validar !=1 ){
                                            scan.EscribirLinea("Vendedor añadido");
                                            Vendedores.add(Vendedor);
                                            flagvendedor=false;
                                            countVendedor=+1;
                                        }
                                        scan.EscribirLinea(" << Vendedor ya existe ");
                                        scan.EscribirLinea("-- ingrese nuevamente --");
                                        flagvendedor=true;
                                    }
                                }while (flagvendedor);
                                break;
                            case 2:
                                scan.EscribirLinea(" - READ / LEER  - ");
                                System.out.println("  Menu Mostrar Vendedores ");
                                System.out.println(" 0- Regresar al menu Vendedores");
                                System.out.println(" 1- Mostrar por posicion");
                                System.out.println(" 2- Mostrar por nombres y apellidos");
                                System.out.println(" 3- Mostrar todos los vendedores");
                                int opcionMVe= scan.Leer("Ingrese una opcion: ");
                                switch (opcionMVe) {
                                    case 0:
                                        System.out.println(" ... Regresando al Menu Vendedores");
                                        break;
                                    case 1:
                                        scan.EscribirLinea("");
                                        System.out.println("Mostrar por posicion");
                                        int posicion = scan.Leer("Ingrese la posicion del Vendedor buscada: ");
                                        int tamaño=Vendedores.size();
                                        if(posicion <= tamaño && posicion>=0){
                                            scan.EscribirLinea("El Vendedor en la posición "+posicion+" es: ");
                                            Vendedores.get(posicion).mostrar();
                                        }else{
                                            scan.EscribirLinea("Este elemento no existe");
                                        }
                                        break;
                                    case 2:
                                        scan.EscribirLinea("");
                                        System.out.println("Mostrar por nombres y apellidos");
                                        System.out.print("Nombres: ");
                                        String n = new  Scanner(System.in).nextLine().toUpperCase();
                                        System.out.print("apellidos: ");
                                        String c = new  Scanner(System.in).nextLine().toUpperCase();
                                        int pos=mostrarVendedor(n, c,Vendedores);
                                        if(pos == -1){
                                            scan.EscribirLinea("Este elemento no existe");

                                        }else{
                                            scan.EscribirLinea("El Vendedor con el "+n+" y el apellido "+c+" es: ");
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

                                        int pos =scan.Leer("Ingrese la posicion a actualizar: ");
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
                                        switch (campo){
                                            case 0:
                                                Vendedor.setIdVendedor(scan.Leer("Nuevo Id vendedor:"));
                                                break;
                                            case 1:
                                                System.out.print("Nuevo tipo Documento y número de documento: ");
                                                String Tdoc=" ";
                                                String Nduc=" ";
                                                boolean flagtipo=true;
                                                do{
                                                    System.out.println("Seleccione tipo de documento:");
                                                    System.out.println("  (A) DNI        (B) CARNET EXTRANJERIA ");
                                                    scan.Escribir("Eliga una opción: ");
                                                    Tdoc = new Scanner(System.in).next(); // Factura | Boleta

                                                    if(Tdoc.toUpperCase().equals("A")){
                                                        Tdoc="DNI";

                                                        scan.Escribir("Ingrese el número del dni: ");

                                                        boolean flag=true;
                                                        do {
                                                            Nduc = new  Scanner(System.in).next();

                                                            if(Nduc.length() == 8){
                                                                flag=false;
                                                            }else {
                                                                scan.Escribir("Error: Ingrese de nuevo: ");
                                                                flag=true;
                                                            }
                                                        }while (flag);
                                                        flagtipo=false;
                                                    }
                                                    else if (Tdoc.toUpperCase().equals("B")) {
                                                        Tdoc="CARNET EXTRANJERIA";

                                                        scan.Escribir("Ingrese el número del carnet extranjeria: ");

                                                        boolean flag=true;
                                                        do {
                                                            Nduc = new  Scanner(System.in).next();

                                                            if(Nduc.length() == 12){
                                                                flag=false;
                                                            }else {
                                                                scan.Escribir("Error: Ingrese de nuevo: ");
                                                                flag=true;
                                                            }
                                                        }while (flag);
                                                        flagtipo=false;

                                                        flagtipo = false;
                                                    }
                                                    else{
                                                        System.out.println("Error ...");
                                                        flagtipo=true;
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
                                        int tamañoVendedores=Vendedores.size();
                                        scan.EscribirLinea("Actualizando todo");
                                        for (int i = 0; i < tamañoVendedores; i++) {
                                            scan.EscribirLinea(" ");
                                            Vendedor = new CVendedor(i);
                                            Vendedores.set(i,Vendedor);
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
                                        int lengethList=Vendedores.size();
                                        int pos = scan.Leer("Ingrese la posicion a Eliminar: ");
                                        if(pos<=lengethList && pos>=0){
                                            scan.EscribirLinea("El vendedor en la posicón "+pos+" ha sido eliminado");
                                            Vendedores.remove((pos));
                                        }else {
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
                                        int posicionDe=EliminarVendedor(Nombre,Apellido,Vendedores);
                                        if(posicionDe == -1){
                                            scan.EscribirLinea("Este elemento no existe");

                                        }else{
                                            scan.EscribirLinea("El Vendedor con el "+Nombre+" con el apellido "+Apellido+" ha sido eliminado: ");
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

                    }while (flagVendedor);
                    break;
                case 4:
                    scan.EscribirLinea(" >>GESTIONANDO DETALLE VENTA");
                    boolean flagDetalleVenta=true;
                    do{
                        int opcionDetalle=menu("detalle venta");
                        CDetalleVenta Detalle;

                        switch (opcionDetalle){
                            case 0:
                                scan.EscribirLinea("SALIENDO AL MENÚ PRINCIPAL :)");
                                flagDetalleVenta=false;
                                break;
                            case 1:
                                scan.EscribirLinea("- CREATE / CREAR - ");
                                scan.EscribirLinea("");
                                scan.EscribirLinea("\t Datos del detalle de venta");
                                Detalle = new CDetalleVenta(countDetalle);
                                countDetalle=+1;
                                break;
                            case 2:
                                scan.EscribirLinea(" - READ / LEER  - ");
                                System.out.println("  Menu Mostrar Detalle venta ");
                                System.out.println(" 0- Regresar al menu Detalle venta");
                                System.out.println(" 1- Mostrar por posicion");
                                System.out.println(" 2- Mostrar por Id Detalle venta");
                                System.out.println(" 3- Mostrar todos los Detalles venta");
                                int opciondetalle= scan.Leer("Ingrese una opcion: ");
                                switch (opciondetalle) {
                                    case 0:
                                        System.out.println(" ... Regresando al Detalle venta");
                                        break;
                                    case 1:
                                        scan.EscribirLinea("");
                                        System.out.println("Mostrar por posicion");
                                        int posicion = scan.Leer("Ingrese la posicion del Detalle venta buscada: ");
                                        int tamaño = Detalles.size();
                                        if(posicion <= tamaño && posicion>=0){
                                            scan.EscribirLinea("Detalle venta en la posición "+posicion+" es: ");
                                            Detalles.get(posicion).mostrar();
                                        }else{
                                            scan.EscribirLinea("Este elemento no existe");
                                        }
                                        break;
                                    case 2:
                                        scan.EscribirLinea("");
                                        System.out.println("Mostrar por Id venta");
                                        int c = scan.Leer("Id venta: ");
                                        int pos = mostrarDetalle(c,Detalles);
                                        if(pos == -1){
                                            scan.EscribirLinea("Este elemento no existe");
                                        }else{
                                            scan.EscribirLinea("Detalle venta con el Id "+c+" es: ");
                                            Detalles.get(pos).mostrar();
                                        }
                                        break;
                                    case 3:
                                        System.out.println("Mostrar todos los vendedores");
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
                                        int pos =scan.Leer("Ingrese la posicion a actualizar: ");
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
                                        switch (campo){
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
                                        int tamañoDetalles=Detalles.size();
                                        scan.EscribirLinea("Actualizando todo");
                                        for (int i = 0; i < tamañoDetalles; i++) {
                                            scan.EscribirLinea(" ");
                                            Detalle = new CDetalleVenta(i);
                                            Detalles.set(i,Detalle);
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
                                        if(pos <= lengethListD && pos >= 0){
                                            scan.EscribirLinea("El Detalle venta en la posicón "+pos+" ha sido eliminado");
                                            Detalles.remove((pos));
                                        }else {
                                            scan.EscribirLinea(" Este elemento no existe ");
                                        }
                                        break;
                                    case 2:
                                        scan.EscribirLinea(" ");

                                        System.out.println(" Eliminar por Id Detalle venta");
                                        int IdDetalle =scan.Leer("Ingrese Id Detalle venta: ");
                                        int posicionDe=mostrarDetalle(IdDetalle,Detalles);
                                        if(posicionDe == -1){
                                            scan.EscribirLinea("Este elemento no existe");
                                        }else{
                                            scan.EscribirLinea("El Id Detalle venta con el "+IdDetalle+" ha sido eliminado: ");
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

                    }while (flagDetalleVenta);
                    break;
            }

        }while (flagmain);
    }

}
