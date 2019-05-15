import dealership.components.Engine;
import dealership.customers.Customer;
import dealership.vehicles.Vehicle;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CustomerTest {

    Customer customer;
    Vehicle vehicle;
    Engine engine;

    @Before
    public void before(){
        engine = new Engine(1.8, 100);
        customer = new Customer(18, 100.00);
//        vehicle = new Vehicle("Toyota", 100, engine);
    }

    @Test
    public void hasAge(){
        assertEquals(18, customer.getAge());
    }

    @Test
    public void hasMoney(){
        assertEquals(100.00, customer.getMoney(), 0.01);
    }

    @Test
    public void startsWithNoVehicle(){
        assertEquals(null, customer.getVehicle());
    }

    @Test
    public void canSetMoney(){
        customer.setMoney(150.00);
        assertEquals(150.00, customer.getMoney(), 0.01);
    }

    @Test
    public void canSetVehicle(){
        customer.setVehicle(vehicle);
        assertEquals(vehicle, customer.getVehicle());
    }
}
