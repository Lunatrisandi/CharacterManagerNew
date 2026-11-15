package com.unpri.charactermanager;

import com.unpri.charactermanager.model.Character;
import com.unpri.charactermanager.model.CharacterManager;

public class Main {

    public static void main(String[] args) {

        CharacterManager manager = new CharacterManager();

        System.out.println(
                manager.addCharacter(new Character("Naruto", 50))
        );

        System.out.println(
                manager.addCharacter(new Character("Sasuke", 48))
        );

        System.out.println(
                manager.addCharacter(new Character("Naruto", 70))
        );

        System.out.println("Total Character : "
                + manager.getTotalCharacters());

        System.out.println(
                manager.findByName("Sasuke")
        );

        manager.removeCharacter("Sasuke");

        System.out.println("Total setelah hapus : "
                + manager.getTotalCharacters());
    }
}