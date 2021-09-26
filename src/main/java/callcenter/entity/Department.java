package callcenter.entity;

public class Department {

    private String departmentName;

    private Employee employee;

    private HeadOfDepartment headOfDepartment;

    public Department(String departmentName, Employee employee, HeadOfDepartment headOfDepartment) {
        this.departmentName = departmentName;
        this.employee = employee;
        this.headOfDepartment = headOfDepartment;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public HeadOfDepartment getHeadOfDepartment() {
        return headOfDepartment;
    }

    public void setHeadOfDepartment(HeadOfDepartment headOfDepartment) {
        this.headOfDepartment = headOfDepartment;
    }

    @Override
    public String toString() {
        return "Department{" +
                "departmentName='" + departmentName + '\'' +
                ", employee=" + employee +
                ", headOfDepartment=" + headOfDepartment +
                '}';
    }
}

