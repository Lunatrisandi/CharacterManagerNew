package com.unpri.charactermanager.model;

import java.util.ArrayList;
import java.util.List;

public class CharacterManager {

    private ArrayList<Character> characters;

    public CharacterManager() {
        characters = new ArrayList<>();
    }

    public boolean addCharacter(Character character) {

        if (characters.contains(character)) {
            return false;
        }

        characters.add(character);
        return true;
    }

    public Character findByName(String name) {

        for (Character c : characters) {
            if (c.getName().equalsIgnoreCase(name)) {
                return c;
            }
        }

        return null;
    }

    public boolean removeCharacter(String name) {

        Character c = findByName(name);

        if (c != null) {
            characters.remove(c);
            return true;
        }

        return false;
    }

    public int getTotalCharacters() {
        return characters.size();
    }

    public List<Character> getAllCharacters() {
        return new ArrayList<>(characters);
    }
}