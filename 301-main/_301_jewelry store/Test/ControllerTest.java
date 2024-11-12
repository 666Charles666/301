import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AfterEach;


class ControllerTest {
    Controller controller1 ;
    Controller controller2;
    Controller controller3;
    JewelleryShop jewelleryShop1;
    JewelleryShop jewelleryShop2;
    JewelleryShop jewelleryShop3;




    @BeforeEach
    public void setUp() {


        jewelleryShop1 = new JewelleryShop(10);
        jewelleryShop2 = new JewelleryShop(10);
        jewelleryShop3 = new JewelleryShop(10);

        controller1 = new Controller(jewelleryShop1);
        controller2 = new Controller(jewelleryShop2);
        controller3 = new Controller(jewelleryShop3);
        controller1.addCase(10,"wall-mounted","lit");
        controller3.addCase(10,"wall-mounted","unlit");



    }
    @AfterEach
    public void tearDown() {
        controller1 = null;
        controller2 = null;
        controller3 = null;

        jewelleryShop1 = null;
        jewelleryShop2 = null;
        jewelleryShop3 = null;
    }

    @Test
    public void testAddTrayWithCaseNum() {
        String output1 = controller1.addTray('A');
        String output2 = controller2.addTray('A');
        String output3 = controller3.addTray('B');

        controller2.addTray('A');
        controller3.addTray('B');

        assertEquals("Tray added successfully to case " + 'A',output1);
        assertEquals("This case Num is invalid.", output2);
        assertEquals("Tray added successfully to case " + 'B',output3);
    }
    @Test
    public void testDeleteJewellery(){
        controller1.addTray('A');
        controller1.addJewellery('A',"01","Starry","wall-mounted","male","www.picture.com","1000$");

        boolean output1 = controller1.deleteJewellery("A011");
        boolean output2 = controller1.deleteJewellery("A012");

        assertTrue(output1);
        assertFalse(output2);
    }
    @Test
    public void testAddTrayWithDes(){
        String output1 = controller1.addTray('A',10,"stone","Steel","blue",20,20,"wall-mounted","LED");
        String output2 = controller2.addTray('O',20,"stone","Steel","blue",50,3,"mounted","High");
        String output3 = controller1.addTray('U',10,"Casew","Gold","red",200,220,"wall-mounted","Cold");

        assertEquals("Add a new tray to the index case successfully"+'A',output1);
        assertEquals("this index is invalid",output2);
        assertEquals("this index is invalid",output3);
    }
    @Test
    public void testAddjewellery(){
        controller1.addTray('A',10,"stone","Steel","blue",20,20,"wall-mounted","LED");

        String output1 = controller1.addJewellery('A',"01","GOODLOOKING","dimond","female","www.icu.com","1000000$");
        String output2 = controller2.addJewellery('B',"01","GOODLOOKING","dimond","female","www.icu.com","1000000$");
        String output3 = controller3.addJewellery('B',"02","GOODLOOKING","dimond","female","www.icu.com","1000000$");

        assertEquals("Jewellery is success to add this Tray" + "A1",output1);
        assertEquals("Case with this ID does not exist.",output2);
        assertEquals("Tray with this ID does not exist.",output3);
    }
    @Test
    public void testAddComponent(){
        controller1.addTray('A');
        controller1.addJewellery('A',"01","Starry","wall-mounted","male","www.picture.com","1000$");

        String output1 = controller1.addComponents("B011","steel","LOOKSGOOD","10kg","HIGHQUALITY");
        String output2 = controller1.addComponents("B016","steel","LOOKSGOOD","10kg","HIGHQUALITY");

        assertEquals("Component added successfully to Jewellery with the id : " + "A011",output1);
        assertEquals("Can't find Jewellery with this id.",output2);
    }
    @Test
    public void testJewellerySearchById(){
        controller1.addTray('A');
        controller1.addJewellery('A',"1","Starry","wall-mounted","male","www.picture.com","1000$");












    }
}
