import com.epam.homeTask1.Biker.Biker;
import com.epam.homeTask1.Equipment.Elements.Chest;
import com.epam.homeTask1.Equipment.Equipment;
import com.epam.homeTask1.Equipment.Elements.Feet;
import com.epam.homeTask1.Equipment.Elements.Helmet;
import com.epam.homeTask1.Methods.Methods;
import com.epam.homeTask1.Methods.MethodsImpl;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.junit.*;
import org.junit.BeforeClass;


import java.util.*;


import static junit.framework.TestCase.assertEquals;
import static org.hamcrest.Matchers.*;
import static org.hamcrest.MatcherAssert.assertThat;



public class TestApplication {

    private static final Logger log = Logger.getLogger(TestApplication.class);

    private static Biker biker = new Biker();
    private Methods methods = new MethodsImpl();
    private List<Equipment> equip = biker.getEquip();
    private double min=10.0;
    private double max = 20.0;


    @BeforeClass
    public static void initData(){
        biker.addEquipment(new Helmet("Dragon Helmet", 15, 1.25));
        biker.addEquipment(new Chest("Dragon Chest", 34.2, 5.11));
        biker.addEquipment(new Feet("Dragon Feet", 20.5, 3.15));
        BasicConfigurator.configure();
    }
    @Test
    public void testSum()throws Exception{
        log.info("Сумма всех элементов экипировки:" + methods.FullPrice(equip));
        assertEquals(69.7, methods.FullPrice(equip));


    }

    @Test
    public void testAddition(){
        List<Equipment> expected = new ArrayList<>(List.of(
                new Chest("Dragon Chest", 34.2, 5.11),
                new Feet("Dragon Feet", 20.5, 3.15),
                new Helmet("Dragon Helmet", 15, 1.25)
                ));

       assertThat(expected, containsInAnyOrder(equip.toArray()));
    }

    @Test
    public void testSort(){
        List<Equipment> expected = new ArrayList<>(List.of(
                new Chest("Dragon Chest", 34.2, 5.11),
                new Feet("Dragon Feet", 20.5, 3.15),
                new Helmet("Dragon Helmet", 15, 1.25)
        ));


        List<Equipment> actual = methods.sort(equip);
      log.info("Отсортированный список:\n" + actual);

        assertEquals(expected,actual);

    }

    @Test
    public void testFindByCriteria(){
        List<Equipment> list1 = new ArrayList<>(List.of(
                new Chest("Dragon Chest", 34.2, 5.11),
                new Feet("Dragon Feet", 20.5, 3.15),
                new Helmet("Dragon Helmet", 15, 1.25)
        ));

        List<Equipment> expected = methods.findByCriteria(list1,min,max);
        List<Equipment> actual = methods.findByCriteria(equip,min,max);
        assertThat(expected, containsInAnyOrder(actual.toArray()));
    }
}
