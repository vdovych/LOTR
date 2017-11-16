import Game.Character;
import Game.*;
import static org.junit.Assert.*;
import org.junit.Test;

public class GameTest {
    @Test
    public void TestCharacters() {
        Character hobbit = new Hobbit();
        Character elf = new Elf();
        assertEquals(3, hobbit.getHp());
        assertEquals(0,hobbit.getPower());
        assertEquals(10,elf.getHp());
        assertEquals(10,elf.getPower());
        for (int i = 0; i < 100; i++) {
            Character king = new King();
            Character knight = new Knight();
            assertTrue(king.getHp()<=15&&king.getHp()>=5);
            assertTrue(king.getPower()<=15&&king.getPower()>=5);
            assertTrue(knight.getHp()<=15&&knight.getHp()>=5);
            assertTrue(knight.getPower()<=15&&knight.getPower()>=5);
        }
    }
    @Test
    public void TestKicks(){
        for (int i = 0; i < 50; i++) {
            Character c1 = CharacterFactory.createCharacter();
            Character c2 = CharacterFactory.createCharacter();
            GameManager.fight(c1, c2);
        }
    }

}
