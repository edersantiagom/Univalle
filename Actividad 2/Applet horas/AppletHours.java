import java.awt.Font;
import javax.swing.JSpinner;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SpinnerNumberModel;
import java.awt.event.ActionEvent;

public class AppletHours extends JFrame {

    Integer horas;
    Integer minutos;
    Integer segundos;


    AppletHours () {

        horas = 24;
        minutos = 60;
        segundos = 60;


        JButton calcular;

        JLabel tituloLabel = new JLabel("HORAS, MINUTOS Y SEGUNDOS");
        tituloLabel.setFont(new Font("Times New Roman", Font.BOLD, 15));
        tituloLabel.setBounds(100, 50, 300, 30);

        JLabel diaLabel = new JLabel("Ingrese la cantidad de dias: ");
        diaLabel.setFont(new Font("Times New Roman", Font.BOLD, 15));
        diaLabel.setBounds(50, 100, 200, 30);
        SpinnerNumberModel modelo = new SpinnerNumberModel(0, 0, 100, 1);
        JSpinner spinner = new JSpinner(modelo);
        spinner.setBounds(250, 100, 50, 30);


        JLabel horasLabel = new JLabel("Horas: ");
        horasLabel.setFont(new Font("Times New Roman", Font.BOLD, 15));
        horasLabel.setBounds(50, 200, 75, 30);

        JLabel minutosLabel = new JLabel("Minutos: ");
        minutosLabel.setFont(new Font("Times New Roman", Font.BOLD, 15));
        minutosLabel.setBounds(50, 300, 75, 30);

        JLabel segundosLabel = new JLabel("Segundos: ");
        segundosLabel.setFont(new Font("Times New Roman", Font.BOLD, 15));
        segundosLabel.setBounds(50, 400, 75, 30);

        JLabel anuncioLabel = new JLabel("");
        anuncioLabel.setFont(new Font("Times New Roman", Font.BOLD, 15));
        anuncioLabel.setBounds(150, 200, 75, 30);

        JLabel anuncio1Label = new JLabel("");
        anuncio1Label.setFont(new Font("Times New Roman", Font.BOLD, 15));
        anuncio1Label.setBounds(150, 300, 75, 30);

        JLabel anuncio2Label = new JLabel("");
        anuncio2Label.setFont(new Font("Times New Roman", Font.BOLD, 15));
        anuncio2Label.setBounds(150, 400, 75, 30);

        



        calcular = new JButton("Calcular"); 
        calcular.setBounds(450, 450, 100, 30);
        calcular.setFont(new Font("Times New Roman", Font.BOLD, 15));
        calcular.addActionListener((ActionEvent e) -> {
            int dias = (Integer) spinner.getValue();
            int totalHoras = dias * horas;
            anuncioLabel.setText(String.valueOf(totalHoras));
            anuncio1Label.setText(String.valueOf(dias * horas * minutos));
            anuncio2Label.setText(String.valueOf(dias * horas * minutos * segundos));
        });













        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(600, 600);
        this.add(segundosLabel);
        this.add(minutosLabel);
        this.add(horasLabel);
        this.add(tituloLabel);
        this.add(diaLabel);
        this.add(spinner);
        this.add(calcular);
        this.add(anuncioLabel);
        this.add(anuncio1Label);
        this.add(anuncio2Label);

        this.setVisible(true);


    }

    }




