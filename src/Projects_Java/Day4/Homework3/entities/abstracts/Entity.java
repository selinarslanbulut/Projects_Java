package Projects_Java.Day4.Homework3.entities.abstracts;

public class Entity {
    private int id;

    public Entity(int id) {
        this.id = id;
    }
    public Entity(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
