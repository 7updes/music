package school.API;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import school.API.Student;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Alex on 04.03.2015.
 */
public class SchoolClass {
    @Autowired
    @Qualifier("petra")
    public List<Student> classes = new ArrayList<Student>();




//    @Override
//    public String toString() {
//        StringBuilder strB = new StringBuilder();
//        for(int i = 1;i<=classes.size();i++){
//            strB.append(i).append(" - ").append(classes.get(i-1).getSecondName()).append("\n");
//        }
//
//        return strB.toString();
//    }




    public void print(){
        System.out.println(classes);
    }
}
