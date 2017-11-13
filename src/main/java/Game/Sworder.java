package Game;

import java.util.Random;

public abstract class Sworder extends Character {
    public void kick(Character c){
        c.hp -= (new Random().nextInt(power))+1;
    }
    Sworder(int MAX_POWER, int MAX_HP, int MIN_POWER, int MIN_HP){
        this.power = (new Random().nextInt((MAX_POWER-MIN_POWER)))+MIN_POWER;
        this.hp = (new Random().nextInt((MAX_HP-MIN_HP)))+MIN_HP;
    }
}
