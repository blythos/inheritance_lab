import org.junit.Before;
import org.junit.Test;
import staff.Employee;
import staff.techStaff.DatabaseAdmin;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {

    DatabaseAdmin admin;

    @Before
    public void before(){
        admin = new DatabaseAdmin("Billy", "JK40205T", 27000);
    }

    @Test
    public void canGetName(){
        assertEquals("Billy", admin.getName());
    }

    @Test
    public void canGetNiNo(){
        assertEquals("JK40205T", admin.getNiNo());
    }

    @Test
    public void canGetSalary(){
        assertEquals(27000, admin.getSalary(), 0.1);
    }

    @Test
    public void canRaiseSalary(){
        admin.giveRaise(5000);
        assertEquals(32000, admin.getSalary(), 0);
    }

    @Test
    public void canGetBonus(){
        assertEquals(270, admin.bonus(), 0.1);
    }
}
