package school.Impl;

import school.API.MusicSchoolOrganizer;
import school.API.Performance;
import school.API.SchoolClass;
import school.API.Student;

import java.util.List;

/**
 * Created by Alex on 05.03.2015.
 */
public class Organizer implements MusicSchoolOrganizer {




    @Override
    public void addNewStudent(Student student, SchoolClass schoolClass) {
        schoolClass.classes.add(student);
    }

    @Override
    public void deleteStudentFromClass(Student student, SchoolClass schoolClass) {

    }

    @Override
    public List<Student> getAllStudents() {
        return null;
    }

    @Override
    public List<Student> getAllStudentsFromClass(SchoolClass schoolClass) {
        return null;
    }

    @Override
    public void schedulePerformance(Performance performance) {

    }


}
