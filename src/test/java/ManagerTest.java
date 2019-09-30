import org.junit.Before;
import org.junit.Test;
import staff.management.Manager;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager manager;

    @Before
    public void before(){
        manager = new Manager("Kyle", "AB45123C", 25000, "Codecannae");
    }

    @Test
    public void canGetName(){
        assertEquals("Kyle", manager.getName());
    }

    @Test
    public void canGetNiNo(){
        assertEquals("AB45123C", manager.getNiNo());
    }

    @Test
    public void canGetSalary(){
        assertEquals(25000, manager.getSalary(), 0.1);
    }

    @Test
    public void canRaiseSalary(){
        manager.giveRaise(5000);
        assertEquals(30000, manager.getSalary(), 0);
    }

    @Test
    public void canGetBonus(){
        assertEquals(250, manager.bonus(), 0.1);
    }
}
