import TechStaff.Developer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeveloperTest{
    Developer developer;

    @Before
    public void before(){developer = new Developer("David Davidson", "QW 123654 C", 40000.00);
    }

    @Test
    public void hasName(){assertEquals("David Davidson", developer.getName());}

    @Test
    public void hasNI(){assertEquals("QW 123654 C", developer.getNI());}

    @Test
    public void hasSalary(){assertEquals(40000.00, developer.getSalary(), 0.001);}

    @Test
    public void canRaiseSalary(){
        developer.raiseSalary(5000.00);
        assertEquals(45000.00, developer.getSalary(), 0.001);
    }

    @Test
    public void cannotRaiseSalaryByNegative(){
        developer.raiseSalary(-5000.00);
        assertEquals(40000.00, developer.getSalary(), 0.001);
    }

    @Test
    public void canCalculateBonus(){assertEquals(400, developer.payBonus(), 0.001);}

    @Test
    public void canChangeName(){
        developer.setName("Gladys");
        assertEquals("Gladys", developer.getName());
    }

    @Test
    public void cannotChangeNameToNull(){
        developer.setName("");
        assertEquals("David Davidson", developer.getName());
    }

}
