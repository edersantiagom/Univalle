
class Producto {
    private String nombre;
    private int cantidad;
    private String codProducto;
    private double valorUnitario;
    private double impuesto;
    private double iva;
    private double descuento;

    public Producto(String nombre, String codProducto, int cantidad, double valorUnitario, double descuento) {
        this.nombre = nombre;
        this.codProducto = codProducto;
        this.cantidad = cantidad;
        this.valorUnitario = valorUnitario;
        this.iva = 0.19;
        this.impuesto = this.valorUnitario * this.iva;
        this.descuento = descuento;
    }
    public String getNombre() {
        return nombre;
    }
    public int getCantidad() {
        return cantidad;
    }
    public String getCodProducto() {
        return codProducto;
    }
    public double getValorUnitario() {
        return valorUnitario;
    }
    public double getIva() {
        return iva;
    }
    public double getImpuesto() {
        return impuesto;
    }
    public double getDescuento() {
        return descuento;
    }


}










