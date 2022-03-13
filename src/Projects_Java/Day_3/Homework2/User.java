package Projects_Java.Day_3.Homework2;

public class User {
    private int id;
    private String username;
    private String password;
    private String firstName;
    private String lastName;

    public User(){

    }
    public User(int id, String username, String password,String firstName, String lastName){
        this.id=id;
        this.username=username;
        this.password=password;
        this.firstName=firstName;
        this.lastName=lastName;
    }

    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}
