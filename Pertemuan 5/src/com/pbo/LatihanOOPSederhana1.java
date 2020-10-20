package com.pbo;

    //Player
    class Player {
        String name;
        double health;
        int level;

        Weapon weapon;
        Armor armor;

    Player(String name, double health) {
        this.name= name;
        this.health= health;
    }
        void attack(Player opponent) {
            double attackPower= this.weapon.attackPower;
            System.out.println(this.name + " Attacking " + opponent.name + " With Power " + attackPower);
            opponent.defense(attackPower);
    }
        void defense(double attackPower) {
            double damage;
            if (this.armor.defensePower<attackPower) {
                damage=attackPower -  this.armor.defensePower;
        }   else {
                damage=0;
        }
            this.health -= damage;
            System.out.println(this.name + " Got Damage " + damage + "\n");
    }
        void equipWeapon(Weapon weapon) {
            this.weapon= weapon;
    }
        void equipArmor(Armor armor) {
            this.armor= armor;
    }
        void display(){
            System.out.println("Name= " + this.name);
            System.out.println("Health= " + this.health + " HP");
            this.weapon.display();
            this.armor.display();
    }
}
    //Weapon
    class Weapon {
        double attackPower;
        String name;
        Weapon(String name, double attackPower) {
            this.name= name;
            this.attackPower= attackPower;
    }
        void display(){
            System.out.println("Weapon= " + this.name + " , Attack= " + this.attackPower);
    }
}
    //Armour
    class Armor {
        double defensePower;
        String name;
        Armor(String name, double defensePower) {
            this.name= name;
            this.defensePower= defensePower;
    }
        void display() {
            System.out.println("Armorr= " + this.name + " , Defense= " + this.defensePower + "\n");
    }
}
public class LatihanOOPSederhana1 {

    public static void main(String[] args) {

        Player player1= new Player("Yanto", 100);
        Player player2= new Player("Entis", 80);
        Weapon Shocksword= new Weapon("Shocksword", 30);
        Weapon anumaAlias= new Weapon("Anuma Alias", 60);
        Armor teslaArmor= new Armor("Rugged Leather Armor", 40);
        Armor leatherArmor= new Armor("Leather Armor", 20);

        player1.equipWeapon(Shocksword);
        player2.equipWeapon(anumaAlias);
        player1.equipArmor(teslaArmor);
        player2.equipArmor(leatherArmor);
        player1.display();
        player2.display();

        System.out.println("\n==== Call Of Duty ====");
        System.out.println("\nStage- 1");
        player1.attack(player2);
        player1.display();
        player2.display();
        System.out.println("\nStage- 2");
        player2.attack(player1);
        player1.display();
        player2.display();
    }
}