package staff.management;

import staff.Employee;

public class Manager extends Employee {

    private String deptName;

    public Manager(String name, String niNo, double salary, String deptName) {
        super(name, niNo, salary);
        this.deptName = deptName;
    }

    public String getDeptName() {
        return deptName;
    }
}
