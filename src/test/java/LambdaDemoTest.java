import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import java.util.Optional;


public class LambdaDemoTest {
    @Test
    public void test1() {
        String str = "string";
        int expected = str.length();
        Assertions.assertEquals(expected, LambdaDemo.getLength.apply(str));
    }

    @Test
    public void test2_1() {
        String str = "string";
        char firstChar = 's';
        Assertions.assertEquals(firstChar, LambdaDemo.getFirstSymbol.apply(str));

    }

    @Test
    public void test2_2() {
        String str = "";
        Assertions.assertNull(LambdaDemo.getFirstSymbol.apply(str));
    }

    @Test
    public void test3_1() {
        String str = "string";
        Assertions.assertTrue(LambdaDemo.checkingForGaps.apply(str));
    }

    @Test
    public void test3_2() {
        String str = "s t r i n g";
        Assertions.assertFalse(LambdaDemo.checkingForGaps.apply(str));
    }

    @Test
    public void test4_1() {
        String str = "It,is,string";
        int expected = 3;
        Assertions.assertEquals(expected, LambdaDemo.getCount.apply(str));

    }

    @Test
    public void test4_2() {
        String str = "string";
        int expected = 1;
        Assertions.assertEquals(expected,LambdaDemo.getCount.apply(str));
    }

    @Test
    public void test5_1() {
        Human human = new Human();
        int exp = human.getAge();
        int act = LambdaDemo.getAge.apply(human);
        Assertions.assertEquals(exp, act);
    }

    @Test
    public void test5_2() {
        Student student = new Student();
        int exp = student.getAge();
        int act = LambdaDemo.getAge1.apply(student);
        Assertions.assertEquals(exp, act);
    }

    @Test
    public void test6_1() {
        Human h1 = new Human();
        Human h2 = new Human();
        Assertions.assertTrue(LambdaDemo.identicalSurnames.test(h1, h2));
    }

    @Test
    public void test6_2() {
        Human h1 = new Human("Julia", "Balakina", "Alekseevna", 20, Sex.NOT_STATED);
        Human h2 = new Human();
        Assertions.assertFalse(LambdaDemo.identicalSurnames.test(h1, h2));
    }

    @Test
    public void test6_3() {
        Student s1 = new Student();
        Student s2 = new Student();
        Assertions.assertTrue(LambdaDemo.identicalSurnames1.test(s1,s2));
    }

    @Test
    public void test6_4() {
        Student s1 = new Student("Olga", "Belozerova", "Igorevna", 20, Sex.NOT_STATED,
                "university", "faculty", "major");
        Student s2 = new Student();
        Assertions.assertFalse(LambdaDemo.identicalSurnames1.test(s1, s2));
    }

    @Test
    public void test7() {
        Human human = new Human();
        String expected = human.getName() + " " + human.getSurname() + " " + human.getPatronymic();
        Assertions.assertEquals(expected, LambdaDemo.oneLine.apply(human));
    }
    @Test
    public void test7_1() {
        Student student = new Student();
        String expected = student.getName() + " " + student.getSurname() + " " + student.getPatronymic();
        Assertions.assertEquals(expected, LambdaDemo.oneLine1.apply(student));
    }

    @Test
    public void test8() {
        Human expected = new Human();
        Human human = new Human();
        int humanAge = expected.getAge();
        expected.setAge(humanAge + 1);
        Assertions.assertEquals(expected, LambdaDemo.getOlder.apply(human));
    }

    @Test
    public void test9_1() {
        Human h = new Human();
        Human h1 = new Human();
        Human h2 = new Human();
        int maxAge = h.getAge() + 100;
        Assertions.assertTrue(LambdaDemo.humansYoungerMaxAge.test(h,h1,h2,maxAge));

    }

    @Test
    public void test9_2() {
        Human h1 = new Human();
        Human h2 = new Human();
        Human h3 = new Human();
        int maxAge = h1.getAge() - 100;
        Assertions.assertFalse(LambdaDemo.humansYoungerMaxAge.test(h1, h2, h3, maxAge));
    }
}

