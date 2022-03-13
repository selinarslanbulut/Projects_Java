package Projects_Java.Day_3.Homework2;

public class Main {
    public static void main(String[] args){
        User user1 = new User(1,"selinarslanbulut","şifre1","Selin","Arslanbulut");
        Student user2= new Student(2,"berkayarslanbulut","şifre2","Berkay","Arslanbulut","Java");
        Instructor user3= new Instructor(3,"engindemiroğ","şifre3","Engin","Demiroğ","Java");

        UserManager userManager= new UserManager();
        StudentManager studentManager= new StudentManager();
        InstructorManager instructorManager= new InstructorManager();
        userManager.add(user1);
    }
}
