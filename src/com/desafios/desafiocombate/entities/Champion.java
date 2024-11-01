package com.desafios.desafiocombate.entities;

public class Champion {
    private String name;
    private int life;
    private int attack;
    private int armor;

    public Champion() {
    }

    public Champion(String name, int life, int attack, int armor) {
        this.name = name;
        this.life = life;
        this.attack = attack;
        this.armor = armor;
    }

    // Getters e Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        this.life = life;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getArmor() {
        return armor;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    // Método para calcular dano recebido
    public void takeDamage(Champion opponent) {
        int damage = Math.max(opponent.getAttack() - this.armor, 1); // Garante dano mínimo de 1
        this.life = Math.max(this.life - damage, 0); // Garante que a vida não fique negativa
    }

    // Método para exibir o status atual do campeão
    public String status() {
        return this.name + ": " + this.life + " de vida";
    }

    @Override
    public String toString() {
        return "Champion{" +
                "name='" + name + '\'' +
                ", life=" + life +
                ", attack=" + attack +
                ", armor=" + armor +
                '}';
    }
}