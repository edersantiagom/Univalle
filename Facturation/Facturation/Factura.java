import java.util.ArrayList;
import java.util.Scanner;

public class Factura {
    
    private Cliente cliente;
    ArrayList<DetalleFactura> detalles;
    private String nFactura;
    public static int ultimoNumeroFactura = 1;


    public String getnFactura() {
        return nFactura;
    }
    public Factura(Cliente cliente) {
        this.cliente = cliente;
        this.detalles = new ArrayList<>();
        this.nFactura = String.format("F%03d", ultimoNumeroFactura++);
    }
    public void agregarDetalle(DetalleFactura detalle) {
        this.detalles.add(detalle);
    }
    public void imprimirFactura() {
        double totalImpuesto = 0;
        double totalDescuento = 0;
        double subtotalFactura = 0;
        double totalFactura = 0;
    

        System.out.println("\n========================================================================================================================================");
        System.out.println(   "Factura No." + nFactura + "             Fecha: " + java.time.LocalDate.now());
        System.out.println("========================================================================================================================================");
        System.out.println("Cliente: " + cliente.getNombre() + " " + cliente.getId() + " " + cliente.getCel() + " " + cliente.getDireccion());
        System.out.println("========================================================================================================================================");
        System.out.printf( "%-10s %-20s %-10s %-15s %-10s %-15s %-15s\n", "COD", "DESCRIPCION", "CANTIDAD", "V. UNITARIO", "IVA", "IMPUESTO", "TOTAL");
        System.out.println("========================================================================================================================================");
        
        for (DetalleFactura df : detalles) {
            Producto p = df.getProducto();
            System.out.printf("%-10s %-20s %-10d %-15.2f %-10.2f %-15.2f %-15.2f\n",
                p.getCodProducto(), p.getNombre(), p.getCantidad(), p.getValorUnitario(), p.getIva(), p.getImpuesto(), df.getvalorTP());

            totalImpuesto += df.getValorTotalImpuesto();
            totalDescuento += p.getDescuento();
            subtotalFactura += df.getSubtotal();
            totalFactura += df.getValorTotalProducto();
        }
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("Valor Impuesto Total:                                                                 " + totalImpuesto);
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("Descuentos:                                                                           " + totalDescuento);
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("Subtotal:                                                                             " + subtotalFactura);
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("Valor Total:                                                                          " + totalFactura);
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------");

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
  
        System.out.println("======CREACION DE CLIENTE======");

        System.out.print("Ingrese el nombre del cliente: ");
        String nomCliente = scanner.nextLine();
        System.out.print("Ingrese el ID del cliente: ");
        String idCliente = scanner.nextLine();
        System.out.print("Ingrese el celular del cliente: ");
        String celCliente = scanner.nextLine();
        System.out.print("Ingrese la dirección del cliente: ");
        String dirCliente = scanner.nextLine();

        Cliente cliente = new Cliente(nomCliente, idCliente, celCliente, dirCliente);
        Factura factura = new Factura(cliente);
        
        System.out.println("======CREACION DE PRODUCTO======");
        boolean agregarOtroProducto = true;
        while (agregarOtroProducto) {
            System.out.print("Ingrese el nombre del producto: ");
            String nombre = scanner.nextLine();
            System.out.print("Ingrese el código del producto: ");
            String codProducto = scanner.nextLine();
            System.out.print("Ingrese la cantidad del producto: ");
            int cantidad = scanner.nextInt();
            System.out.print("Ingrese el valor unitario del producto: ");
            double valorUnitario = scanner.nextDouble();
            System.out.print("Ingrese el descuento del producto: ");
            double descuento = scanner.nextDouble();


        if (cantidad < 0 || valorUnitario < 0) {
            System.out.println("Error: La cantidad y el valor unitario no pueden ser negativos.");
            scanner.close();
            break;
        }
        Producto producto = new Producto(nombre, codProducto, cantidad, valorUnitario, descuento);
        DetalleFactura detalle = new DetalleFactura(producto);
        factura.agregarDetalle(detalle);
        
        System.out.print("¿Desea agregar otro producto? (si/no): ");
        if (scanner.next().equalsIgnoreCase("no")) {
            agregarOtroProducto = false;
        }

    }

    factura.imprimirFactura();
    scanner.close();

}

}   
