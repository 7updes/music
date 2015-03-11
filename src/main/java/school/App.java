package school;

import school.API.SchoolClass;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import school.API.Student;
import school.Impl.Organizer;

/**
 * Created by Alex on 05.03.2015.
 */
public class App {
    public static void main(String[] args) {
//        Student sasha = new Student("Denysov", "Sasha");
//        Student stepa = new Student("Denysov", "Stepan");
//        Student igor = new Student("Denysov", "igor");
//        SchoolClass first = new SchoolClass();
//        Organizer organizer = new Organizer();
//        organizer.addNewStudent(sasha, first);
//        organizer.addNewStudent(stepa, first);
//        organizer.addNewStudent(igor, first);
//        System.out.println(first.toString());
//
//        SchoolClass second = new SchoolClass();
//        Student yura = new Student("Denysov", "yura");
//        Student yula = new Student("Denysov", "yula");
//        organizer.addNewStudent(yura, second);
//        organizer.addNewStudent(yula, second);
//        System.out.println(second.toString());

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationCtx.xml");
        SchoolClass third = context.getBean(SchoolClass.class);
        third.print();




    }
}
