package Game;

import java.util.Random;
public class CharacterFactory {
    public static Character createCharacter(){
        switch (new Random().nextInt(4)){
            case 0:return new Hobbit();
            case 1:return new Elf();
            case 2:return new King();
            case 3:return new Knight();
        }
        return null;
    }
}
