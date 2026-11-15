package com.unpri.charactermanager.view;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.*;

import com.unpri.charactermanager.model.Character;
import com.unpri.charactermanager.model.CharacterManager;
import com.unpri.charactermanager.model.CharacterType;

public class MainWindow extends JFrame {

    private CharacterManager manager;

    private JPanel listPanel;

    private JTextField txtNama;
    private JTextField txtLevel;

    private JComboBox<CharacterType> cmbType;

    private JLabel lblAverage;

    public MainWindow(CharacterManager manager) {

        this.manager = manager;

        setTitle("Character Manager");
        setSize(600, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        initializeComponents();
        refreshData();
    }

    private void initializeComponents() {

        JPanel inputPanel = new JPanel();

        txtNama = new JTextField(10);
        txtLevel = new JTextField(5);

        cmbType = new JComboBox<>(CharacterType.values());

        JButton btnTambah = new JButton("Tambah Character");

        inputPanel.add(new JLabel("Nama"));
        inputPanel.add(txtNama);

        inputPanel.add(new JLabel("Level"));
        inputPanel.add(txtLevel);

        inputPanel.add(new JLabel("Type"));
        inputPanel.add(cmbType);

        inputPanel.add(btnTambah);

        add(inputPanel, BorderLayout.NORTH);

        listPanel = new JPanel();
        listPanel.setLayout(new GridLayout(0, 1));

        add(new JScrollPane(listPanel), BorderLayout.CENTER);

        lblAverage = new JLabel();
        add(lblAverage, BorderLayout.SOUTH);

        btnTambah.addActionListener(e -> tambahCharacter());
    }

    private void tambahCharacter() {

        try {

            String nama = txtNama.getText();

            int level = Integer.parseInt(
                    txtLevel.getText());

            CharacterType type =
                    (CharacterType) cmbType.getSelectedItem();

            boolean berhasil =
                    manager.addCharacter(
                            new Character(
                                    nama,
                                    level,
                                    type));

            if (berhasil) {

                txtNama.setText("");
                txtLevel.setText("");

                refreshData();

            } else {

                JOptionPane.showMessageDialog(
                        this,
                        "Character sudah ada!");
            }

        } catch (NumberFormatException ex) {

            JOptionPane.showMessageDialog(
                    this,
                    "Level harus berupa angka!");
        }
    }

    private void refreshData() {

        listPanel.removeAll();

        for (Character c : manager.getAllCharacters()) {

            JLabel lbl = new JLabel(
                    c.getName()
                    + " | Level: "
                    + c.getLevel()
                    + " | Type: "
                    + c.getType());

            listPanel.add(lbl);
        }

        lblAverage.setText(
                "Rata-rata Level : "
                + String.format("%.2f",
                        manager.getAverageLevel()));

        listPanel.revalidate();
        listPanel.repaint();
    }
}