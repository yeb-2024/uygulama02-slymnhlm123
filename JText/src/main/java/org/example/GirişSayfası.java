package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GirişSayfası implements ActionListener
{
    JFrame frame = new JFrame();
    JTextField kullanıcı = new JTextField();

    JTextField sifre = new JTextField();

    JButton button = new JButton("Gönder");


    public  GirişSayfası()
    {
        JPanel panelust = new JPanel();
        panelust.setLayout(new FlowLayout());


        JLabel üstlabel = new JLabel("Kullanıcı Adı");
        kullanıcı.setPreferredSize(new Dimension(200,40));

        JPanel panelorta = new JPanel();
        panelust.setLayout(new FlowLayout());


        JLabel ortalabel = new JLabel("Şifre");
        sifre.setPreferredSize(new Dimension(200,40));

        JPanel altpanel = new JPanel();
        altpanel.setLayout(new FlowLayout());
        altpanel.add(button);

        button.addActionListener(this);

        panelust.add(üstlabel);
        panelust.add(kullanıcı);

        panelorta.add(ortalabel);
        panelorta.add(sifre);

        frame.setTitle("Giriş Sayfası");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,300);
        frame.setLayout(new GridLayout(3,1));

        frame.add(panelust);
        frame.add(panelorta);
        frame.add(altpanel);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
