package callcenter.entity;

public class Call {
    private Long id;

    private Customer customer;

    private List<Employee> employees;

    public Call(Customer customer, Employee employee) {
        this.customer = customer;
        this.employee = employee;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    @Override
    public String toString() {
        return "Call{" +
                "id=" + id +
                ", customer=" + customer +
                ", employee=" + employee +
                '}';
    }
}
