import java.util.Scanner;

public class CDetalleVenta {
    private int idDetalleVenta;
    private int idVenta;
    private int idProducto; // Es una flor ....
    private int cantidad;
    private double descuento;
    private double precio;

    public CDetalleVenta(int idDetalleVenta, int idVenta, int idProducto, int cantidad, double descuento, double precio) {
        this.idDetalleVenta = idDetalleVenta;// index
        this.idVenta = idVenta;
        this.idProducto = idProducto;
        this.cantidad = cantidad;
        this.descuento = descuento;
        this.precio = precio;
    }
    public void mostrar(){
        System.out.println("Id Detalle de venta: "+this.idDetalleVenta);
        System.out.println("Id Venta: "+this.idVenta);
        System.out.println("Id Producto: "+this.idProducto);
        System.out.println("Cantidad: "+this.cantidad);
        System.out.println("Descuento: "+this.descuento);
        System.out.println("Precio: "+this.precio);
    }
    public CDetalleVenta(int i){
        System.out.print("Id Detalle de venta: "+(i+1));
        scan.EscribirLinea("");
        this.setIdDetalleVenta(i+1);
        this.setIdVenta(scan.Leer("Id Venta: "));
        this.setIdProducto(scan.Leer("Id Producto: "));
        this.setCantidad(scan.Leer("Cantidad: "));
        this.setDescuento(scan.Leer("Descuento: "));
        this.setPrecio(scan.Leer("Precio: "));

    }

    public int getIdDetalleVenta() {
        return idDetalleVenta;
    }

    public void setIdDetalleVenta(int idDetalleVenta) {
        this.idDetalleVenta = idDetalleVenta;
    }

    public int getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(int idVenta) {
        this.idVenta = idVenta;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
