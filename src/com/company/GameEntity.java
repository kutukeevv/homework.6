package com.company;

public class GameEntity {
    private int health;
    private int damage;
    private String typeOfDamage;

    public GameEntity(){

    }

    public GameEntity(int health, int damage, String typeOfDamage){
        this.health = health;
        this.damage = damage;
        this.typeOfDamage = typeOfDamage;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public String getTypeOfDamage() {
        return typeOfDamage;
    }

    public void setTypeOfDamage(String typeOfDamage) {
        this.typeOfDamage = typeOfDamage;
    }

    public String getInfo(){
        return "Health: " + getHealth() + " Damage: " + getDamage() + " Type of Damage: " + getTypeOfDamage();
    }
}
