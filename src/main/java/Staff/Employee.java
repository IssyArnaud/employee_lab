package Staff;

public abstract class Employee {
    private String name;
    private String NI;
    private double salary;

    public Employee(String name, String NI, double salary){
        this.name = name;
        this.NI = NI;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getNI() {
        return NI;
    }

    public double getSalary() {
        return salary;
    }

    public void setName(String name) {
        if (name != null && !name.equals("")) {
            this.name = name;
        }
    }

    public void raiseSalary(double salaryIncrease){
        if (salaryIncrease > 0) {
            this.salary += salaryIncrease;
        }
    }

    public double payBonus(){
        return this.salary / 100;
    }
}
