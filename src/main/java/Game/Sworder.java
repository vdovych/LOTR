package Game;

import java.util.Random;

public abstract class Sworder extends Character {
    protected static int MAX_POWER;
    protected static int MIN_POWER;
    protected static int MAX_HP;
    protected static int MIN_HP;
    public void kick(Character c){
        c.hp -= (new Random().nextInt(power))+1;
    }
    public Sworder(){
        this.power = (new Random().nextInt(MAX_POWER-MIN_POWER))+MIN_POWER;
        this.hp = (new Random().nextInt(MAX_HP-MIN_HP))+MIN_HP;
    }
}
