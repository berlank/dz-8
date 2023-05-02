import java.util.ArrayList;
import java.util.List;

public class StudentGroup {
    private Student groupLeader;
    private List<Student> students = new ArrayList<>();
    private List<String> tasks = new ArrayList<>();

    public StudentGroup(Student groupLeader) {
        this.groupLeader = groupLeader;
    }

    public void setGroupLeader(Student groupLeader) {
        this.groupLeader = groupLeader;
    }

    public Student getGroupLeader() {
        return groupLeader;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void removeStudent(Student student) {
        students.remove(student);
    }

    public void renameStudent(Student student, String firstName, String lastName) {
        student.setFirstName(firstName);
        student.setLastName(lastName);
    }

    public void addTask(String task) {
        tasks.add(task);
    }

    public void markTaskAsCompleted(Student student, String task) {
        // find the index of the task and remove it
        int index = tasks.indexOf(task);
        if (index != -1) {
            tasks.remove(index);
        }

        // add the task to the student's completed tasks list
        student.addCompletedTask(task);
    }
}
