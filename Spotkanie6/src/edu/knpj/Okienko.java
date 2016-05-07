package edu.knpj;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by andrew, tomek and michaś on 05.05.2016.
 */
public class Okienko extends JFrame implements ActionListener{

    private JLabel jLabel;

    public Okienko(){
//        LayoutManager layoutManager = new GridLayout(1, 8); // rozne sposoby inicjalizacji managera, albo szerzej obiektow.
        setLayout(new GridLayout(8, 1));

        ButtonGroup bg = new ButtonGroup();
        JRadioButton rb1 = new JRadioButton("1");
        rb1.addActionListener(this);
        JRadioButton rb2 = new JRadioButton("2");
        rb2.addActionListener(this);
        JRadioButton rb3 = new JRadioButton("3");
        rb3.addActionListener(this);
        bg.add(rb1);
        bg.add(rb2);
        bg.add(rb3);

        add(rb1);
        add(rb2);
        add(rb3);

        jLabel = new JLabel("Pokaz wynik");
        add(jLabel);
        JButton hej = new JButton("Kliknij");



        hej.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (rb1.isSelected()){
                    jLabel.setText("Wynik: 1");
                } else if (rb2.isSelected()){
                    jLabel.setText("Wynik: 2");
                } else if (rb3.isSelected()){
                    jLabel.setText("Wynik: 3");
                } else {
                    jLabel.setText("Sciema");
                }
            }
        });



        add(hej);

        //  3 potrzebne metody!
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        pack();
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String actionCmd = e.getActionCommand();
        jLabel.setText(actionCmd);
    }
}
