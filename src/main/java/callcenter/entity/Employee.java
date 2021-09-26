package callcenter.entity;

public class Employee {

    private Long id;

    private String firstName;

    private String lastName;

    private Call call;

    private Department department;

    public Employee(String firstName, String lastName, Call call, Department department) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.call = call;
        this.department = department;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Call getCall() {
        return call;
    }

    public void setCall(Call call) {
        this.call = call;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", call=" + call +
                ", department=" + department +
                '}';
    }
}
