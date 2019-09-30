package staff;

public abstract class Employee {

    private String name;
    private String niNo;
    private double salary;

    public Employee(String name, String niNo, double salary){
        this.name = name;
        this.niNo = niNo;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getNiNo() {
        return niNo;
    }

    public double getSalary() {
        return salary;
    }

    public void giveRaise(double raise) {
        if (raise >= 0){
            salary += raise;
        }
    }

    public double bonus() {
        return salary * 0.01;
    }
}
