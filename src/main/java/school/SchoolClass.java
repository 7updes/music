package school;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Alex on 04.03.2015.
 */
public class SchoolClass {
    List<Student> classes = new ArrayList<Student>();



    @Override
    public String toString() {
        StringBuilder strB = new StringBuilder();
        for(int i = 1;i<=classes.size();i++){
            strB.append(i).append(" - ").append(classes.get(i-1).getSecondName()).append("\n");
        }

        return strB.toString();
    }
}
