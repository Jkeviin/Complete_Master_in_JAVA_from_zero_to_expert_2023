public class DiferenciaPasarPorValorYReferencia {
    public static void main(String[] args) {
        int x = 10;
        changeValue(x);
        System.out.println("x = " + x); // x = 10

        Person p = new Person("John");
        changePerson(p);
        System.out.println("p.name = " + p.name); // p.name = Michael
    }

    public static void changeValue(int value) {
        value = 20;
    }

    public static void changePerson(Person person) {
        person.name = "Michael";
    }
}

class Person {
    String name;
    public Person(String name) {
        this.name = name;
    }
}
