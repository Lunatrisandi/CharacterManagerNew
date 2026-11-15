package com.unpri.charactermanager;

import javax.swing.SwingUtilities;

import com.unpri.charactermanager.model.Character;
import com.unpri.charactermanager.model.CharacterManager;
import com.unpri.charactermanager.model.CharacterType;
import com.unpri.charactermanager.view.MainWindow;

public class Main {

    public static void main(String[] args) {

        CharacterManager manager = new CharacterManager();

        manager.addCharacter(
                new Character("Naruto", 50, CharacterType.WARRIOR));

        manager.addCharacter(
                new Character("Sasuke", 55, CharacterType.MAGE));

        manager.addCharacter(
                new Character("Sakura", 48, CharacterType.ARCHER));

        manager.addCharacter(
                new Character("Kakashi", 70, CharacterType.WARRIOR));

        manager.addCharacter(
                new Character("Hinata", 45, CharacterType.ARCHER));

        manager.addCharacter(
                new Character("Itachi", 80, CharacterType.MAGE));

        manager.addCharacter(
                new Character("Goku", 99, CharacterType.WARRIOR));

        manager.addCharacter(
                new Character("Vegeta", 95, CharacterType.WARRIOR));

        SwingUtilities.invokeLater(() -> {

            MainWindow window =
                    new MainWindow(manager);

            window.setVisible(true);
        });
    }
}