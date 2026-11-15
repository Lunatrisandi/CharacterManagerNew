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

        for (Character character : characters) {

            if (character.getName().equalsIgnoreCase(name)) {
                return character;
            }

        }

        return null;
    }

    public boolean removeCharacter(String name) {

        Character character = findByName(name);

        if (character != null) {
            characters.remove(character);
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

    public double getAverageLevel() {

        if (characters.isEmpty()) {
            return 0;
        }

        int total = 0;

        for (Character character : characters) {
            total += character.getLevel();
        }

        return (double) total / characters.size();
    }

    public ArrayList<Character> findByType(CharacterType type) {

        ArrayList<Character> result = new ArrayList<>();

        for (Character character : characters) {

            if (character.getType() == type) {
                result.add(character);
            }

        }

        return result;
    }

    /**
     * Mengembalikan character dengan level tertinggi.
     */
    public Character findStrongestCharacter() {

        if (characters.isEmpty()) {
            return null;
        }

        Character strongest = characters.get(0);

        for (Character character : characters) {

            if (character.getLevel() > strongest.getLevel()) {
                strongest = character;
            }

        }

        return strongest;
    }
}