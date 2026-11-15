package com.unpri.charactermanager.view;

import com.unpri.charactermanager.model.Character;
import com.unpri.charactermanager.model.CharacterManager;

import javax.swing.*;
import java.awt.*;

public class MainWindow extends JFrame {

    private CharacterManager manager;

    public MainWindow() {

        manager = new CharacterManager();

        setTitle("Character Manager");
        setSize(500, 350);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        JLabel title = new JLabel("DAFTAR KARAKTER");
        title.setAlignmentX(Component.CENTER_ALIGNMENT);

        panel.add(title);
        panel.add(Box.createVerticalStrut(15));

        // Tampil dinamis dari loop
        for (Character c : manager.getCharacters()) {

            JLabel lbl = new JLabel(
                    c.getName()
                    + " | Level: "
                    + c.getLevel()
                    + " | Type: "
                    + c.getType());

            panel.add(lbl);
        }

        panel.add(Box.createVerticalStrut(15));

        JLabel avgLabel = new JLabel(
                "Rata-rata Level: "
                + String.format("%.2f", manager.getAverageLevel()));

        panel.add(avgLabel);

        add(panel);
    }
}