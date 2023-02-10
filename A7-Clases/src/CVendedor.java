import java.util.Scanner;

public class CVendedor {
    private int idVendedor;
    private String tipoDocumento;
    private String numDocumento;
    private String nombres;
    private String apellidos;
    private String correo;
    private String Contrasenia;
    private String estado;

    public CVendedor(int idVendedor, String tipoDocumento, String numDocumento, String nombres, String apellidos, String correo, String contrasenia, String estado) {
        this.idVendedor = idVendedor;
        this.tipoDocumento = tipoDocumento;
        this.numDocumento = numDocumento;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.correo = correo;
        this.Contrasenia = contrasenia;
        this.estado = estado;
    }
    public void mostrar(){
        System.out.println("ID vendedor: "+this.idVendedor);
        System.out.println("Tipo Documento: "+this.tipoDocumento);
        System.out.println("Númro Documento: "+this.numDocumento);
        System.out.println("Nombres: "+this.nombres);
        System.out.println("Apellidos: "+this.apellidos);
        System.out.println("Correo: "+this.correo);
        System.out.println("Contraseña: "+this.Contrasenia);
        System.out.println("Estado: "+this.estado);
    }
    public CVendedor(int count){

        scan.Escribir("ID vendedor: "+(count+1)+"\n");
        this.setIdVendedor(count+1);
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
        scan.Escribir("Ingrese su nombre: ");
        this.setNombres(new Scanner(System.in).nextLine().toUpperCase());
        scan.Escribir("Ingrese su apellido: ");
        this.setApellidos(new Scanner(System.in).nextLine().toUpperCase());
        scan.Escribir("Ingrese su correo: ");
        this.setCorreo(new Scanner(System.in).nextLine());
        scan.Escribir("Ingrese su contraseña: ");
        this.setContrasenia(new Scanner(System.in).nextLine());
        scan.Escribir("Ingrese su estado: ");
        this.setEstado(new Scanner(System.in).nextLine().toUpperCase());
    }
    public int getIdVendedor() {
        return idVendedor;
    }

    public void setIdVendedor(int idVendedor) {
        this.idVendedor = idVendedor;
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

    public String getContrasenia() {
        return Contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        Contrasenia = contrasenia;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }


}
