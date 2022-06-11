import java.util.Objects;

public class Human {
    private String name, surname, patronymic;
    private int age;
    private Sex sex;


    public Human() {
        this.name = "name";
        this.surname = "surname";
        this.patronymic = "patronymic";
        this.age = 21;
        this.sex = Sex.NOT_STATED;

    }

    public Human(String name, String surname, String patronymic, int age, Sex sex) {
        setName(name);
        setSurname(surname);
        setPatronymic(patronymic);
        setAge(age);
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null) throw new IllegalArgumentException("name is null");
        if (name.isEmpty()) throw new IllegalArgumentException("name is empty");
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        if (surname == null) throw new IllegalArgumentException("surname is null");
        if (surname.isEmpty()) throw new IllegalArgumentException("surname is empty");
        this.surname = surname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        if (patronymic == null) throw new IllegalArgumentException("patronymic is null");
        if (patronymic.isEmpty()) throw new IllegalArgumentException("patronymic is empty");
        this.patronymic = patronymic;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0 && age > 150) throw new IllegalArgumentException("age can't be < 0 or > 150");
        this.age = age;

    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return age == human.age && Objects.equals(name, human.name) && Objects.equals(surname, human.surname)
                && Objects.equals(patronymic, human.patronymic) && sex == human.sex;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, patronymic, age, sex);
    }

    @Override
    public String toString() {
        return "com.company.Human{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                '}';
    }
}