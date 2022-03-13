package Projects_Java.Day_3.Homework2;

public class UserManager {
    public void add(User user) {
        System.out.println(user.getUsername() + "isimli kullanıcı eklendi.");
    }
    public void delete(User user) {
        System.out.println(user.getUsername() + "isimli kullanıcı silindi.");
    }
    public void update(User user) {
        System.out.println(user.getUsername() + "isimli kullanıcı güncellendi.");
    }
}
