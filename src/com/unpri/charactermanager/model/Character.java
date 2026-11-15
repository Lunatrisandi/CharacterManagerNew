package com.unpri.charactermanager.model;

public class Character {

    private String name;
    private CharacterType type;
    private int level;
    private int health;
    private int mana;

    // Constructor default
    public Character() {
        this.name = "Unknown";
        this.type = CharacterType.WARRIOR;
        this.level = 1;
        this.health = 100;
        this.mana = 50;
    }

    // Constructor lengkap
    public Character(String name, CharacterType type, int level, int health) {
        this.name = name;
        this.type = type;
        this.level = level;
        this.health = health;
        this.mana = 50;
    }

    // Getter & Setter Name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter & Setter Type
    public CharacterType getType() {
        return type;
    }

    public void setType(CharacterType type) {
        this.type = type;
    }

    // Getter & Setter Level
    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    // Getter & Setter Health
    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    // Getter & Setter Mana
    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        if (mana < 0) {
            throw new IllegalArgumentException("Mana tidak boleh negatif");
        }
        this.mana = mana;
    }

    // Method level up
    public void levelUp() {
        level++;
        health += 20;
        mana += 10;
    }

    // Method isAlive
    public boolean isAlive() {
        return health > 0;
    }

    @Override
    public String toString() {
        return "Character{" +
                "name='" + name + '\'' +
                ", type=" + type +
                ", level=" + level +
                ", health=" + health +
                ", mana=" + mana +
                '}';
    }
}