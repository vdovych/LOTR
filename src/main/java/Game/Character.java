package Game;

public abstract class Character {
    protected int power;
    protected int hp;
    public abstract void kick(Character c);
    public boolean isAlive(){
        return hp>0&&power>-1;
    }
    public int getPower(){
        return power;
    }
    public int getHp(){
        return hp;
    }
}
