import javax.swing.JFrame;
import java.awt.Font;
import javax.swing.JOptionPane;
import javax.swing.JButton;


public class Ejercicio1 extends JFrame {
    public String usuario;     
    public String contrasena;
    JButton atrás;
    JButton ingresar;
    JButton seguir;
    Ejercicio1() {

        atrás = new JButton("Atrás");
        atrás.setBounds(50, 200, 90, 30);
        atrás.addActionListener(e -> System.out.println("Has presionado atrás"));
        atrás.setFont(new Font("Times New Roman", Font.BOLD, 15));
        ingresar = new JButton("Ingresar");
        ingresar.setBounds(170, 200, 110, 30);
        ingresar.setFont(new Font("Times New Roman", Font.BOLD, 15));
        ingresar.addActionListener(e -> {
         this.usuario = JOptionPane.showInputDialog("Ingrese su nombre de usuario: ");
         this.contrasena = JOptionPane.showInputDialog("Ingrese su contraseña: ");
         System.out.println("Usuario: " + this.usuario);
         System.out.println("Contraseña: " + this.contrasena);
        });
        seguir = new JButton("Seguir");
        seguir.setBounds(310, 200, 90, 30);
        seguir.addActionListener(e -> System.out.println("Has presionado seguir"));
        seguir.setFont(new Font("Times New Roman", Font.BOLD, 15));

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(500, 500);
        this.setTitle("SERVICIO NACIONAL DE APRENDIZAJE SENA");
        this.add(atrás);
        this.add(ingresar);
        this.add(seguir);

        this.setVisible(true);
    }

    }

