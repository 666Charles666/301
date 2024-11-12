import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AfterEach;
public class JewelleryTest {

    private Jewellery jewellery;
    private Components component1;
    private Components component2;

    @BeforeEach
    public void setUp() {

        jewellery = new Jewellery();
        component1 = new Components("Brick","well-doing","110kg","high quality");
        component2 = new Components("Gold", "poor doing", "1g","low quailty");

    }


    @Test
    public void testJewelleryDetails() {

        jewellery.setDescription("a good looking one");
        jewellery.setType("golden pig");
        jewellery.setTargetGender("Female");
        jewellery.setImage("www.gp.com");
        jewellery.setRetailPrice("10000000$");


        assertEquals("a good looking one", jewellery.getDescription());
        assertEquals("golden pig", jewellery.getType());
        assertEquals("Female", jewellery.getTargetGender());
        assertEquals("www.gp.com", jewellery.getImage());
        assertEquals("10000000$", jewellery.getRetailPrice());
    }

    @Test
    public void testIDGeneration() {

        int initialID = jewellery.getID();
        Jewellery anotherJewellery = new Jewellery();
        assertNotEquals(initialID, anotherJewellery.getID());

    }


}
