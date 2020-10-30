package com.company;
//Создать класс Weapon (Оружие), с приватными полями тип оружия и название оружия.
//Создать класс GameEntity (Игровая сущность), выделить все общие поля которые присущи и Боссу и Героям и добавить
// геттеры и сеттеры к ним.
//Создать класс Босса, наследовать его от класса GameEntity и дополнить его полем сложного типа данных Weapon
// (то есть дать оружие боссу). Также добавить геттеры и сеттеры для этого поля.
//В классе Main создать 1 экземпляр босса и задать ему все свойства (значения полям). Затем распечатать всю информацию
// о боссе.
public class Main {

    public static void main(String[] args) {

        Weapon weapon = new Weapon();


        Boss boss = new Boss(700, 50, "Physical");
        weapon.setTypeOfWeapon("Heavy");
        weapon.setNameOfWeapon("Axe");
        System.out.println(boss.getInfo() + " Weapon: " + weapon.getNameOfWeapon() + " Type of Weapon: " +
                weapon.getTypeOfWeapon());

    }
}
