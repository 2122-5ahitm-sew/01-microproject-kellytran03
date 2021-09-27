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


}

