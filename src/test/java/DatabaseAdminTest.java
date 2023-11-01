import TechStaff.DatabaseAdmin;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest{
    DatabaseAdmin databaseAdmin;

    @Before
    public void before(){databaseAdmin = new DatabaseAdmin("Evan Evans", "ER 321654 C", 30000.00);
    }

    @Test
    public void hasName(){assertEquals("Evan Evans", databaseAdmin.getName());}

    @Test
    public void hasNI(){assertEquals("ER 321654 C", databaseAdmin.getNI());}

    @Test
    public void hasSalary(){assertEquals(30000.00, databaseAdmin.getSalary(), 0.001);}

    @Test
    public void canRaiseSalary(){
        databaseAdmin.raiseSalary(5000.00);
        assertEquals(35000.00, databaseAdmin.getSalary(), 0.001);
    }

    @Test
    public void cannotRaiseSalaryByNegative(){
        databaseAdmin.raiseSalary(-5000.00);
        assertEquals(30000.00, databaseAdmin.getSalary(), 0.001);
    }

    @Test
    public void canCalculateBonus(){assertEquals(300, databaseAdmin.payBonus(), 0.001);}

    @Test
    public void canChangeName(){
        databaseAdmin.setName("Gladys");
        assertEquals("Gladys", databaseAdmin.getName());
    }

    @Test
    public void cannotChangeNameToNull(){
        databaseAdmin.setName("");
        assertEquals("Evan Evans", databaseAdmin.getName());
    }
}
