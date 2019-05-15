import dealership.Damage;
import dealership.components.Engine;
import dealership.vehicles.Diesel;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DieselTest {

    Diesel diesel;
    Engine engine;

    @Before
    public void before(){
        engine = new Engine(1.2, 100);
        diesel = new Diesel("Polo", 10, engine);
    }

    @Test
    public void hasMake(){
        assertEquals("Polo", diesel.getMake());
    }

    @Test
    public void hasPrice(){
        assertEquals(10, diesel.getPrice());
    }

    @Test
    public void hasEngine(){
        assertEquals(engine, diesel.getEngine());
    }

    @Test
    public void startsWithNullDamage(){
        assertEquals(null, diesel.getDamage());
    }

    @Test
    public void canSetDamage(){
        diesel.setDamage(Damage.LIGHT);
        assertEquals(Damage.LIGHT, diesel.getDamage());
    }

    @Test
    public void checkRentable(){
        assertEquals(false, diesel.isRentable());
    }

    @Test
    public void canSetRentable(){
        diesel.setRentable(true);
        assertEquals(true, diesel.isRentable());
    }

    @Test
    public void checkPurchasable(){
        assertEquals(false, diesel.isPurchasable());
    }

    @Test
    public void canSetPurchasable(){
        diesel.setPurchasable(true);
        assertEquals(true, diesel.isPurchasable());
    }
}
