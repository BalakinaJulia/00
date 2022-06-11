import java.util.Objects;

public class Student extends Human {
    private String university, faculty, specialty;


    public Student() {
        super();
        this.university = "university";
        this.faculty = "faculty";
        this.specialty = "specialty";
    }

    public Student(String name, String surname, String patronymic, int age, Sex sex, String university, String faculty, String specialty) {
        super(name, surname, patronymic, age, sex);
        setUniversity(university);
        setFaculty(faculty);
        setSpecialty(specialty);
    }

    public Student(String university, String faculty, String major) {
        super();
        setUniversity(university);
        setFaculty(faculty);
        setSpecialty(specialty);
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        if (university == null) throw new IllegalArgumentException("university is null");
        if (university.isEmpty()) throw new IllegalArgumentException("university is empty");
        this.university = university;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        if (faculty == null) throw new IllegalArgumentException("faculty is null");
        if (faculty.isEmpty()) throw new IllegalArgumentException("faculty is empty");
        this.faculty = faculty;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        if (specialty == null) throw new IllegalArgumentException("major is null");
        if (specialty.isEmpty()) throw new IllegalArgumentException("major is empty");
        this.specialty = specialty;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Student student = (Student) o;
        return Objects.equals(university, student.university) && Objects.equals(faculty, student.faculty) && Objects.equals(specialty, student.specialty);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), university, faculty, specialty);
    }

    @Override
    public String toString() {
        return "com.company.Student{" +
                "university='" + university + '\'' +
                ", faculty='" + faculty + '\'' +
                ", specialty='" + specialty + '\'' +
                '}';
    }
}