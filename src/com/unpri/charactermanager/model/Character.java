package com.unpri.charactermanager.model;

import java.util.Objects;

public class Character {

    private String name;
    private int level;

    public Character(String name, int level) {
        this.name = name;
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    @Override
    public boolean equals(Object obj) {

        if (this == obj) {
            return true;
        }

        if (!(obj instanceof Character)) {
            return false;
        }

        Character other = (Character) obj;

        return Objects.equals(this.name, other.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "Character{name='" + name + "', level=" + level + "}";
    }
}