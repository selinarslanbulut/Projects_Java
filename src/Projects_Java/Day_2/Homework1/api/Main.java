package Projects_Java.Day_2.Homework1.api;


import Projects_Java.Day_2.Homework1.Course;
import Projects_Java.Day_2.Homework1.CourseManager;


public class Main {
    public static void main(String[] args){
        Course course1 = new Course(1,"Javascript", "Engin Demiroğ", 0);
        Course course2 = new Course(2,"C# + Angular", "Engin Demiroğ", 35);
        Course course3 = new Course(3,"JAVA + React", "Engin Demiroğ", 31);
        Course course4 = new Course(4,"Programlamaya Giriş İçin Temel Kurs", "Engin Demiroğ", 67);

        Course[] courses = {course1,course2,course3,course4};
        for(Course course : courses){
            System.out.println(course.id+" "+course.name+" "+ course.teacher+" "+ course.progress);
        }
        CourseManager courseManager = new CourseManager();
        courseManager.addToCourse(course1);
        courseManager.deleteToCourse(course2);
    }
}
