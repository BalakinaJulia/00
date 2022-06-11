import java.util.function.BiPredicate;
import java.util.function.Function;

public class LambdaDemo {
    public static final Function<String, Integer> getLength = String::length;//1
    public static final Function<String, Character> getFirstSymbol = str -> {
        Character res = null;//2
        if (str.isEmpty()) {
        } else res = str.charAt(0);
        return res;
    };

    public static final Function<String, Boolean> checkingForGaps = str ->
            str != null && str.equals(str.replace(" ", ""));//3
    public static final Function<String, Integer> getCount = str -> {
        if (str == null || str.isEmpty()) throw new IllegalArgumentException("str is null or empty");//4
        int count = 1;
        for (char elem : str.toCharArray()) {
            if (elem == ',')
                count++;
        }
        return count;
    };

    public static final Function<Human, Integer> getAge = Human::getAge;//5
    public static final BiPredicate<Human, Human> identicalSurnames = (h1, h2) -> {//6
        if (h1 == null) throw new IllegalArgumentException("h1 is null ");
        if (h2 == null) throw new IllegalArgumentException("h2 is null ");
        return (h1.getSurname().equals(h2.getSurname()));
    };
    public static final Function<Human, String> oneLine = h -> {//7
        if (h == null) throw new IllegalArgumentException("h is null");
        return h.getName() + " " + h.getSurname() + " " + h.getPatronymic();
    };
    public static final Function<Human, Human> getOlder = h -> {//8
        if (h == null) throw new IllegalArgumentException("h is null");
        Human human = new Human(h.getName(), h.getSurname(), h.getPatronymic(), h.getAge() + 1, h.getSex());
        return human;
    };
    public static final BiPredicate<Human, Integer> humanYounger = (h, maxAge) -> {//9
        if (h == null) throw new IllegalArgumentException("h is null");
        return h.getAge() < maxAge;
    };
    public static final IHumansYounger <Human, Human,Human,Integer,Boolean> humansYoungerMaxAge = (h,h1,h2, maxAge) ->
        humanYounger.test(h,maxAge) && humanYounger.test(h1, maxAge) && humanYounger.test(h2, maxAge);
    public static final Function<Student, Integer> getAge1 = Human::getAge;//5 для студентов
    public static final BiPredicate<Student, Student> identicalSurnames1 = (s1, s2) -> {//6 для студентов
        if (s1 == null) throw new IllegalArgumentException("s1 is null ");
        if (s2 == null) throw new IllegalArgumentException("s2 is null ");
        return (s1.getSurname().equals(s2.getSurname()));
    };
    public static final Function<Student, String> oneLine1 = h -> {//7 для студентов
        if (h == null) throw new IllegalArgumentException("h is null");
        return h.getName() + " " + h.getSurname() + " " + h.getPatronymic();
    };

}





