package application;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class app {
    private JButton button_message;
    private JPanel panelmain;

    public app() {
        button_message.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "hello , i'm sudarshan");
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame= new JFrame("app");
        frame.setContentPane(new app().panelmain);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}

