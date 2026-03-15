package vallegrande.edu.pe.poo_05_cubasruby.view;

import javax.swing.*;
import java.awt.*;

public class view extends JFrame {

    public JTextField pantalla = new JTextField();

    public JButton[] numeros = new JButton[10];

    public JButton suma = new JButton("+");
    public JButton resta = new JButton("-");
    public JButton multi = new JButton("*");
    public JButton div = new JButton("/");
    public JButton igual = new JButton("=");
    public JButton limpiar = new JButton("C");

    JPanel panel = new JPanel();

    Color lila = new Color(255, 255, 255);
    Color lilaOscuro = new Color(170,120,240);
    Color blanco = Color.WHITE;

    public view(){

        setTitle("Calculadora Lila");
        setSize(300,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        pantalla.setFont(new Font("Arial", Font.BOLD, 24));
        pantalla.setHorizontalAlignment(JTextField.RIGHT);
        pantalla.setBackground(blanco);
        pantalla.setForeground(Color.BLACK);

        panel.setLayout(new GridLayout(5,4,5,5));
        panel.setBackground(lila);

        for(int i=0;i<10;i++){
            numeros[i] = new JButton(String.valueOf(i));
            numeros[i].setBackground(blanco);
            numeros[i].setFont(new Font("Arial", Font.BOLD,16));
        }

        JButton[] operaciones = {suma,resta,multi,div,igual,limpiar};

        for(JButton b : operaciones){
            b.setBackground(lilaOscuro);
            b.setForeground(Color.WHITE);
            b.setFont(new Font("Arial",Font.BOLD,16));
        }

        panel.add(numeros[7]);
        panel.add(numeros[8]);
        panel.add(numeros[9]);
        panel.add(div);

        panel.add(numeros[4]);
        panel.add(numeros[5]);
        panel.add(numeros[6]);
        panel.add(multi);

        panel.add(numeros[1]);
        panel.add(numeros[2]);
        panel.add(numeros[3]);
        panel.add(resta);

        panel.add(numeros[0]);
        panel.add(limpiar);
        panel.add(igual);
        panel.add(suma);

        setLayout(new BorderLayout());

        add(pantalla,BorderLayout.NORTH);
        add(panel,BorderLayout.CENTER);

        getContentPane().setBackground(lila);

        setVisible(true);
    }
}