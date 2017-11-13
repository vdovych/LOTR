package Game;

public abstract class Character {
    protected int power;
    protected int hp;
    public abstract void kick(Character c);
    public boolean isAlive(){
        return hp>0;
    }
}
