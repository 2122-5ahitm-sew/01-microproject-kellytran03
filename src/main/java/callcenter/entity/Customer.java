package callcenter.entity;

public class Customer {

    private Long id;

    private String firstName;

    private String lastName;

    private Call call;

    public Customer(String firstName, String lastName, Call call) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.call = call;
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

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", call=" + call +
                '}';
    }
}
