import Management.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTest {
    Manager manager;

    @Before
    public void before() {
        manager = new Manager("Bob Robertson", "QQ 123456 C", 50000.00, "IT");
    }

    @Test
    public void hasName() {
        assertEquals("Bob Robertson", manager.getName());
    }

    @Test
    public void hasNI() {
        assertEquals("QQ 123456 C", manager.getNI());
    }

    @Test
    public void hasSalary() {
        assertEquals(50000.00, manager.getSalary(), 0.001);
    }

    @Test
    public void hasDeptName() {
        assertEquals("IT", manager.getDeptName());
    }

    @Test
    public void canRaiseSalary() {
        manager.raiseSalary(5000.00);
        assertEquals(55000.00, manager.getSalary(), 0.001);
    }

    @Test
    public void cannotRaiseSalaryByNegative() {
        manager.raiseSalary(-5000.00);
        assertEquals(50000.00, manager.getSalary(), 0.001);
    }

    @Test
    public void canCalculateBonus() {
        assertEquals(500, manager.payBonus(), 0.001);
    }

    @Test
    public void canChangeName(){
        manager.setName("Gladys");
        assertEquals("Gladys", manager.getName());
    }

    @Test
    public void cannotChangeNameToNull(){
        manager.setName("");
        assertEquals("Bob Robertson", manager.getName());
    }

}