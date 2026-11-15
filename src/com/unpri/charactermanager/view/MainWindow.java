package com.unpri.charactermanager.view;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import com.unpri.charactermanager.model.CharacterManager;

public class MainWindow extends JFrame {

    private CharacterManager manager;

    public MainWindow(CharacterManager manager) {

        this.manager = manager;

        setTitle("Character Manager");
        setSize(600, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        initializeComponents();
    }

    private void initializeComponents() {

        setLayout(new BorderLayout());

        JLabel titleLabel = new JLabel(
                "DAFTAR KARAKTER",
                SwingConstants.CENTER);

        add(titleLabel, BorderLayout.NORTH);

        JLabel contentLabel = new JLabel(
                "Total Character : "
                + manager.getTotalCharacters(),
                SwingConstants.CENTER);

        add(contentLabel, BorderLayout.CENTER);
    }
}