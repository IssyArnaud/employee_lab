package Management;

public class Director extends Manager{

    private double budget;
    public Director(String name, String NI, double salary, String deptName, double budget) {
        super(name, NI, salary, deptName);
        this.budget = budget;
    }

    public double getBudget() {
        return budget;
    }

    public double payBonus(){
        return (this.getSalary() / 100) * 2;
    }
}
