import javax.swing.JFrame;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;

public class AppletFact extends JFrame {
    public String cliente;
    public String producto;
    public String producto1;
    public String producto2;
    public Double valorUnitario;
    public Double valorUnitario1;
    public Double valorUnitario2;
    public Double cantidad;
    public Double cantidad1;
    public Double cantidad2;
    public Double vlrTotal;
    public Double vlrTotal1;
    public Double vlrTotal2;
    private Double total;
    private Double total1;
    private Double total2;
    public String anuncio;
    JButton calcular;

    AppletFact() {
        total = 0.0;
        total1 = 0.0;
        total2 = 0.0;
        JLabel tituloLabel = new JLabel("ORDEN DE COMPRA");


        JLabel clienteLabel = new JLabel("Cliente");
        clienteLabel.setBounds(50, 150, 100, 30);
        JTextField clienteField = new JTextField();
        clienteField.setBounds(100, 150, 200, 30);

        JLabel productoLabel = new JLabel("Producto");
        productoLabel.setBounds(50, 200, 100, 30);
        JTextField productoField = new JTextField();
        productoField.setBounds(50, 250, 200, 30);
        JTextField producto1Field = new JTextField();
        producto1Field.setBounds(50, 300, 200, 30);
        JTextField producto2Field = new JTextField();
        producto2Field.setBounds(50, 350, 200, 30);

        JLabel valorUnitarioLabel = new JLabel("Valor Unitario");
        valorUnitarioLabel.setBounds(300, 200, 200, 30);
        JTextField valorUnitarioField = new JTextField();
        valorUnitarioField.setBounds(300, 250, 200, 30);
        JTextField valorUnitario1Field = new JTextField();
        valorUnitario1Field.setBounds(300, 300, 200, 30);
        JTextField valorUnitario2Field = new JTextField();
        valorUnitario2Field.setBounds(300, 350, 200, 30);

        JLabel cantidadLabel = new JLabel("Cantidad");
        cantidadLabel.setBounds(550, 200, 100, 30);
        JTextField cantidadField = new JTextField();
        cantidadField.setBounds(550, 250, 100, 30);
        JTextField cantidad1Field = new JTextField();
        cantidad1Field.setBounds(550, 300, 100, 30);
        JTextField cantidad2Field = new JTextField();
        cantidad2Field.setBounds(550, 350, 100, 30);

        JLabel vlrTotalLabel = new JLabel("Valor Total");
        vlrTotalLabel.setBounds(700, 200, 200, 30);
        JTextField vlrTotalField = new JTextField();
        vlrTotalField.setBounds(700, 250, 200, 30);
        JTextField vlrTotal1Field = new JTextField();
        vlrTotal1Field.setBounds(700, 300, 200, 30);
        JTextField vlrTotal2Field = new JTextField();
        vlrTotal2Field.setBounds(700, 350, 200, 30);

        JLabel totalLabel = new JLabel("Total");
        totalLabel.setBounds(700, 400, 200, 30);
        JTextField totalField = new JTextField();
        totalField.setBounds(700, 450, 200, 30);

        JLabel anuncioLabel = new JLabel("");
        anuncioLabel.setBounds(50, 500, 400, 30);


        calcular = new JButton("Calcular");
        calcular.setBounds(700, 600, 90, 30);
        calcular.addActionListener(e -> System.out.println("Has presionado calcular"));
        calcular.setFont(new Font("Times New Roman", Font.BOLD, 15));
        calcular.addActionListener((ActionEvent e) -> {
            Double valorUnitario = Double.parseDouble(valorUnitarioField.getText());
            Double cantidad = Double.parseDouble(cantidadField.getText());
            Double total = valorUnitario * cantidad;
            this.total = total;
            vlrTotalField.setText(String.valueOf(total));

            Double valorUnitario1 = Double.parseDouble(valorUnitario1Field.getText());
            Double cantidad1 = Double.parseDouble(cantidad1Field.getText());
            Double total1 = valorUnitario1 * cantidad1;
            this.total1 = total1;
            vlrTotal1Field.setText(String.valueOf(total1));

            Double valorUnitario2 = Double.parseDouble(valorUnitario2Field.getText());
            Double cantidad2 = Double.parseDouble(cantidad2Field.getText());
            Double total2 = valorUnitario2 * cantidad2;
            this.total2 = total2;
            vlrTotal2Field.setText(String.valueOf(total2));

            totalField.setText(String.valueOf(this.total + this.total1 + this.total2));

            anuncioLabel.setText("Sr(a) " + clienteField.getText() + " el total de su compra es: " + totalField.getText());
            anuncioLabel.setBounds(50, 500, 400, 30);


        });


        


        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(1200, 700);
        this.setTitle("Interfaz Gráfica de Applet");
        this.add(clienteLabel);
        this.add(clienteField);
        this.add(productoLabel);
        this.add(productoField);
        this.add(producto1Field);
        this.add(producto2Field);
        this.add(valorUnitarioLabel);
        this.add(valorUnitarioField);
        this.add(valorUnitario1Field);
        this.add(valorUnitario2Field);
        this.add(cantidadLabel);
        this.add(cantidadField);
        this.add(cantidad1Field);
        this.add(cantidad2Field);
        this.add(vlrTotalLabel);
        this.add(vlrTotalField);
        this.add(vlrTotal1Field);
        this.add(vlrTotal2Field);
        this.add(calcular);
        this.add(tituloLabel);
        this.add(totalLabel);
        this.add(totalField);
        this.add(anuncioLabel);

        this.setVisible(true);
        

        
    }


}



