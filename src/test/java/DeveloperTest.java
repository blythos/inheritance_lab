import org.junit.Before;
import org.junit.Test;
import staff.Employee;
import staff.techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    Developer developer;

    @Before
    public void before(){
        developer = new Developer("Stephen", "MN201043D", 45000);
    }

    @Test
    public void canGetName(){
        assertEquals("Stephen", developer.getName());
    }

    @Test
    public void canGetNiNo(){
        assertEquals("MN201043D", developer.getNiNo());
    }

    @Test
    public void canGetSalary(){
        assertEquals(45000, developer.getSalary(), 0.1);
    }

    @Test
    public void canRaiseSalary(){
        developer.giveRaise(5000);
        assertEquals(50000, developer.getSalary(), 0);
    }

    @Test
    public void canGetBonus(){
        assertEquals(450, developer.bonus(), 0.1);
    }

}
