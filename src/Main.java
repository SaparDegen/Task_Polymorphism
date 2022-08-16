public class Main {
    public static void main(String[] args) {
        Person[] people = {
                new Dancer(),
                new Programmer(),
                new Singer()
        };

        for (Person p: people) {
            p.walk();
        }

        System.out.println();
        for (Person p: people) {
            walk1(p);
        }
    }
    public static void walk1(Person person) {
        person.walk();
    }
}