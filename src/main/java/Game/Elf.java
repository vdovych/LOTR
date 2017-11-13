package Game;

public class Elf extends Character {
    public void kick(Character c){
        if(c.power< this.power){
            c.hp = 0;
        }
        else {
            c.power--;
        }
    }
    Elf(){
        this.power = 10;
        this.hp = 10;
    }
}