package Game;

public class Hobbit extends Character {
    public void kick(Character c){
            toCry();
            }
    private void toCry(){
            System.out.println("Que que que");
            }
    Hobbit(){
        this.power = 0;
        this.hp = 3;
    }
}