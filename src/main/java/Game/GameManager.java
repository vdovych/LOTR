package Game;


public class GameManager {
    static void fight(Character c1, Character c2){
        Character tmp;
        System.out.println(String.format("%d\n%d\n%s",c1.power,c1.hp,c1.getClass()));
        System.out.println(String.format("%d\n%d\n%s",c2.power,c2.hp,c2.getClass()));
        if(!c1.isAlive()){
            System.out.println("First warrior came dead to the fight!\n");
            return;
        }
        if(!c2.isAlive()){
            System.out.println("Second warrior came dead to the fight!\n");
            return;
        }
        while (true){
            c1.kick(c2);
            if(c2.isAlive()){
                System.out.println(String.format("%s got punched by %s\nCurr stats:\nPower = %d\nHP = %d", c2.getClass(), c1.getClass(),c2.power,c2.hp));
            }
            else {
                System.out.println(String.format("%s is killed by %s", c2.getClass(),c1.getClass()));
                break;
            }
            tmp = c1;
            c1 = c2;
            c2 = tmp;
        }
    }

    public static void main(String[] args) {
        Character c1 = CharacterFactory.createCharacter();
        Character c2 = CharacterFactory.createCharacter();
        GameManager.fight(c1, c2);
    }
}
