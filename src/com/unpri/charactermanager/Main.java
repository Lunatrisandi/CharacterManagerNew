package com.unpri.charactermanager;

import com.unpri.charactermanager.model.Character;
import com.unpri.charactermanager.model.CharacterManager;
import com.unpri.charactermanager.model.CharacterType;

public class Main {

    public static void main(String[] args) {

        CharacterManager manager = new CharacterManager();

        System.out.println("=== CHARACTER MANAGER ===");

        manager.addCharacter(
                new Character("Naruto", 50, CharacterType.WARRIOR));

        manager.addCharacter(
                new Character("Sasuke", 48, CharacterType.MAGE));

        manager.addCharacter(
                new Character("Kakashi", 60, CharacterType.WARRIOR));

        manager.addCharacter(
                new Character("Legolas", 55, CharacterType.ARCHER));

        System.out.println("\nTotal Character:");
        System.out.println(manager.getTotalCharacters());

        System.out.println("\nCari Character:");
        System.out.println(manager.findByName("Sasuke"));

        System.out.println("\nRata-rata Level:");
        System.out.println(manager.getAverageLevel());

        System.out.println("\nCharacter Warrior:");

        for (Character c :
                manager.findByType(CharacterType.WARRIOR)) {

            System.out.println(c);
        }

        System.out.println("\nCharacter Terkuat:");

        Character strongest =
                manager.findStrongestCharacter();

        if (strongest != null) {
            System.out.println(strongest);
        }

        System.out.println("\nHapus Sasuke:");

        manager.removeCharacter("Sasuke");

        System.out.println(
                "Total setelah hapus: "
                        + manager.getTotalCharacters());
    }
}