package com.unpri.charactermanager;

import com.unpri.charactermanager.model.Character;
import com.unpri.charactermanager.model.CharacterType;

public class Main {

    public static void main(String[] args) {

        Character c1 = new Character(
                "Arthur",
                CharacterType.WARRIOR,
                1,
                100);

        Character c2 = new Character(
                "Merlin",
                CharacterType.MAGE,
                2,
                80);

        Character c3 = new Character(
                "Robin",
                CharacterType.ARCHER,
                3,
                90);

        System.out.println("=== DAFTAR KARAKTER ===");
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);

        System.out.println("\n=== DEMO LEVEL UP ===");
        System.out.println("Sebelum level up:");
        System.out.println(c1);

        c1.levelUp();

        System.out.println("Setelah level up:");
        System.out.println(c1);

        System.out.println("\n=== DEMO MANA & ISALIVE ===");

        Character c4 = new Character(
                "Shadow",
                CharacterType.ASSASSIN,
                5,
                120);

        c4.setMana(200);

        System.out.println(c4);
        System.out.println("Mana : " + c4.getMana());
        System.out.println("Is Alive : " + c4.isAlive());
    }
}