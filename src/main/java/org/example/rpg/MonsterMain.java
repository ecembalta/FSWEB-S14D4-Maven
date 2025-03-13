package org.example.rpg;

public class MonsterMain {
    public static void main(String[] args) {
        Monster troll = new Troll("Troll" , 25, 97);

        System.out.println(troll.getDamage());
        System.out.println(troll.attack());
    }
}
