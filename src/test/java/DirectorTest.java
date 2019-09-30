import org.junit.Before;
import org.junit.Test;
import staff.Employee;
import staff.management.Director;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    private Director director;

    @Before
    public void before(){
        director = new Director("Kev", "BA60606D", 120000, "Codeclan", 120000000);
    }

    @Test
    public void canGetName(){
        assertEquals("Kev", director.getName());
    }

    @Test
    public void canGetNiNo(){
        assertEquals("BA60606D", director.getNiNo());
    }

    @Test
    public void canGetSalary(){
        assertEquals(120000, director.getSalary(), 0.1);
    }

    @Test
    public void canRaiseSalary(){
        director.giveRaise(15000);
        assertEquals(135000, director.getSalary(), 0);
    }

    @Test
    public void canGetBonus(){
        assertEquals(1200, director.bonus(), 0.1);
    }

    @Test
    public void canGetBudget() {
        assertEquals(120000000, director.getBudget(), 0.1);
    }

    @Test
    public void cannotGiveNegativeRaise(){
        director.giveRaise(-300000);
        assertEquals(120000, director.getSalary(), 0.1);
    }

    @Test
    public void cannotGiveIncorrectNameType__isNull(){
        director.setName(null);
        assertEquals("Kev", director.getName());
    }

    @Test
    public void cannotGiveIncorrectNameType__isEmptyString(){
        director.setName("");
        assertEquals("Kev", director.getName());
    }

    @Test
    public void canSetName(){
        director.setName("Kyle");
        assertEquals("Kyle", director.getName());
    }
}
