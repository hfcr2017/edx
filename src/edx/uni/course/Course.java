package edx.uni.course;

import java.util.Date;
import java.util.List;

public class Course {
    public String title;
//    public Lecturer lecturer;
    public List<Date> dates;
//    public List<Student> attendees;

    public static void main(String[] args) {
        Course exercise = new Course("SEECx");
        exercise.printCourseTitle();
    }

    public Course (String title){
        this.title = title;
    }

    public void printCourseTitle() {
        System.out.println(title);
    }

}
