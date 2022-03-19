package Projects_Java.Day4.Homework3.entities.concretes;

import Projects_Java.Day4.Homework3.entities.abstracts.Entity;

public class Player extends Entity {
    private String username;
    private String firstName;
    private String lastName;
    private String nationalId;
    private String dateOfBirth;

    public Player(){

    }

    public Player(int id, String username, String firstName, String lastName, String nationalId, String dateOfBirth) {
        super(id);
        this.username = username;
        this.firstName = firstName;
        this.lastName = lastName;
        this.nationalId = nationalId;
        this.dateOfBirth = dateOfBirth;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
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

    public String getNationalId() {
        return nationalId;
    }

    public void setNationalId(String nationalId) {
        this.nationalId = nationalId;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
}
