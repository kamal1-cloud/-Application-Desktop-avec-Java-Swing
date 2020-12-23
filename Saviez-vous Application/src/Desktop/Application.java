package Desktop;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;


public class Application extends JFrame implements ActionListener{
    JFrame frame;
    JPanel panel;
    JLabel label;
    JLabel label2;
    JButton button;

    public Application() {

        frame = new JFrame();
        label = new JLabel("Le saviez-vous");
        label2 = new JLabel("La biére fait pas prendre du ventre");

        label.setBounds(25,20,200,40);
        label2.setBounds(25,200,200,40);

        button = new JButton("MONTRER UN AUTRE FAIT");
        button.setFont(new Font("Verdana",Font.BOLD,15));
        button.setBounds(20,400,450,40);
        button.addActionListener(this);

        panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(25,25,25,25));
        panel.setLayout(null);

        panel.add(label);
        panel.add(label2);
        panel.add(button);
        panel.setBackground(new Color(123,50,250));


        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Le saviez-vous");
        frame.setSize(500,500);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

    }
    Random r = new Random();
    @Override
    public void actionPerformed(ActionEvent e) {
    // if (e.getSource()==button){
         label2.setText("Etre amoureux vous rend fainéant");
         label2.setFont(new Font("Comic Sans MS",Font.PLAIN,19));
         Color c = new Color(r.nextInt(256),r.nextInt(256),r.nextInt(256),r.nextInt(256));
         panel.setBackground(c);

       //  button.setBounds(20,400,450,40);


     //}
    }
}
