import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AfterEach;


    //create different environment to test
public class TrayTest {

    private Tray tray;
    private Jewellery jewellery1;
    private Jewellery jewellery2;
    private Case caseInstance;


    //set up the test environment before every begining of each test
    @BeforeEach
    public void setUp() {

        caseInstance = new Case(10);
        tray = new Tray(10, "golden", "steel", "red", 15, 10, caseInstance);
        jewellery1 = new Jewellery();
        jewellery2 = new Jewellery();

    }


    //test the display
    @Test
    public void testDisplay() {

        tray.add(jewellery1);
        tray.add(jewellery2);
        //if there is error occured,fail the test
        assertDoesNotThrow(() -> tray.display());

    }
    //test the geting and setting
    @Test
    public void testGetAndSetAttributes() {

        tray.setInlay("crowd");
        assertEquals("crowd", tray.getInlay());

        tray.setMaterial("chicken");
        assertEquals("chicken", tray.getMaterial());

        tray.setColor("blue");
        assertEquals("blue", tray.getColor());

        tray.setLength(200000);
        assertEquals(200000, tray.getLength());

        tray.setWidth(10000);
        assertEquals(10000, tray.getWidth());

    }

    //test the generation of id
    //make sure it is generateed
    @Test
    public void testTrayIDGeneration() {

        String trayID = tray.getTrayID();
        assertNotNull(trayID);


    }

    @Test

    public void testSize() {
        assertEquals(10, tray.getSize());
    }

}
