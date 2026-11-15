package com.unpri.charactermanager;

import javax.swing.SwingUtilities;

import com.unpri.charactermanager.model.Character;
import com.unpri.charactermanager.model.CharacterManager;
import com.unpri.charactermanager.model.CharacterType;
import com.unpri.charactermanager.view.MainWindow;

public class Main {

    public static void main(String[] args) {

        SwingUtilities.invokeLater(() -> {

            CharacterManager manager =
                    new CharacterManager();

            manager.addCharacter(
                    new Character(
                            "Naruto",
                            50,
                            CharacterType.WARRIOR));

            manager.addCharacter(
                    new Character(
                            "Sasuke",
                            48,
                            CharacterType.MAGE));

            manager.addCharacter(
                    new Character(
                            "Kakashi",
                            60,
                            CharacterType.WARRIOR));

            manager.addCharacter(
                    new Character(
                            "Legolas",
                            55,
                            CharacterType.ARCHER));

            manager.addCharacter(
                    new Character(
                            "Itachi",
                            70,
                            CharacterType.MAGE));

            MainWindow window =
                    new MainWindow(manager);

            window.setVisible(true);
        });
    }
}