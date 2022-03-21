package Projects_Java.Day_5.Homework1.entities.concretes;

import Projects_Java.Day_5.Homework1.entities.abstracts.User;

public class Customer extends User {
    private String firstName;
    private String lastName;

    public Customer(){

    }

    public Customer(int id, String email, String password, String firstName) {
        super(id, email, password);
        this.firstName = firstName;
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
}
