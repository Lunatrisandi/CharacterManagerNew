package com.unpri.charactermanager.model;

import java.util.ArrayList;

public class CharacterManager {

    private ArrayList<Character> characters;

    public CharacterManager() {

        characters = new ArrayList<>();

        characters.add(new Character("Naruto", 50, CharacterType.WARRIOR));
        characters.add(new Character("Sasuke", 55, CharacterType.MAGE));
        characters.add(new Character("Sakura", 48, CharacterType.ARCHER));

        // tambahan 2 karakter baru
        characters.add(new Character("Kakashi", 70, CharacterType.WARRIOR));
        characters.add(new Character("Hinata", 45, CharacterType.ARCHER));
    }

    public ArrayList<Character> getCharacters() {
        return characters;
    }

    public double getAverageLevel() {

        int total = 0;

        for(Character c : characters){
            total += c.getLevel();
        }

        return (double) total / characters.size();
    }
}