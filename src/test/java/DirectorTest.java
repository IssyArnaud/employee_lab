import Management.Director;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DirectorTest{
    Director director;

    @Before
    public void before(){director = new Director("Greg Gregson", "TY 789456 C", 60000.00, "IT", 100000.00);
    }

    @Test
    public void hasName(){assertEquals("Greg Gregson", director.getName());}

    @Test
    public void hasNI(){assertEquals("TY 789456 C", director.getNI());}

    @Test
    public void hasSalary(){assertEquals(60000.00, director.getSalary(), 0.001);}

    @Test
    public void hasDeptName(){assertEquals("IT", director.getDeptName());}

    @Test
    public void canRaiseSalary(){
        director.raiseSalary(5000.00);
        assertEquals(65000.00, director.getSalary(), 0.001);
    }

    @Test
    public void cannotRaiseSalaryByNegative(){
        director.raiseSalary(-5000.00);
        assertEquals(60000.00, director.getSalary(), 0.001);
    }

    @Test
    public void canCalculateBonus(){assertEquals(1200, director.payBonus(), 0.001);}

    @Test
    public void hasBudget(){assertEquals(100000.00, director.getBudget(), 0.001);}

    @Test
    public void canChangeName(){
        director.setName("Gladys");
        assertEquals("Gladys", director.getName());
    }

    @Test
    public void cannotChangeNameToNull(){
        director.setName("");
        assertEquals("Greg Gregson", director.getName());
    }
}