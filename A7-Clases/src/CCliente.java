import java.util.Scanner;

public class CCliente {
    private int idCliente;
    private String nombres;
    private String apellidos;
    private String tipoDocumento;
    private String numDocumento;
    private String correo;
    private String tipo;
    private String estado;

    public CCliente(int idCliente, String nombres, String apellidos, String tipoDocumento, String numDocumento, String correo, String tipo, String estado) {
        this.idCliente = idCliente;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.tipoDocumento = tipoDocumento;
        this.numDocumento = numDocumento;
        this.correo = correo;
        this.tipo = tipo;
        this.estado = estado;
    }
    public void mostrar(){
        System.out.println("ID cliente: "+this.idCliente);
        System.out.println("Nombres: "+this.nombres);
        System.out.println("Apellidos: "+this.apellidos);
        System.out.println("Tipo Documento: "+this.tipoDocumento);
        System.out.println("Númro Documento: "+this.numDocumento);
        System.out.println("Correo: "+this.correo);
        System.out.println("Tipo: "+this.tipo);
        System.out.println("Estado: "+this.estado);
    }

    public CCliente(int i){
        scan.EscribirLinea("ID cliente: "+(i));
        this.setIdCliente(i);
        System.out.print("Ingrese el Nombres: ");
        this.setNombres(new Scanner(System.in).nextLine().toUpperCase());
        System.out.print("Ingrese el Apellidos: ");
        this.setApellidos(new Scanner(System.in).nextLine().toUpperCase());
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
        this.setTipoDocumento(Tdoc);
        this.setNumDocumento(Nduc);
        System.out.print("Ingrese el correo: ");
        this.setCorreo(new Scanner(System.in).nextLine());
        System.out.print("Ingrese el Tipo: ");
        this.setTipo(new Scanner(System.in).nextLine().toUpperCase());
        System.out.print("Ingrese el estado: ");
        this.setEstado(new Scanner(System.in).nextLine().toUpperCase());

    }



    public int getIdCliente() {
        return idCliente;
    }
    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }
    public String getNombres() {
        return nombres;
    }
    public void setNombres(String nombres) {
        this.nombres = nombres;
    }
    public String getApellidos() {
        return apellidos;
    }
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    public String getCorreo() {
        return correo;
    }
    public void setCorreo(String correo) {
        this.correo = correo;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public String getEstado() {
        return estado;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }
    public String getTipoDocumento() {
        return tipoDocumento;
    }
    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public String getNumDocumento() {
        return numDocumento;
    }

    public void setNumDocumento(String numDocumento) {
        this.numDocumento = numDocumento;
    }
}
