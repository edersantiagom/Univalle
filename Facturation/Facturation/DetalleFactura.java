class DetalleFactura {
    private Producto producto;
    private double valorTP;
    private double valorTotalImpuesto;
    private double valorTotalProducto;
    private double subtotal;
    public DetalleFactura(Producto producto) {
        this.producto = producto;
        calcularValores();
    }

    private void calcularValores() {
        valorTotalImpuesto = producto.getImpuesto() * producto.getCantidad();
        valorTP = producto.getValorUnitario() * producto.getCantidad() + valorTotalImpuesto;
        valorTotalProducto = producto.getValorUnitario() * producto.getCantidad() + valorTotalImpuesto - producto.getDescuento();
        subtotal = producto.getValorUnitario() * producto.getCantidad() - producto.getDescuento();
    }



    public Producto getProducto() {
        return producto;
    }

    public Double getvalorTP() {
        return valorTP;
    }



    public double getValorTotalImpuesto() {
        return valorTotalImpuesto;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public double getValorTotalProducto() {
        return valorTotalProducto;
    }


}