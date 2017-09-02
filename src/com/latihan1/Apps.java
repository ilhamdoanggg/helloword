package com.latihan1;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Apps {
    private JButton buttonmsg;
    private JPanel mainJpanel;

    public Apps() {
        buttonmsg.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Hello Word");
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame =  new JFrame("Apps");
        frame.setContentPane(new Apps(). mainJpanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
