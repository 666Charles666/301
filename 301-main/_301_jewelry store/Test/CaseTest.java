import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AfterEach;



public class CaseTest {

    private Case case1;
    private Tray tray1;
    private Tray tray2;

    @BeforeEach
    public void setUp() {

        case1 = new Case(10);
        tray1 = new Tray(10,"dim","blue","blue",200,200,case1);
        tray2 = new Tray(10,"dim","blue","blue",200,200,case1);

    }

    @Test

    public void testGenerateCaseNum() {

        char caseNum = case1.getCaseNum();
        assertTrue(caseNum >= 'A' && caseNum <= 'Z');
    }


    @Test

    public void testAddTray() {

        int index1 = case1.addTray(tray1, "wall-mounted", "lit");
        int index2 = case1.addTray(tray2, "wall-mounted", "unlit");


        assertTrue(index1 >= 0 && index1 < case1.getSize());
        assertTrue(index2 >= 0 && index2 < case1.getSize());


        assertEquals("wall-mounted", case1.getType());
        assertEquals("unlit", case1.getLighting());
    }

    @Test

    public void testDisplayHashTable() {

        case1.addTray(tray1, "wall-mounted", "lit");
        case1.addTray(tray2, "floor-mounted", "unlit");


        assertDoesNotThrow(() -> case1.displayHashTable());

    }

    @Test

    public void testHashFunction() {

        int key = tray1.hashCode();
        int index = case1.hashFunction(key);

        assertTrue(index >= 0 && index < case1.getSize());
    }


    @Test

    public void testSetAndGetLightingAndType() {

        case1.setLighting("LED");
        assertEquals("LED", case1.getLighting());

        case1.setType("wall-mounted");
        assertEquals("wall-mounted", case1.getType());
    }


    @Test

    public void testSetAndGetSize() {

        int originalSize = case1.getSize();
        case1.setSize(20);
        assertEquals(20, case1.getSize());
        case1.setSize(originalSize);
    }



}

