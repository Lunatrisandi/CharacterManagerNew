package com.unpri.charactermanager.model;

public class Character {

    private String name;
    private int level;
    private CharacterType type;

    public Character(String name, int level, CharacterType type) {
        this.name = name;
        this.level = level;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public int getLevel() {
        return level;
    }

    public CharacterType getType() {
        return type;
    }
}