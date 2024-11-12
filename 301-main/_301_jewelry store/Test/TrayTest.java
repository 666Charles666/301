import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AfterEach;
public class TrayTest {

    private Tray tray;
    private Jewellery jewellery1;
    private Jewellery jewellery2;
    private Case caseInstance;

    @BeforeEach
    public void setUp() {

        caseInstance = new Case(10);
        tray = new Tray(10, "golden", "steel", "red", 15, 10, caseInstance);
        jewellery1 = new Jewellery();
        jewellery2 = new Jewellery();

    }





    @Test
    public void testDisplay() {

        tray.add(jewellery1);
        tray.add(jewellery2);
        assertDoesNotThrow(() -> tray.display());

    }

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
