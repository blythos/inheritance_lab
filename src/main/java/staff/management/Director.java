package staff.management;

public class Director extends Manager {

    private double budget;

    public Director(String name, String niNo, double salary, String deptName, double budget) {
        super(name, niNo, salary, deptName);
        this.budget = budget;
    }

    public double getBudget() {
        return budget;
    }

    public double bonus() {
        return super.getSalary() * 0.02;
    }
}
