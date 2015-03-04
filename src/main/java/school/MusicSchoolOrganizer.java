package school;

import java.util.List;

/**
 * Created by Alex on 03.03.2015.
 */
public interface MusicSchoolOrganizer {
    void addNewStudent(Student student, SchoolClass schoolClass);
    void deleteStudentFromClass(Student student, SchoolClass schoolClass);
    List<Student> getAllStudents();
    List<Student> getAllStudentsFromClass(SchoolClass schoolClass);
    void schedulePerformance(Performance performance);
}
