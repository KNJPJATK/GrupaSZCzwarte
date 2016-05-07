package edu.knpj;

import javax.swing.*;
import java.awt.*;

/**
 * Created by andrew on 05.05.2016.
 */v
public class Okienko6 extends JFrame{

    public Okienko6(){
        setLayout(new BorderLayout());

        //  south
        JPanel southPanel = new JPanel(new GridLayout(1, 4));
        southPanel.add(new JButton("05"));
        southPanel.add(new JButton("06"));
        southPanel.add(new JButton("07"));
        southPanel.add(new JButton("08"));
        add(southPanel,BorderLayout.SOUTH);

        //  center
        JPanel centerPanel = new JPanel(new GridLayout(1, 2));

        JPanel leftPanel = new JPanel(new GridLayout(3, 1));
        leftPanel.add(new JTextField("JTextField 1"));
        leftPanel.add(new JTextField("JTextField 2"));
        leftPanel.add(new JTextField("JTextField 3"));
        centerPanel.add(leftPanel, BorderLayout.EAST);
        JPanel northPanel = new JPanel(new GridLayout(1, 4));
        northPanel.add(new JButton("01"));
        northPanel.add(new JButton("02"));
        northPanel.add(new JButton("03"));
        northPanel.add(new JButton("04"));
        centerPanel.add(northPanel,BorderLayout.NORTH);

        //  west
        JPanel westPanel = new JPanel();
        westPanel.add(new JTextArea());

        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        pack();
        setVisible(true);
    }
}
