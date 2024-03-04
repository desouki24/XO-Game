package t;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class GUI extends JFrame {
    public GUI() {
        XO xo = new XO();
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        JPanel panel1= new JPanel();
        JPanel pb1 =new JPanel();
        JPanel pb2 = new JPanel();
        JButton b1,b2;
        JOptionPane.showMessageDialog(null,"X start the game");
        frame.setLayout(new GridLayout(1,2));
        panel.setLayout(new GridLayout(3, 3));
        panel1.setLayout(new GridLayout(2,1));

        b1=new JButton("Restart");

        b1.setForeground(Color.black);
        b1.setFont(new Font("times new roman",Font.BOLD,73));

        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                GUI gui =new GUI();
            }
        });

        b1.setBackground(Color.cyan);
        b1.setOpaque(true);
        b1.setBorder(BorderFactory.createLineBorder(Color.black));
        panel1.add(b1);
        b2=new JButton("End game");
        b2.setForeground(Color.black);
        b2.setFont(new Font("times new roman",Font.BOLD,50));
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        b2.setBackground(Color.cyan);
        b2.setOpaque(true);
        b2.setBorder(BorderFactory.createLineBorder(Color.black));
        panel1.add(b2);
        frame.add(panel1);


        for (int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++) {
                JButton button = new JButton();
                String string = i +  "" + j;
                button.setText("");
                button.setForeground(Color.cyan);
                button.setName(string);
                button.setBackground(Color.black);
                button.setOpaque(true);
                button.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent e) {
                                XO.buttonClicked(button);
                                XO.CheckWinner(button);
                            }
                        });
                button.setFont(new Font("Dialog",Font.BOLD,50));
                button.setBorder(BorderFactory.createLineBorder(Color.cyan));

                panel.add(button);
            }

        frame.add(panel);
        frame.setSize(500,500);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setVisible(true);




    }
}


}